package String;

public class Program6 {
//		equalsiIgnorecase method
		public static void main(String[] args) {
			String s="java program";
			String s1="JAVA PROGRAM";
			String s3="java Program";
			
			System.out.println(s.equals(s1));
			System.out.println(s.equals(s3));
			System.out.println(s.equalsIgnoreCase(s3));
		}
}
