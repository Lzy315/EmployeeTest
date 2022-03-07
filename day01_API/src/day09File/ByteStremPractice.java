package day09File;
//图片复制
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStremPractice {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("G:\\test.PNG");

        FileOutputStream fos = new FileOutputStream("G:\\test_copy.PNG");
        byte[] b = new byte[1024] ;
        int len;
        while ( ( len = fis.read(b) )!= -1){
            fos.write(b,0,len);
        }

        fos.close();    //后开先关
        fis.close();    //先开后关

    }

}

