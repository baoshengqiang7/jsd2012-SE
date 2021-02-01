package io;

import java.io.*;

/**
 * 使用流连接形式创建PW完成文本数据的写出操作
 */
public class PWDemo2 {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        //向pw2.txt中写入文本数据

        //低级流，将字节写入文件
        FileOutputStream fos = new FileOutputStream("pw2.txt");
        /*
            高级流，转换流
            1.负责衔接字符流河字节流
            2.负责将写出的字符按字符就转换为字节
         */
        OutputStreamWriter osw = new OutputStreamWriter(fos,"UTF-8");
        //高级流，缓冲字符输出流。负责块写文本书加速
        BufferedWriter bw = new BufferedWriter(osw);
        //高级流，PW。负责按行写字符串，并可以自动刷新
        PrintWriter pw = new PrintWriter(bw);
        pw.print("新世界");
        System.out.println("输入完毕");
        pw.close();
    }
}
