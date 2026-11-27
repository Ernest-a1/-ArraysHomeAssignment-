
import java.util.Scanner;
public class Array_HomeWork_27NOV {
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);

        /// Task 11
        //Create an array of 8 integers. Add values at indices 1, 3, 5, and 7.
//        int [] a= {1,23,655,33,88,46,96,32};
//        int sum= 0;
//        for(int i=0 ;i<a.length; i++){
//            if(i%!=0)
//                sum+= a[i];
//        }
//        System.out.println("Sum: "+ sum);

        ///task 12
        //Ask the user for 10 integers. Count values divisible by 3 (including zero).
//        int []  a = {135,57,34,23,66,87,54,23,86,55};
//        int c = 0;
//        for(int i =0; i<a.length; i++){
//            if(a[i]%3==0)
//                c++;
//        }
//        System.out.println("Count: "+ c);

        ///task 13
        //Create an array of 8 integers. Ask for a value and print its first index or Not found.

//        int[] a = {1,23,655,33,88,46,96,32};
//        System.out.print("Search: ");
//        int b = sc.nextInt();
//        for(int i = 0; i< a.length; i++){
//            if (a[i] == b) {
//                System.out.println("Index: " + i);
//                break;
//            }
//        }
//        System.out.println("Not found");

        ///Task 14
        //Create an array of 7 integers. Ask for a limit; replace every larger value with the limit.

//        int [] a ={26,55,12,89,564,433,255};
//        System.out.print("Enter limit: ");
//        int b = sc.nextInt();
//        System.out.println("BEFORE:");
//        for(int i = 0; i< a.length;i++)
//            System.out.print(a[i]+" ");
//        System.out.print("\nAFTER:");
//        for ( int i = 0; i<a.length; i++){
//            if(a[i]<b)
//                a[i]=b;
//            System.out.print(a[i]+" ");
//        }
        ///Task 15
        //Store 5 item prices in an int[] array. Print the total and average price.


//        int [] a = {45, 60,70,35,95};
//        int c=0,sum=0;
//        for(int i =0;i<a.length;i++){
//            sum+=a[i];
//            c++;
//        }
//        System.out.println("Total: "+ sum + " Average: "+ (sum/c));

        ///Task 16
        //Ask for 6 scores (0–100). Store them, count scores >= 60, and print the pass count.
//        int [] a= new int[6];
//        int p =0;
//        for(int i =0; i<a.length; i++){
//            System.out.print("Enter  score "+(i+1)+" :");
//            a[i]= sc.nextInt();
//            if(a[i]>=60)
//                p++;
//        }
//
//        System.out.println("Passed: "+ p);

        ///task 17
        // Create an array of 6 integers and a second array with every value doubled. Print both.

//        int [] a = {1,2,3,4,5,6};
//        int [] b= new int [6];
//        System.out.println("Arr_1");
//        for(int i =0;i<a.length;i++){
//            System.out.print(a[i]+" ");
//            b[i]=(a[i]*2);
//        }
//        System.out.println("\nArr_2:");
//        for(int i =0;i<a.length;i++){
//            System.out.print(b[i]+" ");
//        }

        ///task 18
        //Create two arrays of 6 integers. Count positions where both arrays have equal values.

//        int [] a={5,8,7,4,6,3};
//        int [] b={4,8,5,4,6,9};
//        int m=0;
//        System.out.print("Arr_1: ");
//
//        for (int i = 0; i < a.length; i++) {
//            System.out.print(a[i] + " ");
//        }
//        System.out.print("\nArr_2: ");
//        for (int i = 0; i < a.length; i++) {
//            System.out.print(b[i] + " ");
//            if(a[i]==b[i])
//                m++;
//        }
//        System.out.print("\nMatches: "+m);

        ///task 19
        //Create a 3×3 integer matrix. Print the sum of each row separately.

//        int [][]  a={
//                {1,2,3},
//                {4,5,6},
//                {7,8,9}
//        };
//        for (int i = 0; i < a.length; i++) {
//            System.out.print("|");
//            for (int j = 0; j < a[i].length; j++) {
//                System.out.print(" " +a[i][j] + " ");
//            }
//            System.out.println("|");
//        }
//        int s=0;
//        System.out.println();
//        for (int i = 0 ; i<a.length;i++){
//            System.out.print("sum of Row "+ (i+1)+" : ");
//
//            for (int j = 0;j<a[i].length; j++ ){
//                s+=a[i][j];
//            }
//            System.out.println(s);
//            s=0;
//        }


        ///Task 20
        //Create a 3×4 integer matrix. Print the largest number in each row.

        int [][]  a={
                {1,24,10,3},
                {4,36,15,6},
                {7,32,43,9}
        };
        int l=0;
        for (int i = 0; i < a.length; i++) {
            System.out.print("|");
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(" " +a[i][j] + " ");
                if(l<a[i][j])
                    l=a[i][j];
            }
            System.out.print("|");
            System.out.println(" Largest from row "+(i+1)+" : "+l);
            l=0;
        }
    }
}
