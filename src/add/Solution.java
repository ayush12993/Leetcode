package add;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        //First i will get array length that is l and k for storing temp variable
        int l = nums.length;
        int k;
        // then i will create the for loop for it to create the range up to the length

        for(
                int i=0;i<l;i++
        ){
            // Now we will create another loop like nested for loop
            for(
                    int j=0;j<l;j++
            ){
                //Now we will compare it to check same positions value should not be added
                if(i!=j){
                    //Now we will add the two different positions value
                    k=nums[i]+nums[j];
                    //After adding we will compare it with the target
                    if (k==target){
                        // Define new array and put two values in it
                        return new int[]{i,j};
                    }
                }
            }
        }
//Other wise return nothing
return null;

    }
}