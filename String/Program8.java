package String;

public class Program8 {
	//count of Characters
	public static void main(String[] args)
	
	{
		String a="java is Programing language";
		char ar[]=a.toCharArray();
		int count = 0;
		for(int i=0; i< ar.length; i++) {
//			if(a.charAt(i)!=' ')
			if(ar[i]!=' ')		
			{
				count ++;
			}
		
		}
		System.out.println("All Charcters of Count is "+count);
		
	}

}
