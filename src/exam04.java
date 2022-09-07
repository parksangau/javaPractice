public class exam04 {
    public static void main(String[] args) {
        int one[] = new int[3]; // int 배열 [0] [1] [2] 생성
        for (int i = 0; i < one.length; i++) {
            one[i] = 10 * i;
            System.out.println(one[i]);
        }

        String two[] = {"하나", "둘", "셋"};
        for (String str : two) {    // two 배열에 있는 것들을 srt 이라는 변수에 하나씩 넣음
            System.out.println(str);
        }

        int j = 0;
        while (j < one.length) {
            System.out.println(one[j]);
            j++;
        }
    }
}
