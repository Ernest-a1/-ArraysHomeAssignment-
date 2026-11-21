import java.util.Scanner;
public class task3 {
    public static void main(String[] args){
        int[] n= {10, 20, 30, 40, 50};
        Scanner s1 = new Scanner(System.in);
        int s=0;
        int b=0;
        System.out.print("\nOriginal: ");
        for (int i = 0; i < n.length; i++) {
            System.out.print(n[i] + " ");
        }
        int r = 0;
        for (int k = 0 ; k<1 ; k++){
            System.out.print("\nEnter index to remove: ");
            int l = s1.nextInt();
            if(l>=n.length){
                System.out.println("Invalid index");
                break;
            }
            r+=l;
            System.out.println();
            int[] a = new int[n.length - 1];
            for (int i = 0, j=0; i < n.length; i++) {

                if (i != r) {
                    a[j] = n[i];
                    j++;
                }
            }
            System.out.print("\nUpdated: ");
            for (int i = 0; i < a.length; i++) {
                System.out.print(a[i] + " ");
            }
        }
    }
}
