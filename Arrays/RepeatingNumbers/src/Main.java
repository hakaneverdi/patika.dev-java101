public class Main {
    public static void main(String[] args) {
        int[] numbers = { 3, 2, 3, 2, 1, 9, 8, 10, 8};
        findReapeting(numbers);
    }

    public static void findReapeting(int[] arr) {
        System.out.println("Repeating even numbers:");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) { // yalnızca çift sayılar için
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] % 2 == 0 && arr[i] == arr[j]) {
                        System.out.println(arr[i]);
                        break; // tekrar yazdırmaması için döngü kırılır
                    }
                }
            }
        }
    }
}
