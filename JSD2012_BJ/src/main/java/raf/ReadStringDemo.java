package raf;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 读取文本数据
 */
public class ReadStringDemo {
    public static void main(String[] args) throws IOException {
        RandomAccessFile raf =
                new RandomAccessFile("raf.txt","rw");
        byte[] data = new byte[(int)raf.length()];
        raf.read(data);

        String line = new String(data,"UTF-8");
        System.out.println(line);
        raf.close();
    }
}
