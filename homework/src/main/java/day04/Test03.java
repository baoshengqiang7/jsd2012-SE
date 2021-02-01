package day04;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

/**
 * 用户登录功能
 * 程序启动后，要求用户输入用户名和密码
 * 然后去user.dat文件中比对
 * 成功则输出:登录成功
 * 失败则输出:登录失败，用户名或密码不正确
 * 
 * 登录失败的条件:用户名输入正确但是密码不正确，或者用户名
 * 输入不正确(user.dat文件中没有此人)
 * 
 * @author Xiloer
 *
 */
public class Test03 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String filename = scan.nextLine();
        System.out.println("请输入密码：");
        String password = scan.nextLine();
        RandomAccessFile src = new RandomAccessFile("raf2.txt","r");
        boolean login = false;
        for (int i = 0;i<src.length()/100;i++) {
            src.seek(i*100);
            byte[] data = new byte[32];
            src.read(data);
            String username = new String(data, "UTF-8").trim();
            if(username.equals(filename)){
                src.read(data);
                String password1 = new String(data, "UTF-8").trim();
                if(password1.equals(password)){
                    login = true;
                }
                break;
            }
        }
        if (login) {
            System.out.println("登录成功！");
        } else {
            System.out.println("登陆失败！用户名或密码不正确！");
        }
        src.close();
    }


}
