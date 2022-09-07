public class exam05 {
    // 전역 변수, 지역 변수
    static  int var = 100;

    public static void main(String[] args) {
        int var = 0;    // 지역 변수 var == 0
        System.out.println(var);

        int sum = addFunction(10, 20);
        System.out.println(sum);
    }

    static int addFunction(int num1, int num2) {
        int hap;
        hap = num1 + num2 + var;    // 전역 변수 var ==
        // 100
        return hap;
    }
}
