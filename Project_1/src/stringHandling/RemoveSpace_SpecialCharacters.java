package stringHandling;

public class RemoveSpace_SpecialCharacters {

	String s="dj hg jdh   db  asjhds   dnb   ";
	String s1="hdasd%^&vghgjh):}{(yfsjdg";
	String s2="";
	String s3="";
	int l=s.length();
	int l1=s1.length();
	int ascii;
	
	public void RemoveSpaces(){
		for(int i=0;i<l;i++){
			ascii=s.charAt(i);
			if(ascii!=32){
			s2+=s.charAt(i);
			}
		}
		System.out.println(s2);
	}
	
	public void RemoveSpecialCharacters(){
		for(int i=0;i<l1;i++){
			ascii=s1.charAt(i);
			if((ascii>=32 && ascii<=47)||(ascii>=58 && ascii<=64)||(ascii>=91 && ascii<=96)||(ascii>=123 && ascii<=126)){
			}
			else{
				s3+=s1.charAt(i);
			}
		}
		System.out.println(s3);
	}
	
	public static void main(String[] args) {
		RemoveSpace_SpecialCharacters rs=new RemoveSpace_SpecialCharacters();
		rs.RemoveSpaces();
		rs.RemoveSpecialCharacters();
	}
	
}
