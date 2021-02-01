package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 文件复制
 */
public class COPYDemo {
    public static void main(String[] args) throws IOException {
        RandomAccessFile src =
                new RandomAccessFile("image.jpg","r");
        RandomAccessFile str =
                new RandomAccessFile("images1.jpg","rw");
        int d ;
        long start = System.currentTimeMillis();
        while ((d=src.read())!=-1){
            str.write(d);
        }
        long end = System.currentTimeMillis();
        System.out.println("复制成功！耗时"+(end-start)+"ms");
        src.close();
        str.close();
    }
}
