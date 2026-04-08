package app.net.amayra_AVM;

import java.util.Scanner;

public class Output {
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        {
            System.out.println("Enter value x : ");
            int x = sc.nextInt();
            System.out.println("Enter value y : ");
            int y = sc.nextInt();


            // operations
            System.out.println("Addition value: " + (x + y));
            System.out.println("Subtraction value: " + (x - y));
            System.out.println("Multiplication value: " + (x * y));
            System.out.println("Division value: " + (x / y));
            System.out.println("Modulus value: " + (x % y));

//            git init
//            git add README.md
//            git commit -m "first commit"
//            git branch -M main
//            git remote add origin https://github.com/akashvanduas-commits/vandu-codebase-java.git
//        git push -u origin main


        }
    }
}


