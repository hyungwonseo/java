import java.util.Arrays;
import java.util.Scanner;

public class Java0306Array {
    public static void main(String[] args) {
        // 1. 길이가 10인 배열에 1부터 10까지 값을 입력
        int[] intList1 = new int[10];
        for (int i=0; i<10; i++) {
            intList1[i] = i + 1;
        }
        System.out.println(Arrays.toString(intList1));

        // 2. 길이가 10인 배열에 10부터 1까지 값을 역순으로 입력
        int[] intList2 = new int[10];
        int len = intList2.length;
        for (int i=0; i<intList2.length; i++) {
            intList2[i] = len;
            len = len - 1;
        }
        System.out.println(Arrays.toString(intList2));

        // 3. 아래 과일 배열에 "사과"가 몇개 들어있는지 확인
        String[] fruitList = {"배", "사과", "바나나", "딸기", "사과", "수박"};
        int count = 0;
        for (int i=0; i< fruitList.length; i++) {
            if (fruitList[i] == "사과") {
                count = count + 1;
            }
        }
        System.out.println(count);

        // 자바에서 입력값을 받는 방법
//        Scanner sc = new Scanner(System.in);
//        System.out.print("0~6까지 숫자를 입력해주세요 : ");
//        int inputNumber = sc.nextInt();
//
//        if (inputNumber >= 0 && inputNumber <=6) {
//            System.out.println(inputNumber);
//        }else {
//            System.out.println("잘못 입력하셨습니다.");
//        }

        // 자바에서 문자열을 입력 받는 방법
//        Scanner sc = new Scanner(System.in);
//        System.out.print("이름을 입력해주세요 : ");
//        String inputStr = sc.nextLine();
//        System.out.println(inputStr);

        // 4. 사용자로부터 0~6까지 숫자를 입력받아 아래 배열에 해당하는 요일을 출력
        char[] week = {'월', '화', '수', '목', '금', '토', '일'};
        Scanner scan = new Scanner(System.in);
        System.out.print("0~6까지 숫자를 입력해주세요 : ");
        int num = scan.nextInt();
        for (int i=0; i< week.length; i++) {
            if (num >= 0 && num <= 6) {
                System.out.println(week[num]);
                break;
            }else {
                System.out.println("잘못 입력하셨습니다.");
            }
        }

        // 5. 사용자로부터 이름을 입력받아 아래 회원배열에 있는 이름이면
        // "~~~님 환영합니다"를 출력하고
        // 없으면 "회원가입해주세요"를 출력 (단, 대소문자 구분하지 마시오)
        String[] members = {"Steve", "Tom", "Michael", "Laura", "Jessica", "Annie"};
        Scanner scan2 = new Scanner(System.in);
        System.out.print("이름을 입력해주세요 : ");
        String inputStr = scan2.nextLine();
        boolean found = false;
        for (int i=0; i< members.length; i++) {
            if (members[i].equalsIgnoreCase(inputStr)) {
                System.out.println(members[i] + "님 환영합니다");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("회원가입해주세요");
        }

//        for (int i=0; i< members.length; i++) {
//            if (members[i].equalsIgnoreCase(inputStr.toLowerCase())) {
//                System.out.println(members[i] + "님 환영합니다");
//                break;
//            }
//            if (i == members.length - 1) {
//                System.out.println("회원가입해주세요");
//            }
//        }
    }
}
