import java.util.Scanner;

public class Main {

    static int isPrimeNumber(int num , int i){
        if(i < num)
        {
            if(num % i != 0)
            {
                return(isPrimeNumber(num, ++i));
            }
            else
            {
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int n= scan.nextInt();

        int x=isPrimeNumber(n,2);
       if (x==1 ){
           System.out.println(n+" Asal sayıdır");
       }else
           System.out.println(n+" Asal sayı değildir");


    }
}