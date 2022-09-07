public class Car {

    String color;
    int speed = 0;

    int getSpeed() {
        return speed;
    }

    void upSpeed(int value) {
        if (speed + value >= 200)
            speed = 200;
        else
            speed = speed + value;
    }

    void downSpeed(int value) {
        if (speed - value <= 0)
            speed = 0;
        else
            speed = speed - value;
    }

    String getColor() {
        return color;
    }
}
