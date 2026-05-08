package collage.Array;

class bubbleSort {
    public static void main(String[] args) {
        int arr[] = {5, 3, 2,8,7,1, 4};
        int n = arr.length;

        for(int i = 0; i < n-1; i++) {
            for(int j = 0; j < n-i-1; j++) {
                if(arr[j] > arr[j+1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        for(int num : arr) {
            System.out.print(num + " ");
        }
    }
}