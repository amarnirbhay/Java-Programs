package String;

public class Program5 {
	// for reverse all words
		public static void main(String[] args) {
			String s="Java is a programing language";
			String s1[]=s.split(" ");
			for (String s2 : s1) {
				String rev="";
				char ch[]=s2.toCharArray();
				for(int i=ch.length-1;i>=0;i--)
				{
					rev=rev+ch[i];
				}
				System.out.print(rev+" ");
			}
		}
}
