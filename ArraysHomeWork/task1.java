public class task1 {
    public static void main(String[] args){
        int [] a =  {8,-7,-3,5,-6,4,10,-9,2,1};
        int r =0;
        System.out.print("Original: ");
        for ( int i = 0 ; i< a.length; i++){
            System.out.print(a[i]+ " ");
            if(a[i]<0){
                a[i]=0;
                r++;}
        }
        System.out.print("\nModified: ");
        for ( int j = 0 ; j< a.length; j++){
            System.out.print(a[j]+ " ");
        }
        System.out.print("\nReplacements: "+ r);
    }
}

