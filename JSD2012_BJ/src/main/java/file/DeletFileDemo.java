package file;

import java.io.File;

/**
 * 删除一个文件
 */
public class DeletFileDemo {
    public static void main(String[] args) {
        //将test.txt文件删除

        //相对路径中“./”可以不写。不写默认就是从“./”开始的
        File file = new File("test.txt");
        if(file.exists()){
            file.delete();
            System.out.println("该文件已删除！");
        }
    }
}
