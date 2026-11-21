public class task2 {
    public static void main(String[] args){
        int [] a =  {8,-7,-3,5,-6,9};
        int l=0, sl=0;
        System.out.print("Original: ");
        for ( int j = 0 ; j< a.length; j++){
            System.out.print(a[j]+ " ");
        }
        System.out.print("\n");
       for ( int i = 0 ; i< a.length; i++){
           if(a[i]>sl ){
               l=a[i];
           }
       }
       for ( int k= 0 ; k< a.length; k++){
            if(a[k]>sl  && a[k]<l){
                sl=a[k];
            }
       }
       if(l==sl)
           System.out.println("No second largest distinct number.");
        System.out.println("Largest: "+ l);
       System.out.println("Second largest: "+ sl);
    }
}
