import java.util.Scanner;
public class atm {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int pin=1111;
        double balance=5000;
        System.out.print("enter a four digit valid pin---");
        int pin1=s.nextInt();
        if (pin==pin1){
            System.out.println("pin is correct access granted!");
            int  choice=0;
            while(choice!=4){
                System.out.println("    ");
                System.out.println("deposit(click-1)");
                System.out.println("withdrawl(click-2)");
                System.out.println("check balance(click-3)");
                System.out.println("exit(click-4)");
                choice= s.nextInt();
                if(choice==1){
                    System.out.println("enter a amount to deposit");
                    double amount=s.nextDouble();
                    if(amount>0){
                        System.out.println("$ " +amount+ " amount deposited");
                        balance+=amount;
                    }
                    else{
                        System.out.println("please enter a valid amount to deposit");
                    }}
                else if(choice==2){
                    System.out.println("enter a amount to withdrawl");
                    double amount=s.nextDouble();
                    if(amount>0 && amount<=balance){
                        balance-=amount;
                        System.out.println("$"+amount+" withdrwl succesfully");
                    }
                    else{
                        System.out.println("insuffient balance");
                    }
                }
                else if(choice==3){
                    System.out.println("balance ś"+balance);
                }
                else if(choice==4){
                    System.out.println("thank you for using this atm ");
                }
                else{
                    System.out.println("Invalid choice try again");
                }
            }
        }
        else{
            System.out.println("wrong pin access denied");
        }
    }}
