package file;

import java.io.File;
import java.io.IOException;

/**
 * 使用File创建一个文件
 */
public class CreateNewFileDemo {
    public static void main(String[] args) throws IOException {
        File file = new File("./test.txt");
        if(file.exists()){
            System.out.println("该文件已存在");
        }else{
            file.createNewFile();
            System.out.println("文件已创建！");
        }
    }
}
