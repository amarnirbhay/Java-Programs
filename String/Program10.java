package String;

public class Program10 {
	// String Upper to Lower
	public static void main(String[] args) {
		String s="JAVA PROGRAM";
		String s1[]=s.split(" ");
		for (String s2 : s1)
		{
			char ch[]=s2.toCharArray();
			String upper="";
			for(int i=0;i<ch. length; i++) 
			{
				if(ch[i]!=' ')
				{
				char c=(char)(ch[i]+32);
				upper=upper+c;
				}
			}
			System.out.print(upper+" ");
		}
	}
}
