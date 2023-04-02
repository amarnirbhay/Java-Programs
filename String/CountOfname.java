package String;

public class CountOfname {
		public static void main(String[] args) {
			String s="@amar@ankit@laptop@Rockykutta@dogy";
			int count=0;
			for(int i=0;i<s.length();i++)
			{
				if(s.charAt(i)=='@')
				{
					count++;
				}
			}
			System.out.println("Count Of all Names is: "+count);
		}
}
