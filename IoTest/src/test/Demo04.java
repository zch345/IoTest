package test;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Demo04 {

	public static void main(String[] args) throws IOException {
		File fw = new File("E:\\tt.docx");
		File fr = new File("F:\\PB学习\\pb.docx");
		Demo04.FileWriter(fr, fw);
		}

		public static void FileWriter(File in,File ot) throws IOException{

		if(!in.exists()){
		in.getParentFile().mkdirs();
		in.createNewFile();
		}
		if(!ot.exists()){
		ot.getParentFile().mkdirs();
		ot.createNewFile();
		}

		InputStreamReader isr=new InputStreamReader(new FileInputStream(in));
		OutputStreamWriter osw=new OutputStreamWriter(new FileOutputStream(ot),"utf-8");

		BufferedReader br = new BufferedReader(isr);
		BufferedWriter bw = new BufferedWriter(osw);

		char[] buffer = new char[1024]; 
		int c; 
		while ((c = br.read(buffer,0,1024)) != -1) { 
		bw.write(buffer,0,c); 
		} 
		br.close();
		bw.close();
		System.out.println("OK");

	}

}
