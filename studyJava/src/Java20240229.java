public class Java20240229 {
    public static void main(String[] args) {
        // if 단독사용
        boolean x = true;
        if (x) {
            System.out.println("테스트중!!!");
        }
        if (!x) {
            System.out.println("이건 안보일걸");
        }
        // if ~ else
        if (x) {
            System.out.println("x는 true");
        }else {
            System.out.println("x는 false");
        }
        // if ~ else의 중복 사용
        boolean a = false;
        boolean b = true;
        boolean c = true;
        if (a) {
            System.out.println("a가 true");
        }else if (b) {
            System.out.println("a는 false, b가 true");
        }else if (c) {
            System.out.println("a,b는 false, c가 true");
        }else {
            System.out.println("a,b,c는 false");
        }

        // 학점 코드 (범위를 나타내는 조건식)
        // 조건식에 사용된 범위가 전체를 100% 커버해야한다
        // 중복 해당되도록 조건을 만들면 안됨
        int score = 91;
        if (score >= 90) {
            System.out.println("A 학점");
        }else if (score >= 80 && score < 90) {
            System.out.println("B 학점");
        }else if (score >= 70 && score < 80) {
            System.out.println("C 학점");
        }else if (score >= 60 && score < 70) {
            System.out.println("D 학점");
        }else {
            System.out.println("F 학점");
        }
        // 관계가 없는 조건을 if else로 설정하면 안됨
        int num = 4;
        if (num > 0) {
            System.out.println("num은 양수");
        } else if (num % 2 == 0) {
            System.out.println("num은 짝수");
        }
        // 독립적인 if문으로 만드는 것이 좋다
        if (num > 0) {
            System.out.println("num은 양수");
        }
        if (num % 2 == 0) {
            System.out.println("num은 짝수");
        }
        // if문 속에 if문
        if (true) {
            if (true) {
                if (true) {
                    System.out.println("if문 속에 if문");
                }
            }
        }

        // Switch case
        int number = 1;
        switch(number) {
            case 1:
                System.out.println("A");
                break;  // 항상 break 키워드와 함께 쓰자 !!!
            case 2:
                System.out.println("B");
                break;
            case 3:
                System.out.println("C");
                break;
            default:
                System.out.println("D");
                break;
        }
    }
}













