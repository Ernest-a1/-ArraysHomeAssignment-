public class task4 {
    public static void main(String[] args) {

        int[] a = {5,5,5,5,5,5,5,5};

        System.out.print("Array: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

        System.out.print("\nDuplicate numbers: ");

        for (int i = 0; i < a.length; i++) {

            boolean d = false;
            boolean aP = false;

            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    d = true;
                }
            }

            for (int k = 0; k < i; k++) {
                if (a[i] == a[k]) {
                    aP = true;
                }
            }

            if (d && !aP) {
                System.out.print(a[i] + " ");
            }
        }
    }
}
