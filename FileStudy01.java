package cn.io.study01;

import java.io.File;

/**
 * ����File�����
 * @author dell
 *
 */

public class FileStudy01 {
	public static void main(String[] args) {
		String name="E:\\workspace-java\\IO������\\����.PNG";
		//����File����
		File src=new File(name);
		System.out.println(src.length());
		
		//����File����
		src=new File("E:\\workspace-java\\IO������","����.PNG");
		src=new File("E:\\workspace-java","\\IO������\\����.PNG");
		System.out.println(src.length());
		
		//����File����
		src=new File(new File("E:\\workspace-java\\IO������"),"����.PNG");
		System.out.println(src.length());
	}

}
