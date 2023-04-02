package array;

public class ExtractDuplicates {
	//extract duplicate values
		public static void main(String[] args) {
			int a[]= {10,20,30,10,20,10,20,6,4,6,5,7,6,4};
			
			int temp[]=new int [a.length];
			
			for(int i=0;i<a.length;i++) {
				int count=1;
				for(int j=i+1;j<a.length;j++) {
					
					if(a[i]==a[j]) {
						count++;
						temp[j]=-1;
					}
				}
				if(temp[i]!=-1) {
					System.out.println(a[i]+" is "+count+" Times");
				}
			}
		}
}
