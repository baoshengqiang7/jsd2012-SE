package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 使用RAF读写基本类型数据，以及RAF指针的操作
 */
public class RAFDemo3 {
    public static void main(String[] args) throws IOException {
        RandomAccessFile raf =
                new RandomAccessFile("raf.txt","rw");
        int max = Integer.MAX_VALUE;
        raf.write(max>>>24);
        raf.write(max>>>16);
        raf.write(max>>>8);
        raf.write(max);

        /*
         RAF提供了方便写出基本类型的方法
         */

        raf.writeInt(max);
        System.out.println(raf.getFilePointer());
        raf.writeLong(213L);
        System.out.println(raf.getFilePointer());
        raf.writeDouble(123.321);
        System.out.println(raf.getFilePointer());

        System.out.println("写出完毕");
        raf.close();


    }
}
