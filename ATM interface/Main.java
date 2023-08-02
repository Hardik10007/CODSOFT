import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Atmoperationsinter op = new Atmoperation();
       int Atmnumber= 12345;
       int atmpin= 123;
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the ATM Machine");
        System.out.println("enter atm no:");
        int atmnumber = sc.nextInt();
        System.out.println("enter atm pin:");
        int pin = sc.nextInt();
        if ((atmnumber==Atmnumber)&&(atmpin==pin)){
            System.out.println("validation complete");
            while (true){
                System.out.println("1.view balance\n 2.withdraw\n 3.deposit\n 4.view statement\n 5.exit");
                System.out.println("enter the choice");
                int ch= sc.nextInt();
                if(ch==1){
                    op.viewbalance();
                }
                else if(ch==2){
                    System.out.println("enter the amount to withdraw:");
                    double withdrawnamount = sc.nextDouble();
                    op.withdraw(withdrawnamount);
                }
                else if(ch==3   ){
                    System.out.println("enter amount to deposit:");
                    double depositamount = sc.nextDouble();
                    op.deposit(depositamount);
                }
                else if(ch==4){
                    op.viewstatement();
                }
                else if(ch==5){
                    System.out.println("Collect your ATM card\n Thank you for using the ATM Machine");
                    System.exit(0);
                }
                else {
                    System.out.println("Please enter valid Choice");
                }
            }
        }
        else {
            System.out.println("validation failed... incorrect details");
        }
        System.exit(0);
    }
}