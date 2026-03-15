import java.util.*;
class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int target)
    {
        ArrayList<Integer> result = new ArrayList<>();
        for(int i = 0; i < arr.length; i++)
            {
            int sum = 0;
            for(int j = i; j < arr.length; j++) 
            {
                sum += arr[j];
                if(sum == target) {
                    result.add(i + 1);
                    result.add(j + 1);
                    return result;
                }
            }
        }
        result.add(-1);
        return result;
    }
}
