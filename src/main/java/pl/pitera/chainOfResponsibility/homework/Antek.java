package pl.pitera.chainOfResponsibility.homework;

class Antek extends Child {
    @Override
    public void processRequest(MotherRequest motherRequest) {

        if (motherRequest.getShelf().equals(Shelf.HIGH)) {
            System.out.println("Antek zdjął słoik z półki");
        } else {
            System.out.println("Słoik za wysoko trzeba zawołać tatę");
        }
    }
}
