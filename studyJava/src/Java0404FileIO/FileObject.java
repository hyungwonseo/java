package Java0404FileIO;

import java.io.File;
import java.io.IOException;

public class FileObject {
    public static final String CURRENT =
            "C:/Users/admin/Documents/GitHub/java/studyJava/temp"; // 본인꺼
    public static void main(String[] args) {
        String currentPath = System.getProperty("user.dir");
        System.out.println(currentPath);
        // 절대경로
        File tempDir = new File("C:/Users/admin/Documents/GitHub/java/studyJava/temp");
        if (tempDir.exists()) {
            System.out.println("폴더가 이미 존재합니다");
        }else {
            System.out.println("폴더를 생성합니다");
            tempDir.mkdir(); // make directory
        }

        // 파일생성
        File newFile = new File(CURRENT + "/newFile.txt");
        if (!newFile.exists()) {
            try {
                newFile.createNewFile();
            } catch (IOException e) {
                System.out.println("IOException 예외");
            }
        } else {
            System.out.println("이미 파일이 존재합니다");
        }

        // File 객체가 가르키는 대상(폴더 또는 파일)의 절대경로 확인
        System.out.println("절대경로 위치 : " + newFile.getAbsoluteFile());
    }
}












