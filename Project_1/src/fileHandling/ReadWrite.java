package fileHandling;

import java.io.*;

//File1-read data----File2-write data-single loop

public class ReadWrite {
	
	public static void main(String[] args) throws IOException {
		File f1=new File("D:\\Training Docs\\Practice\\FileHandling\\File1Read.txt");
		FileReader fr=new FileReader(f1);
		BufferedReader br=new BufferedReader(fr);
		File f2=new File("D:\\Training Docs\\Practice\\FileHandling\\File2Write.txt");
		 FileWriter fw=new FileWriter(f2, true);
		 BufferedWriter bw=new BufferedWriter(fw);
		 String s;
		 while((s=br.readLine())!=null) {
			 bw.write(s);
			 bw.newLine();
			 
		 }
		 bw.close();	 
	}

}
