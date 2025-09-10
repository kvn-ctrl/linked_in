import java.util.Random;
import java.util.Scanner;
public class gue{
    public static void main(String[]   args ){
    Scanner s=new Scanner(System.in);
    Random r=new Random();
    int user=0;
    int chance=5;
    int gen=r.nextInt(50)+1;
    System.out.println("totally 5 chances number range(1-50)");
    System.out.println("leave a game enter 000");
    while(user!=gen && chance !=0){
        System.out.println("guess the number : ");
        user=s.nextInt();
        if(gen==user){
            System.out.println("number guessed correctly  "+gen+"  ==  "+user);
            System.out.println("congrats!!");
        }
        else if(user<0 || user>50){
            System.out.println("enter a input in the valid range(0-50)");
        }
        else if(user==000){
            System.out.println("thank you");
        }
        else if(gen<user){
            System.out.println("retry");
            System.out.println("guess the lowest number than:  "+user);
            chance--;
            System.out.println("remaining chances : "+chance);
        }
        else if (gen>user) {
            System.out.println("retry");
            System.out.println("guess the highest number than :  "+user);
            chance--;
            System.out.println("remaining chances  :  "+chance);
        }

        }
        if (chance==0){
            System.out.println();
            System.out.println("chances over !!");
            System.out.println("game over !!");
            System.out.println("the number is "+gen);
        }
        }
    }
    
