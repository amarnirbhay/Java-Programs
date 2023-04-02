package practiceStringArray;

public class Count_VowelConso {
	
	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println( "Enter the Any Sentence to To check count of vowewl & consonent");
//		String st=sc.next();
//		st=st.toLowerCase();
		
		String st="i Am amar";
		st=st.toLowerCase();
		
		int vCount=0;
		int cCount=0;
		
		for(int i=0;i< st.length();i++) {
			
			if(st.charAt(i)== 'a' || st.charAt(i)== 'e' || st.charAt(i)=='i' || st.charAt(i)== 'o' || st.charAt(i)=='u') {
				
				vCount++;
			}
			else if(st.charAt(i)>= 'a' && st.charAt(i)<= 'z'){
				cCount++;
			}
		}
		
		System.out.println("Count Of Vowels is: "+vCount);
		System.out.println("Count of Consonent is: "+cCount);
	}
}
