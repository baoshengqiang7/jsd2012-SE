package thread;

/**
 * 使用匿名内部类的形式完成两种线程的创建
 */
public class ThreadDemo3 {
    public static void main(String[] args) {
        Runnable r1 = new Runnable(){
            public void run(){
                for(int i=0;i<1000;i++){
                    System.out.println("下饭操作");
                }
            }
        };
        Runnable r2 = new Runnable(){
            public void run() {
                for(int i=0;i<1000;i++){
                    System.out.println("终极厨神");
                }
            }
        };

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        t1.start();
        t2.start();
    }
}
