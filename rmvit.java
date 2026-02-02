public class rmvit {
    static void findd(int arr[]) {

        int i = 0;

        for (int j = 1; j < arr.length; j++) {
            if (arr[j] != arr[i]) {
                i++;              // move first
                arr[i] = arr[j];  // then assign
            }
        }

        for (int idx = 0; idx <= i; idx++) {
            System.out.println(arr[idx]);
        }
    }

    public static void main(String[] args) {
        int arr[] = {12, 12, 23, 110, 110, 220};
        findd(arr);
    }
}
