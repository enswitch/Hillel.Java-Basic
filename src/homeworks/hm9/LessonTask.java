package homeworks.hm9;

import java.util.Arrays;

public class LessonTask {

    public static void main(String[] args) {

        int arr[] = new int[10];


        int temp;
        for (int i = 0; i < arr.length; i++) {
            int random = (int) (Math.random() * 100);
            arr[i] = random;
        }
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        temp = arr[0];
        arr[0] = arr[arr.length - 1];
        arr[arr.length - 1] = temp;

        System.out.println(Arrays.toString(arr));


    }
}
