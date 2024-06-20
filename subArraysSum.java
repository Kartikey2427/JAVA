import java.util.Scanner;

public class subArraysSum {

    public static void maxSumSubArrays(int numbers[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j ;
                currSum =0;
                    
                for (int k = start; k <= end; k++) {
                    //printing values
                    // System.out.println(numbers[k] + " ");

                    // sum of subarrays
                    currSum = currSum + numbers[k];
                }
                System.out.println(currSum);
                if (currSum> maxSum) {
                    maxSum = currSum;
                }
                
            }
        }
        System.out.println("Maximum Sum :" + maxSum);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice : ");
        int numbers[] = new int[sc.nextInt()];
        System.out.println("Enter values :");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }
        maxSumSubArrays(numbers);

    }
}
