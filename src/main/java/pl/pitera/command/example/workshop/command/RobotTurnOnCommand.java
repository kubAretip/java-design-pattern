package pl.pitera.command.example.workshop.command;

import pl.pitera.command.example.workshop.Robot;

class RobotTurnOnCommand implements Command{

    private Robot robot;

    public RobotTurnOnCommand(Robot robot) {
        this.robot = robot;
    }

    @Override
    public void execute() {
        robot.turnOn();
    }
}
