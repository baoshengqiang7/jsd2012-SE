package thread;

import java.util.Scanner;

/**
 * 线程提供的方法
 * static void sleep(long ms)
 * 该方法可以让运行这个方法的线程处于阻塞状态指定毫秒，超时后线程会自动回到RUNNABLE状态
 * 再次获取时间片并发运行。
 */
public class SleepDemo {
    public static void main(String[] args) {
        System.out.println("程序开始了。。。");
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入倒计时时间/ms：");
        int time = scan.nextInt();
        int a = time/1000;
        while(a>0){
            System.out.println(a);
            a--;
        }
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("时间到了");
    }
}
