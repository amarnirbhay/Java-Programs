package array;

public class Delete2Or4IndexValue {
	public static void main(String[] args) {
		// Delete the Array Element from index No 2 or 4
		int ar[] = { 10, 30, 24, 54, 98, 53 };
		int temp[] = new int[ar.length - 1];
		for (int i = 0; i < temp.length; i++) {
			if (i < 2)
				temp[i] = ar[i];
			else
				temp[i] = ar[i + 1];
		}
//		for (int i= 0; i< temp.length;i++)
//		{
//			System.out.println(temp[i]);
//		}
		int temp1[] = new int[temp.length - 1];
		for (int i = 0; i < temp1.length; i++) {
			if (i < 4)
				temp1[i] = ar[i];
			else
				temp1[i] = ar[i + 3];
		}
		for (int i = 0; i < temp1.length; i++) {
			System.out.println(temp1[i]);
		}
	}

}
