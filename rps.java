import java.util.Random;
import java.util.Scanner;
public class rps {
    public static void main(String args[]){
    int score1=0;
    int score2=0;
    Scanner s=new Scanner(System.in);
    Random rand=new Random();
    while(score1<5 && score2<5 ){
        int pc1=0;
        int user1=0;
        System.out.println();
        System.out.println();
        System.out.println("enter-1(rock)");
        System.out.println("enter-2(paper)");
        System.out.println("enter-3(scissor)");
        System.out.print("enter your input---");
        user1=s.nextInt();
        pc1=rand.nextInt(3)+1;
        if(user1==0){
            System.out.println("enter a valid number !");
        }
        else if (user1==1 && pc1==1) {
            System.out.println("rock------rock");
            System.out.println("match draw  retry!");
            System.out.println("pc-"+score1);
            System.out.println("player-"+score2);
            
        }
        else if(user1==1 && pc1==2){
            System.out.println("paper----rock");
            System.out.println("pc won the match");
            score1++;
            System.out.println("pc-"+score1);
            System.out.println("player-"+score2);
        }
        else if( user1==1  && pc1==3){
            System.out.println("scissor-----rock");
            System.out.println("player1 won the match");
            score2++;
            System.out.println("pc-"+score1);
            System.out.println("player-"+score2);
        }
        else if(user1==2 && pc1==1){
            System.out.println("rock---paper");
            System.out.println("player1 won the match");
            score2++;
            System.out.println("pc-"+score1);
            System.out.println("player-"+score2);
        }
        else if(user1==2 && pc1==2){
            System.out.println("paper---paper");
            System.out.println("match darw retry!");
            System.out.println("pc-"+score1);
            System.out.println("player-"+score2);
        }
        else if(user1==2 && pc1==3){
            System.out.println("scissor----paper");
            System.out.println("pc won the match");
            score1++;
            System.out.println("pc-"+score1);
            System.out.println("player-"+score2);
        }
        else if (user1==3 && pc1==1) {
            System.out.println("rock----scissor");
            System.out.println("pc won the match");
            score1++;
            System.out.println("pc-"+score1);
            System.out.println("player-"+score2);
        }
        else if(user1==3 && pc1==2){
            System.out.println("paper---scissor");
            System.out.println("player won the match");
            score2++;
            System.out.println("pc-"+score1);
            System.out.println("player-"+score2);
        }
        else if(user1==3 && pc1==3){
            System.out.println("scissor---scissor");
            System.out.println("match draw retry!");
            System.out.println("pc-"+score1);
            System.out.println("player-"+score2);
        }
        else{
            System.out.println("enter a valid input !! ");
        }
    }
    if (score1==5 || score2==5 ){
        System.out.println();
        System.out.println();
        System.out.println("game finished");
        if(score1==5){
            System.out.println("pc won the game");
        }
        else if(score2==5){
            System.out.println("player won the game");
        }
    }
    }
}
