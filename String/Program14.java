package String;

public class Program14 {
	// sort the name Alphabetically
	public static void main(String[] args) {
		String s[]= {"Manmohan", "Sohan", "Aman", "Raja"};
		for (int i = 0; i < s.length; i++) 
		for (int k = 0; k < s.length-1; k++) {
			{
				if(s[k].compareTo(s[k+1])>0)
				{
					String temp=s[k];
					s[k]=s[k+1];
					s[k+1]=temp;
				}
			}
		}
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}
	}

}
