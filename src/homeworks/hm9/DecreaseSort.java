package homeworks.hm9;

public class DecreaseSort {
    public static void main(String[] args) {
        int arr[] = {-5, 2, 8, -9, 3, 7, 11, -4, -1, 9, 0, 13};

        decreaseSort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void decreaseSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n - i; j++) {
                if (arr[j] > arr[j - 1]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

    }
}
