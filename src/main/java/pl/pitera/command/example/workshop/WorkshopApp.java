package pl.pitera.command.example.workshop;

import pl.pitera.command.example.workshop.command.Command;

import java.util.ArrayList;
import java.util.List;

public class WorkshopApp {

    private List<Command> commandQue = new ArrayList<>();

    public void addToQue(Command command) {
        commandQue.add(command);
    }

    public void run() {
        if (!commandQue.isEmpty())
            commandQue.forEach(Command::execute);
        else
            System.out.println("Kolejka nie zawiera żadnych komend");

        commandQue.clear();
    }

}
