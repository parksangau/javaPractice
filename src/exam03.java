public class exam03 {
   public static void main(String[] args) {
       int count = 50;
       if (count >= 90) {
           System.out.println("if문 : 합격 (장학생)");
       }
       else if (count >= 60) {
           System.out.println("if문 : 합격");
       }
       else {
           System.out.println("if문 : 불합격");
       }

       int jumsu = (count / 10) * 10;
       switch (jumsu) {
           case 100:
           case 90:
               System.out.println("switch문 : 합격(장학생)");
               break;
           case 80:
           case 70:
           case 60:
               System.out.println("switch문 : 합격");
               break;
           default: // 케이스 문이 끝날때
               System.out.println("switch문 : 불합격");
       }

    }
}
