package io;

import java.io.*;
import java.util.Scanner;

public class Note {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入文件名：");
        String filename = scan.nextLine();
//      FileOutputStream fos = new FileOutputStream(filename+".txt",true);
//      进行文件追加输入
        FileOutputStream fos = new FileOutputStream(filename+".txt");
        OutputStreamWriter osw = new OutputStreamWriter(fos,"UTF-8");
        BufferedWriter bw = new BufferedWriter(osw);
        /*
            当创建PW时第一个参数为流，则可以再传入一个boolean型的参数
            如果这个值为true，则当前PW具有自动刷新功能。
            每当我们调用println方法后自动flush
         */
        PrintWriter pw = new PrintWriter(bw);
        System.out.println("请输入内容，单独输出exit退出");
        while(true){
            String word = scan.nextLine();
            if("exit".equals(word)){
                System.out.println("输出结束");
                break;
            }
            pw.print(word);
            pw.flush();
        }
        pw.close();
    }
}
