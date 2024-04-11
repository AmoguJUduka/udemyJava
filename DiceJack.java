import java.util.Scanner;

public class DiceJack {
    public static void main(String [] args){

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter first choice");
    int num1 = sc.nextInt();

    System.out.println("Enter second choice");
    int num2 = sc.nextInt();

    System.out.println("Enter third choice");
    int num3 = sc.nextInt();

    int roll1 = rollDice();
    int roll2 = rollDice();
    int roll3 = rollDice();

    int sum1 = num1 + num2 + num3;
    int sum2 = roll1 + roll2 + roll3;

    int diff = sum1 - sum2;
    diff = Math.abs(diff);
    
    if(sum1 > sum2 && diff < 3){
        System.out.println("User wins");
    }
    else
    System.out.println("Computer wins");

    //System.out.println(roll1);
    //System.out.println(roll2);
    //System.out.println(roll3);

    sc.close();
    }
    //
    public static int rollDice(){

        double randomNumber = Math.random() * 6;
        randomNumber += 1;
        return (int)randomNumber;
    }

}
                                                                                                                                                                                                                                                     
