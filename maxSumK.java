import java.util.Scanner;

// Kadanes algo for calculating maximum sub array sum

public class maxSumK {

    public static void kadanesMaxSum(int numbers[]) {

        int cs=0 ;
        int ms = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            cs = cs + numbers[i];
            if (cs < 0) {
                cs = 0;
            }
            ms = Math.max(ms, cs);
        }
        System.out.println("Maximum sum = " + ms);
    }

    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice : ");
        int numbers[] = new int[sc.nextInt()];
        System.out.println("Enter values : ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }
        kadanesMaxSum(numbers);
    }
}
