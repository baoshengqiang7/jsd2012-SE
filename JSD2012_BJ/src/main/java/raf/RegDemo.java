package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 用户注册
 * 程序启动后需要用户顺序输入用户名，密码，昵称和年龄
 * 然后将该记录写入文件user.dat中保存。
 *
 *每条记录占用固定的100条字节，其中用户名，密码，昵称为字符串，各占
 * 32字节。年龄为int值占4字节
 */
public class RegDemo {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        System.out.println("欢迎注册！");
        System.out.println("请输入用户名：");
        String username = scan.nextLine();
        System.out.println("请输入密码：");
        String password = scan.nextLine();
        System.out.println("请输入昵称：");
        String nickname = scan.nextLine();
        System.out.println("请输入年龄：");
        int age = scan.nextInt();

        RandomAccessFile raf =new RandomAccessFile("raf2.txt","rw");
        raf.seek(raf.length());
        byte[] data = username.getBytes("UTF-8");
        data = Arrays.copyOf(data,32);
        raf.write(data);

        data = password.getBytes("UTF-8");
        data = Arrays.copyOf(data,32);
        raf.write(data);

        data = nickname.getBytes("UTF-8");
        data = Arrays.copyOf(data,32);
        raf.write(data);

        raf.writeInt(age);
        System.out.println("注册完毕！");
        raf.close();

    }
}
