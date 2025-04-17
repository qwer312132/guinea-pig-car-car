package models.Car;

public class Car {
    private int initialSpeed;
    private int speed;
    private int numAccelerate;

    public Car() {
        this(0, 0);
    }

    public Car(int initialSpeed, int speed) {
        this.initialSpeed = initialSpeed;
        this.speed = speed;
    }

    public int getSpeed() {
        return this.speed;
    }

    public void accelerate() {
        this.speed += this.numAccelerate;
    }

    public void resetSpeed() {
        this.speed = this.initialSpeed;
    }
}
