package fileHandling;

import java.io.*;

public class FileReadPractice {
	
	public void CharReading() throws IOException
	{
		File f=new File("D:\\Training Docs\\Practice\\FileHandling\\FileReadChar.txt");
		FileReader fr=new FileReader(f);
		int a;
		while((a=fr.read())!=-1) {
			char c=(char)a;
			System.out.print(c);
		}
		System.out.print("\n\n");
	}
		
    public void LineReading() throws IOException {
    	File f=new File("D:\\Training Docs\\Practice\\FileHandling\\FileReadLine.txt");
		FileReader fr=new FileReader(f);
		BufferedReader br=new BufferedReader(fr);
		 String s;
		 while((s=br.readLine())!=null) {
			 System.out.println(s);
		 }
			 

    } 
	
	public static void main(String[] args) throws IOException {
		FileReadPractice frp=new FileReadPractice();
		frp.CharReading();
		frp.LineReading();
	}

}
