package exception;

/**
 * 异常处理机制中的try-catch
 */
public class TryCatchDemo {
    public static void main(String[] args) {
        System.out.println("程序开始启动了。。。");
        try {
//            String str = null;
//            String str = "";
            String str = "abc";
        /*
            如果str为null，当虚拟机执行到下面的代码会发现这里存在
            空指针现象，于是虚拟机会实例化一个空指针异常的的实例，并将其
            抛出。抛出后会检查报错的这句话是否被异常处理机制控制，如
            果没有则会将该异常抛出到当前方法外面，有调用该方法的代码
            去解决(这里相当于抛出到main党发外面)。
         */
            System.out.println(str.length());
            System.out.println(str.charAt(0));
            System.out.println("**********************");
        }catch(NullPointerException e){
            System.out.println("空指针异常！");
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("字符串下标越界了！");
            /*
                catch超类异常的意义：
                当try中某几类异常使用相同处理方法时，可以catch这些
                异常的超类。
                在最后一个catch处捕获Exception也可以避免因为一个
                未处理的异常导致程序中断。

                当多个catch异常之间存在继承关系时，子类型异常要在
                上面先行捕获，超类型异常在下。否则编译不通过。
             */
        }catch(Exception e){
            System.out.println("就是有错");
        }
        System.out.println("程序结束了。。。");
    }
}
