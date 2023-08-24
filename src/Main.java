public class Main {
    public static void main(String[] args) {
        int[] A1 = {3, 1, 2};
        System.out.println(countElementsWithGreater(A1)); // Output: 2

        int[] A2 = {5, 5, 3};
        System.out.println(countElementsWithGreater(A2)); // Output: 1
    }

    public static int countElementsWithGreater(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            boolean hasGreater = false;
            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[j] > arr[i]) {
                    hasGreater = true;
                    break;
                }
            }
            if (hasGreater) {
                count++;
            }
        }
        return count;
    }
}
