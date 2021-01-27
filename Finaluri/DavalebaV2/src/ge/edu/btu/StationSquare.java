package ge.edu.btu;

public class StationSquare {

    public static void main(String[] args) {

        Passenger gio = new Passenger("gio", true);
        Passenger nika = new Passenger("nika", true);
        Passenger ana = new Passenger("ana", false);


        Train train = new Train();

        train.addPassanger(gio);
        train.addPassanger(nika);
        train.addPassanger(ana);

        for (Passenger passanger: train.getPassangerList()
             ) {
            System.out.println(passanger.getName());
        }

    }
}
