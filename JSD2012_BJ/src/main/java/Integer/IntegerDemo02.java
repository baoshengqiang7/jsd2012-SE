package Integer;

/**
 * 包装类常见功能
 */
public class IntegerDemo02 {
    public static void main(String[] args) {
        //获得基本类型的最大值最小值
        int imax = Integer.MAX_VALUE;
        System.out.println(imax);
        int imin = Integer.MIN_VALUE;
        System.out.println(imin);

        long lmax =Long.MAX_VALUE;
        System.out.println(lmax);

        //字符串类型转换为基本类型
        String line = "123";
//        String line = "123";//这个字符串就不能转换为int
        int i = Integer.parseInt(line);
        System.out.println(i);
        double d = Double.parseDouble(line);
        System.out.println(d);

    }
}
