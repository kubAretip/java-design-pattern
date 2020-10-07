package pl.pitera.command.example.workshop.command;

import pl.pitera.command.example.workshop.Robot;

public class RobotCutCommand implements Command {

    private Robot robot;

    public RobotCutCommand(Robot robot) {
        this.robot = robot;
    }

    public void execute() {
        robot.cut();
    }


}
