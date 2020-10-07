package pl.pitera.command.example.workshop.command;


import pl.pitera.command.example.workshop.Robot;

public class RobotTurnOffCommand implements Command {

    private Robot robot;

    public RobotTurnOffCommand(Robot robot) {
        this.robot = robot;
    }

    public void execute() {
        robot.turnOff();
    }
}
