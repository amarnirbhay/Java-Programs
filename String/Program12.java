package String;

public class Program12 {
	// Reverse String
	public static void main(String[] args) {
		
		String s="Java is a Programing Language";
		char s1[]=s.toCharArray();
		String out="";
		for(int i=0;i<s1.length;i++) {
			String temp="";
			while(i<s1.length && s1[i]!=' ') 
			{
				temp=s1[i]+temp;
				i++;
			}
			out=out+temp+" ";
		}
		System.out.println(out);
	}

}
