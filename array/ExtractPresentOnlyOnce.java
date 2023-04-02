package array;

public class ExtractPresentOnlyOnce {
	//Extract the values only present only once
			public static void main(String[] args) {
				int a[]= {10,20,30,10,20,10,20,76};
				
				int temp[]=new int [a.length];
				
				for(int i=0;i<a.length;i++) {
					int count=1;
					for(int j=i+1;j<a.length;j++) {
						
						if(a[i]==a[j]) {
							count++;
							temp[j]=-1;
							
						}
					}
					if(temp[i]!=-1 && count ==1) {
						System.out.println(a[i]+ "\t"+count+" -->Time");
						
					}
				}
			}
}
