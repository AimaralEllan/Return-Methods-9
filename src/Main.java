import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random=new Random();
        System.out.println(getSalyshtyr(input.nextInt(),random.nextInt(1,5)));
        //System.out.println(method(input.nextInt()));
       // getAge(2022,2003);
        //System.out.println("I am "+myAge+" years old");

        //System.out.println("==>"+getArif(input.nextInt()));

    }

    /*public static String method(int number) {
        if (number == 1) {
            return "Hello";
        } else if (number == 2) {
            return "Good Bye";
        } else {
            return "There is not command";
        }
    }*/

    /*public static int getArif(int number){
        int sum=0;
        for (int i = 0; i < number; i++) {
           sum=sum+i;
           System.out.println(i+" ");
        }
        return sum;
    }*/

    public static boolean getSalyshtyr(int number1, int number2){
        if (number1==number2){
            return true;
        }else{
            return false;
        }
    }
}