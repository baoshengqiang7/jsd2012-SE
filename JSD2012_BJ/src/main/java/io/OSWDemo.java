package io;

import java.io.*;

/**
 * 字符流 java.io.Reader和java.io.Writer
 * java将按照读写单位划分为字节流和字符流
 * 字节流的超类是：java.io.InputStream和OutputStream
 * 而字符流的超类是：java.io.Reader和java.io.Writer
 * 他们的区别是读写单位不同，字节流最小读写单位是一个字节，而字符流
 * 最小的读写单位是一个char(一个字符)
 *
 *
 * 转换流：java.io.InputStreamReader和java.io.InputStreamWriter
 * 转换流是常用的字符流实现类，他们是一对高级流，实际开发中我们不会直接
 * 使用他们，但是他们在流连接中是非常重要的一环
 *
 *因为其他高级字符流都有一个共同特点，在流连接
 *
 */
public class OSWDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fis = new FileOutputStream("OSW.txt");
        OutputStreamWriter fos = new OutputStreamWriter(fis,"UTF-8");
        fos.write("今天是个好日子");
        fos.write("心想的事儿都能成");

        System.out.println("输出完毕！");
        fos.close();

    }
}
