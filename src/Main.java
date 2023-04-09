public class Main {
    public static void main(String[] args) {
    }
    public static int findMin(int[] arr) {
        int min = arr[0];
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("min");

        return min;

    }
}