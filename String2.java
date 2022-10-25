package prep;

public class String2 {

	public static void main(String[] args) {
		// Print only alphabets in string
		
		String s="Nagercoil 629501";
//		for(int i=0;i<s.length();i++) {
//			if(s.charAt(i)>='a' && s.charAt(i)<='z') {
//				System.out.print(s.charAt(i));
//			}
//			else
//				if(s.charAt(i)>='A' && s.charAt(i)<='Z') {
//					System.out.print(s.charAt(i));
//				}
//		}
		
		System.out.println(s.replaceAll("[0-9]",""));

	}

}
