//NUMBER GUESSING GAME*************************

import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Random;
public class Task2{
   
      private static final int LOWER=1;
      private static final int HIGHER=100;
      private static final int rounds=5;
      private static final int guess=5;



    public static void main(String[] args) {
        Random rand=new Random();
        Scanner sc=new Scanner(System.in);
        int totalscore=0;
        System.out.println("LET's start NUMBER GUSSING GAME\n********* Total rounds =5*********\n In each round you have 5 guess\n");
        for(int i=1;i<=rounds;i++){
            System.out.println("_____________________WELCOME TO ROUND" + i +"________________________ ");
            boolean flag=false;
            int guess_number= rand.nextInt(HIGHER)+LOWER;
            int choice =1;
            while(choice <=guess){
                choice++;
                System.out.println("Enter your guessing");
                int number=takeInput();
                if(number==-1){
                    System.out.println("YOU LOST a CHANCE ");
                    continue;
                }
                if(number < 1 && number >100 ){
                    System.out.println("INVALID INPUT");
                    System.out.println("PLEASE RESTART THE GAME ");
                    System.exit(1);
                }
                if(number==guess_number){
                    System.out.println("HURRAYYYYY******************");
                    System.out.println("Correct guess");
                    totalscore+=100;
                    flag=true;
                    break;

                }
                else if(number > guess_number){
                    System.out.println("OH NO WRONG GUESSS");
                    System.out.println("***************Guess lower value******************");
                }
                else{
                    System.out.println("OH NO WRONG GUESSS");
                    System.out.println("*******************Guess something higher*******************");
                }
            }
            if(flag==false){
                System.out.println("**********************NO CHOICES LEFT*******************");
                break;
            }
            
        }
        System.out.println();
        System.out.println("***************GAME OVER****************");
        System.out.println("________________YOUR SCORE_____________="+ totalscore);
        System.out.println();

    }
    public static int takeInput(){
        Scanner sc=new Scanner(System.in);
        int n=-1;
        try{
            n=sc.nextInt();
        }
        catch(InputMismatchException e){
            System.out.println("please enter a valid input from 1 to 100");
        }
        return n;
    }
}