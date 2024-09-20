package Java0920Thread;

public class Thread0 {
    public static void main(String[] args) {
        int[] intArray = {1,2,3,4,5};
        String[] strArray = {"하나", "둘", "셋", "넷", "다섯"};
        for (int i=0; i<intArray.length; i++) {
            System.out.println("(비디오프레임) " + intArray[i]);
            try {Thread.sleep(200);} catch (InterruptedException e) {}
        }
        for (int i=0; i<strArray.length; i++) {
            System.out.println("(자막번호) " + strArray[i]);
            try {Thread.sleep(200);} catch (InterruptedException e) {}
        }
    }
}
