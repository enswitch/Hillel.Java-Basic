package homeworks.hm9;

public class IncreaseSort {
    public static void main(String[] args) {
        int arr[] = {-4, 8, 2, 5, 12, -7, 0, -1, 9, 4, 15, -16};

        increaseSort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void increaseSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }

    }


}
