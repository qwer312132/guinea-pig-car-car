package models;

import models.Car.*;
import models.Car.CarType.CARTYPE;
import models.guineaPig.GuineaPig;


public class GuineaPigCarCar extends GuineaPig {
    private Car car;
    private int distance;
    public GuineaPigCarCar(String name, CARTYPE type) {
        super(name);
        if(type == CARTYPE.AMBULANCE){
            car = new Ambulance();
        }
        if(type == CARTYPE.POLICECAR){
            car = new PoliceCar();
        }if(type == CARTYPE.TRASHTRUCK){
            car = new TrashTruck();
        }

    }

    public int getSpeed(){
        return car.getSpeed();
    }

    public void move(){
        distance += car.getSpeed();
    }

    public void eat_carrot(){
        check_and_pupu();
        car.accelerate();
        eat("carrot");
    }

    public void eat_lettuce(){
        check_and_pupu();
        eat("lettuce");
    }

    public void check_and_pupu(){
        String pupu = checkAndPupuIfNeeded();
        if(!pupu.isEmpty()){
            System.out.println(pupu);
            car.resetSpeed();
        }
    }

    public int getDistance(){
        return distance;
    }
}
