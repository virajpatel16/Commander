/*1. Write a java program using Wrapper Class by creating a simple calculator using switch case.*/
import java.util.Scanner;

import javax.swing.plaf.ScrollBarUI;
public class wrap{

    public static void main(String[] args) {
     


        Integer  a,b,c;

        Scanner Sc= new Scanner(System.in);
        System.out.println("enter the a");
        a=Sc.nextInt();
        System.out.println("enter the b");
        b=Sc.nextInt();
        System.out.println("enter the c");
        c=Sc.nextInt();
        




        System.out.println("enter the choice ..");
        System.out.println(" 1.addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        System.out.println("5.Remainder divisio");


        Integer choice;

        Scanner x =new Scanner(System.in);
        choice =x.nextInt();
       

        switch(choice){

            case 1:
            c=a+b;
            System.out.println("the number"+c);
            break;
            case 2:
            c=a-b;
            System.out.println("the number"+c);
            break;
            case 3:
            c=a*b;
            System.out.println("the number"+c);
            break;
            case 4:
            c=a/b;
            System.out.println("the number"+c);
            break;
            case 5:
            c=a%b;
            System.out.println("the number"+c);
            break;
            default:
            System.out.println("error");
            break;
                
        }
        
    }


}
