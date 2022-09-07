public class exam08 {
    public static void main(String[] args) {
        Car myCar1 = new Car("red", 0);
        Car myCar2 = new Car("green", 0);
        Car myCar3 = new Car("blue", 0);

        myCar1.upSpeed(50);
        System.out.println("myCar1 의 색상은 " + myCar1.getColor() +
                ", 속도는 " + myCar1.getSpeed() + "km 입니다.");

        myCar2.downSpeed(30);
        System.out.println("myCar2 의 색상은 " + myCar2.getColor() +
                ", 속도는 " + myCar2.getSpeed() + "km 입니다.");

        myCar3.upSpeed(250);
        System.out.println("myCar3 의 색상은 " + myCar3.getColor() +
                ", 속도는 " + myCar3.getSpeed() + "km 입니다.");
    }
}
