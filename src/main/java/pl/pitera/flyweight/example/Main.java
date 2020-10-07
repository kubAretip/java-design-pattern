package pl.pitera.flyweight.example;

class Main {


    public static void main(String[] args) {

        ContinentalDevice radio = () -> System.out.println("Gra muzyka");
        ContinentalSocket continentalSocket = new ContinentalSocket();
        continentalSocket.plugIn(radio);


        UKDevice ukRadio = () -> System.out.println("Jazda jazda jazda !!");
        UKSocket ukSocket = new UKSocket();
        ukSocket.plugIn(ukRadio);

        UkToContinentalAdapter adapter = new UkToContinentalAdapter(ukRadio);

        continentalSocket.plugIn(adapter);

    }






}
