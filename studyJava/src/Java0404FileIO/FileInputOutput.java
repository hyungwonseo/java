package Java0404FileIO;

import java.io.*;
import java.nio.charset.Charset;

public class FileInputOutput {
    public static void main(String[] args) throws IOException {
        File file = new File(FileObject.CURRENT + "/fileio.txt");
        if (!file.exists()) {
            file.createNewFile();
        }
        // 쓰기
        OutputStream os = new FileOutputStream(file, false);
        // byte[] arrayByte = "Hello world. Let's study spring framework.".getBytes();
        byte[] arrayByte = "안녕하세요.".getBytes(Charset.forName("UTF-8"));
        os.write(arrayByte);
        os.flush();
        os.close();

        // 읽기
        InputStream is = new FileInputStream(file);
        int data = 0;
        byte[] buffer = new byte[1000];
        String str = "";
        while (data != -1) {
            data = is.read(buffer);
            if (data >= 0) {
                str = str + new String(buffer, 0, data,
                        Charset.forName("UTF-8"));
            }
        }
        System.out.println(str);
        is.close();
    }
}












