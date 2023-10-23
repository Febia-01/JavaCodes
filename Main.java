import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the series without space");
        int series = in.nextInt();
        System.out.println("Enter the number to check the occurrence");
        int check = in.nextInt();
        int count=0;

        while (series>0){
            int rem = series%10;
            if(rem==check){
                count++;
            }
            series = series/10;
        }
        System.out.println(count);
    }
}