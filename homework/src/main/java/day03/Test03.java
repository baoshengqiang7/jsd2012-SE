package day03;

import java.io.*;

/**
 * 将当前目录下的所有文件都复制一份，复制的文件命名为:原
 * 文件名_cp.后缀
 * 比如原文件为:test.dat
 * 复制后的文件为:test_cp.dat
 * 
 * 
 * @author Xiloer
 *
 */
public class Test03 {
	public static void main(String[] args) throws IOException {
		File dir = new File(".");
		if (dir.isDirectory()) {
			FileFilter filter = (file) -> file.isFile();
			File[] subs = dir.listFiles(filter);
			System.out.println(subs.length);
			for (int i = 0; i < subs.length; i++) {
				String filename = subs[i].getName();
				//截取文件名
				int intdex = filename.lastIndexOf(".");
				String name = filename.substring(0,intdex);
				//截取后缀名
				String ext = filename.substring(intdex);
				//创建复制文件的文件名
				String copyFilename = name+"_cp"+ext;
				RandomAccessFile src =
						new RandomAccessFile(subs[i],"r");
				RandomAccessFile desc =
						new RandomAccessFile(copyFilename,"rw");
				int d ;
				while((d=src.read())!=-1){
					desc.write(d);
				}
			}

		}
	}
}

/**
 * 思路:
 * 分为几部分考虑.
 * 第一个是要获取到当前目录中的所有文件(思考哪个API可以解决)
 * 第二个是获取到的每一个文件都要复制(复制用什么API)
 * 第三个是复制的文件名，如何重新组建xxx_cp.xxx的名字?
 *      这里要将原文件名拆开后想办法拼接_cp.
 */


