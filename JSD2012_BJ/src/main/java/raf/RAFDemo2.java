package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 从文件中读取数据
 */
public class RAFDemo2 {
    public static void main(String[] args) throws IOException {
        RandomAccessFile raf = new RandomAccessFile("raf.dat","r");
        /*
        int read()
        从文件中读取一个字节，并以int型返回
        如果返回值为-1，则表示文件末尾。EOF end of file
         */
        int d = raf.read();
        System.out.println(d);
        d =raf.read();
        System.out.println(d);
        d = raf.read();//文件末尾
        System.out.println(d);
        raf.close();
    }
}
