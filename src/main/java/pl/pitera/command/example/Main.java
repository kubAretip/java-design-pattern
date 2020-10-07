package pl.pitera.command.example;


import pl.pitera.command.example.workshop.Robot;
import pl.pitera.command.example.workshop.WorkshopApp;
import pl.pitera.command.example.workshop.command.RobotCutCommand;
import pl.pitera.command.example.workshop.command.RobotDrillCommand;
import pl.pitera.command.example.workshop.command.RobotTurnOffCommand;

public class Main {

    public static void main(String[] args) {

        Robot robot = new Robot();

        WorkshopApp workshopApp = new WorkshopApp();

        workshopApp.addToQue(new RobotTurnOffCommand(robot));
        workshopApp.addToQue(new RobotCutCommand(robot));
        workshopApp.addToQue(new RobotDrillCommand(robot));
        workshopApp.addToQue(new RobotTurnOffCommand(robot));

        workshopApp.run();

        workshopApp.run();


    }

}
