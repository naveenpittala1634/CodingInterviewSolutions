package demopack1;
import java.util.*;
public class DistinctPairsUsingHashing
{
	public static void main(String[] args) 
	{
		Integer input[]={1,1,2,4,5,5,3,3,3,3};
		int k=6;
		int ans=SumPairs(input,k);
		System.out.println(ans);
	}
	public static int SumPairs(Integer[] input, int k)
	{
    Map<Integer, Integer> frequencies = new HashMap<>();
    Map<Integer,Integer> hm=new HashMap<>();
    int pairsCount = 0;      

    for(int i=0; i<input.length; i++){
        int value = input[i];
        int complement = k - input[i];

        if(frequencies.containsKey(complement)){                
            if(hm.containsKey(value)==false)
            {
            pairsCount++;
            hm.put(value,complement);
            
            System.out.println(value + ", " + complement); 
            }
        }
            else if(frequencies.containsKey(value)==false){
                frequencies.put(value, 1);
            }
        
    }
    return pairsCount;
}
}
