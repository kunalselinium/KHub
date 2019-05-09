package fileHandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class InputDataFile {
	
	public static void main(String[] args) throws IOException {
		File f2=new File("D:\\Training Docs\\Practice\\FileHandling\\InputDataFile.txt");
		 FileWriter fw=new FileWriter(f2);
		 BufferedWriter bw=new BufferedWriter(fw);
		 Scanner sc=new Scanner(System.in);
		 for(int i=1;i<=5;i++) {
		 System.out.println("Enter "+i+" Line");
		 String s=sc.nextLine();
			 bw.write(s);
			 bw.newLine();
		 }
		bw.close();
	System.out.println("Please check file data");
	}

}
