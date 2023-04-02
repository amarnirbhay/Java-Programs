package String;

public class Program4 {
	// first letter should  be in Upper case
	public static void main(String[] args) {
		String s="java is a programing Language";
		String s1[]=s.split(" ");
		String upper="";
		
		for (String s2 : s1) {
			String first=s2.substring(0,1);
			String afterFirst=s2.substring(1);
//			upper=upper.concat(first).toUpperCase().concat(afterFirst).concat(" ");
			upper=upper+first.toUpperCase()+afterFirst+" ";
			
		}
		System.out.println(upper);
	}

}
