package collage.Array;

public class last_occurance {
    public static void main(String[] arg) {
        int[] arr = {5, 2, 9, 2, 7, 2};
        int key = 2;
        int firstIndex = -1;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == key) {
                System.out.println("first occurance index is " + i);
                firstIndex = i;
                break;
            }
        }
        if (firstIndex == -1) {
            System.out.println("key is not find");
        }
    }
}
