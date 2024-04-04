package Java0404FileIO;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

public class FileOutputStream1 {
    public static void main(String[] args) throws IOException {
        // 파일 데이터 출력
        // 1. 파일 대상 설정
        File outFile = new File(FileObject.CURRENT + "/file2.txt");
        if (!outFile.exists()) {
            outFile.createNewFile();
        }
        // 2. 대상에 연결되는 stream 생성
        OutputStream os = new FileOutputStream(outFile);
        // 3. 데이터 쓰기 (1 바이트씩 쓰기)
        os.write('J');
        os.write('A');
        os.write('V');
        os.write('A');
        os.write('\r'); // 캐리지 리턴(carriage return)
        os.write('\n'); // 라인 피드(line feed)

        os.flush(); // 버퍼에 담겨있는 데이터를 파일에 쓰는 메서드
        // 4. stream 종료
        os.close();

        // 여러 바이트를 한꺼번에 쓰는 예제
        // 두번째 파라미터(boolean append)는 기존 파일에 있던 데이터를 삭제하고 쓸지
        // 뒤에 이어서 쓸지 결정하는 것(true = 이어쓰기)
        OutputStream os2 = new FileOutputStream(outFile, true);
        // getBytes()는 문자열을 바이트 배열로 변경시켜주는 메서드
        byte[] byteArray = "Spring and Database".getBytes();
        // write()는 매개변수에 바이트배열 형태로 넣어주면 배열에 담긴 데이터를 모두 쓴다
        os2.write(byteArray);
        os2.write('\r');
        os2.write('\n');
        os2.flush();
        os2.close();
    }
}











