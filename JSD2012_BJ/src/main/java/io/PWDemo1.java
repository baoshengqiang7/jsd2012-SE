package io;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

/**
 * 缓冲字符输出流
 * java.io.BufferedWriter
 * 内部有缓冲区，可以块写数据来加快数据速度。
 *
 * javaa.io.printWriter
 * 具有自动刷新的缓冲字符输出流，内部总是连接BufferedWriter作为其
 * 缓冲功能。
 */
public class PWDemo1 {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        //向pw.txt文件中写入字符串
        /*
            PW提供了直接对文件做操作的构造方法
            PrintWriter(String path)
            PrintWriter(File file)
         */
        PrintWriter pw = new PrintWriter("pw.txt","UTF-8");
        pw.println("哈哈");
        System.out.println("写出完毕");
        pw.close();
    }
}
