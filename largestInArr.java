import java.util.Scanner;

public class largestInArr {
    
    public static int getLargest(int numbers[]) {
        int largest = Integer.MIN_VALUE; // it signifies minus infinity
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (largest < numbers[i]) {
                largest = numbers[i];
            }
            if (smallest > numbers[i]) {
                smallest = numbers[i];
            }
        }
        System.out.println("Smallest number is " + smallest);
        return largest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter choice of yours");
        int numbers[] = new int[sc.nextInt()];
        System.out.println("Enter values in array:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }
        System.out.println("Largest number is :" + getLargest(numbers));
    }
}
