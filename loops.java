import java.util.Scanner;

public class loops {
    public static void main(String[] args) {

        /*
        Syntax of for loop:
            for(initialization; condition; updation){
                //body
            }
         */
        // print numbers from 1 to 5
        for(int num = 1; num<=5;num++){
            System.out.println(num);
        }

        //print numbers from 1 to n

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the limit");
        int n = in.nextInt();
        for (int num = 1; num <= n ; num++) {
            System.out.print(num + " ");
        }
        System.out.println(" ");

        // while loop
        /*
        Syntax:
        while (condition){
            //body
        }
         */
        System.out.println("while loop");
        int num = 1;
        while(num<=5){
            System.out.println(num);
            num += 1;
        }

        //do-shile loop
        /*
        Syntax:
        do{
            //body
        }while (condition);
         */
        System.out.println("do-while loop");
        int a = 1;
        do{
            System.out.println(a);
            a++;
        }while(a<=5);
    }
}
