package demopack1;
import java.util.*;


class TripletsSum1
{
	static boolean find3Numbers(int A[], int arr_size, int sum)
	{
		for (int i = 0; i < arr_size - 2; i++) 
		{
			HashSet<Integer> s = new HashSet<Integer>();
			int curr_sum = sum - A[i];
			for (int j = i + 1; j < arr_size; j++) 
			{
				if (s.contains(curr_sum - A[j])) 
				{
					System.out.println("Triplets are: "+ A[i]+","+A[j]+","+(curr_sum - A[j]));
				}
				s.add(A[j]);
			}
		}
		return false;
	}
	public static void main(String[] args)
	{
		int A[] = { 0, -1, 2, -3, 1};
		int sum = -2;
		int arr_size = A.length;

		find3Numbers(A, arr_size, sum);
	}
}