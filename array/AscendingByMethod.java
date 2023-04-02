package array;

public class AscendingByMethod {
//	ascending order by Using Method
	public static void main(String[] args) {
		int a[]= {23,43,45,25,75,32};
		int r[]=sortArray(a);
		
		for(int i=0;i<r.length;i++) {
			System.out.println(r[i]);
		}
	}
	static int[] sortArray(int ar[]) {
		for(int j=0;j<ar.length;j++) {
			for(int i=0;i<ar.length-1;i++) {
				
				if(ar[i]>ar[i+1]) {
					int temp=ar[i];
					ar[i]=ar[i+1];
					ar[i+1]=temp;
				}
			}
		}
		return ar;
	}
	


}