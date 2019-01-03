package test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Test {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		// 第1步：使用File类找到一个文件
		File file=new File("f:"+File.separator+"test.docx");
		// 第2步：通过子类实例化父类对象
		Writer out=null;
		// 准备好一个输出的对象
		out=new FileWriter(file);
		// 通过对象多态性进行实例化
		// 第3步：进行写操作
		String str="你好！Tom";
		// 准备一个字符串
		out.write(str);
		// 将内容输出
		out.flush();
		// 强制性清空缓冲区中的内容
		// 第4步：关闭输出流
		// out.close();
		// 此时没有关闭

	}

}
