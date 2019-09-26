package cn.io.study01;

import java.io.File;

/**
 * 创建File类对象
 * @author dell
 *
 */

public class FileStudy01 {
	public static void main(String[] args) {
		String name="E:\\workspace-java\\IO流技术\\捕获.PNG";
		//构建File对象
		File src=new File(name);
		System.out.println(src.length());
		
		//构建File对象
		src=new File("E:\\workspace-java\\IO流技术","捕获.PNG");
		src=new File("E:\\workspace-java","\\IO流技术\\捕获.PNG");
		System.out.println(src.length());
		
		//构建File对象
		src=new File(new File("E:\\workspace-java\\IO流技术"),"捕获.PNG");
		System.out.println(src.length());
	}

}
