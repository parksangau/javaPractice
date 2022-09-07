public class exam06 {
    public static void main(String[] args) {
    // try, catch 구문
        int num1 = 100, num2 = 0;

        // 정상적으로 실행되는 구문
        try {
            System.out.println(num1 / num2);
        }

        // catch() 에 해당하는 오류가 발생하면 아래 구문을 실행한다.
        catch(java.lang.ArithmeticException e) {    // 산술적인 오류 발생
            System.out.println("계산에 문제가 있습니다.");
        }
    }
}
