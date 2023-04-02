package String;

public class Reverse {
	
	public static void main(String[] args) {
		String s="usere";
		String rev="";
		char x[]=s.toCharArray();
		System.out.println(s);
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+x[i];
		}
		System.out.println(rev);
	System.out.println("================================================");
	
	//print duplicate word in String 
	String d="Amamar";
		char c[]=d.toCharArray();
		int temp[]=new int[c.length];
		
		for(int j=0;j<c.length;j++)
		{
			int count =1;
			for(int k=j+1;k<c.length;k++) {
				
				if(c[j]==c[k]) {
					count++;
					temp[k]=-1;
				}
			}
			if(temp[j]!=-1 && count>1){
				System.out.println(c[j]+" "+count);
			}
		}
		
	}

}
