package pl.pitera.command.example.workshop.command;

class CoffeeMakerTurnOffCommand implements Command {
    private CoffeeMaker coffeeMaker;

    public CoffeeMakerTurnOffCommand(CoffeeMaker coffeeMaker) {
        this.coffeeMaker = coffeeMaker;
    }

    @Override
    public void execute() {
        coffeeMaker.turnOff();
    }
}
