package exception;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 在IO操作中使用异常处理机制
 */
public class FinallyDemo2 {
    public static void main(String[] args) {
        FileOutputStream fis = null;
        try{
            fis = new FileOutputStream("fos.dat");
            fis.write(1);
        }catch(IOException e){
            e.printStackTrace();
        }finally{
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
