import java.util.ArrayList;
import models.GuineaPigCarCar;
import models.RunRunGuineaPigCarCarRace;
import models.Car.CarType.CARTYPE;

public class Main {
    public static void main(String[] args) {

        GuineaPigCarCar shiromo = new GuineaPigCarCar("西羅摩", CARTYPE.POLICECAR);
        GuineaPigCarCar abbey = new GuineaPigCarCar("阿比", CARTYPE.AMBULANCE);
        GuineaPigCarCar teddy = new GuineaPigCarCar("泰迪", CARTYPE.TRASHTRUCK);


        ArrayList<GuineaPigCarCar> contestants = new ArrayList<>();
        contestants.add(shiromo);
        contestants.add(abbey);
        contestants.add(teddy);


        RunRunGuineaPigCarCarRace race = new RunRunGuineaPigCarCarRace(contestants);
        race.run_race();
    }
}
