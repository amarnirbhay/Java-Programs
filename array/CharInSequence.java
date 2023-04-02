package array;

public class CharInSequence {
	//char in Sequence
	public static void main(String[] args) {
		char ar[]= {'z','r','t','j'};
		for(int j=0;j<ar.length;j++)
		{
			for(int i=0;i<ar.length-1;i++)
			{
				if(ar[i]>ar[i+1])
				{
					char temp=ar[i];
					ar[i]=ar[i+1];
					ar[i+1]=temp;
				}	
			}
		}
		for(int i=0;i<ar.length;i++) {
			System.out.println(ar[i]);
		}
	}
}
