package String;

public class Program9 {
//	upper case to lower or Lower to Upper
	public static void main(String[] args) {
//		System.out.println((char)('A'));
//		String s="PROGRAM";
//		char ch[]=s.toCharArray();
//		String upper="";
//		for( int i=0;i<ch.length;i++) {
//			if(ch[i]!=' ') {
//				char c=(char)(ch[i]-32);
//				upper=upper+c;	
//			}
//			System.out.println(upper);	
//		}
//		System.out.println((char)('A'));
		String s="program";
		char ch[]=s.toCharArray();
		String upper="";
		for( int i=0;i<ch.length;i++) {
			 
				char c=(char)(ch[i]-32);
				upper=upper+c;
		}
		System.out.println(upper);
	}
}
