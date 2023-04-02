package practiceStringArray;

public class A {
	// merge array and store into a new Array
	public static void main(String[] args) {
		int [] a= {1,4,5,7};
		int [] b= {6,9,5,9};
		
		// 1 4 5 7 6 9 5 9 output
		int x= a.length;
		int y = b.length;
		int j = 0;
		int[] merge = new int[x + y];
		 
		for(int i=0;i< merge.length; i++) {
			
			if(i<x) {
				merge[i] = a [i];
			}
			else {
				merge[i] = b [j];
				j++;
			}
		}
		for(int k =0; k<merge.length; k++) {
			System.out.print(merge[k]+" ");
			
		}
		
		
		
		
		
	}

}
