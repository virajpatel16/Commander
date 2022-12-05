//2. Write a java program to perform addition of two arrays and store it into another array.

public class array {

    public static void main(String[] args) {
         int a[]={11,22,33,44,55};
         int b[]={33,44,55,66,77};
         int c[]={0,0,0,0,0};


         for (int i = 0; i < a.length; i++) {
            c[i] = a[i] + b[i];
         }

         for (int i = 0; i < a.length; i++) {
            System.out.println("C Lang = "+a[i]);
        }

    }


    
}
