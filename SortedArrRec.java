public class SortedArrRec {
    
    // whether array is sorted or not

    public static boolean isSorted(int arr[] , int i){
        if (i == arr.length - 1) {
            return true;
        }
        if (arr[i]> arr[i + 1]) {
            return false;
        }
        return isSorted(arr, i + 1); }

        // first occurence in array using recursion

        public static int firstOcc(int arr[] , int key , int i){
            if (i == arr.length) {
                return -1;
            }
            if (arr[i] == key) {
                return i;
            }
            return firstOcc(arr, key, i + 1);
        }

        // last occurence in array using recursion

        public static int lastOcc(int arr[] , int key, int i){

            if (i == arr.length) {
                return -1;
            }
            int isFound = lastOcc(arr, key, i + 1);
            if (isFound == -1 && arr[i] == key) {
                return i;
            }
            return isFound;
        }

        // calculating x to the power n 

        public static int power(int x, int n){
            if (n == 0) {
                return 1;
            }
            return x * power(x, n - 1);
        }
    
        // optimized code for x to the power n

        public static int optimizedPower(int a ,int x){
            if (x == 0) {
                return 1;
            }

            int halfPower = optimizedPower(a, x/2);
            int halfPowerSq = halfPower * halfPower;

            // if x is odd

            if (x % 2 != 0) {
                halfPowerSq = a * halfPowerSq ;
            }
            return halfPowerSq;
        }


    public static void main(String[] args) {

        int arr[] = { 1, 2 , 3 , 4 ,5 , 8};
        System.out.println(isSorted(arr, 0));

        // considering above array

        System.out.println(firstOcc(arr, 5, 0));

        int arr[] = { 4,4,8,9,4 , 45, 47 ,4};
        System.out.println(lastOcc(arr, 4, 0));

        System.out.println(power(2, 10));

        int a = 2;
        int x = 10;
        System.out.println(optimizedPower(a, x));
    }
}

