//finding pairs and their count using hashing

package demopack1;
import java.util.*;
public class PairsUsingHashing
{
	public static void main(String[] args) {
		Integer input[]={1,2,3,4,5,6,7};
		int k=3;
		int ans=SumPairs(input,k);
		System.out.println(ans);
	}
	public static int SumPairs(Integer[] input, int k){
    Map<Integer, Integer> frequencies = new HashMap<>();
    Map<Integer,Integer> hm=new HashMap<>();
    int pairsCount = 0;      

    for(int i=0; i<input.length; i++){
        int value = input[i];
        int complement = k - input[i];

        if(frequencies.containsKey(complement)){                
            
            
            System.out.println(value + ", " + complement); 
            }
        else{
            if(frequencies.containsKey(value)){         
                frequencies.put(value, frequencies.get(value) + 1);             
            }else{
                frequencies.put(value, 1);
            }
        }
    }
    return pairsCount;
}
}