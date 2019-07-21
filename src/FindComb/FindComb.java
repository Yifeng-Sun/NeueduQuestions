package FindComb;

import java.util.Scanner;

public class FindComb {
    public static void main(String[] args) {
        System.out.println("Input values one by one, input 'x' to indicate the end of the list:");
        System.out.print(">");
        Scanner sc = new Scanner(System.in);
        int[] arr;
        int target = 0;
        arr = new int[999];
        int i = 0;
        try {
            while(i != 999){
                arr[i] = sc.nextInt();
                i += 1;
                System.out.print(">");
            }
        } catch (Exception e) {
            System.out.println("Okk, input your target.");
            System.out.print(">");
            Scanner sc2 = new Scanner(System.in);
            target = sc2.nextInt();
        }

        int re[] = twoSum(arr,target);
        if(re[1] != 999){
            System.out.println("We find your target at position " + re[0] + " and position " + re[1]);
        }else System.out.println("No target founded.");
    }
    public static int[] twoSum(int[] nums, int target) {
        int m = 0;
        int n = 0;
        for(m = 0; m < nums.length; m ++){
            for(n = 0; n < nums.length; n ++){
                if((nums[m] + nums[n]) == target){
                    int[] result ={m,n};
                    return result;
                }
            }
        }
        int[] result = {999,999};
        return result;
    }

}
