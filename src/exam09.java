public class exam09 {
    public static void main(String[] args) {
        Car myCar1 = new Car("red", 0);
        Car myCar2 = new Car("green", 0);
        Car myCar3 = new Car("blue", 0);

        // 직접 만듣 메소드
        System.out.println("생성된 차의 대수(정적 필드) ==> " + Car.carCount);
        System.out.println("생성된 차의 대수(정적 메소드) ==> " + Car.currentCarCount());
        System.out.println("차의 최고 제한 속도 ==> " + Car.MAXSPEED);

        // 제공해주는 메소드
        System.out.println("PI의 값 ==> " + Math.PI);
        System.out.println("3의 5제곱 ==> " + Math.pow(3, 5));
    }
}
