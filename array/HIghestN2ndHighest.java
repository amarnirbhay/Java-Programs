package array;

public class HIghestN2ndHighest {
	//find the Highest and Second HIghest Element
	public static void main(String[] args) {
		int ar[]= {10,32,42,42,56,13};
		for(int j=0;j<ar.length;j++) {
			
			for(int i=0;i<ar.length-1;i++)
			{
				if(ar[i]>ar[i+1]) {
					
					int temp=ar[i];
					ar[i]=ar[i+1];
					ar[i+1]=temp;		
				}
			}
		}
		System.out.println("HIghest Element is: "+ar[ar.length-1]);
		System.out.println("Second HIghest Element is: "+ar[ar.length-2]);
		
	}
}
