import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Let's play Rock Paper Scissors.");
        System.out.println("When I say 'shoot', Choose: rock, paper, or scissors.\n");
        System.out.println("Are you ready? Write 'yes' if you are.");

        String input = scan.nextLine();

        switch (input) {
            case "yes":
                System.out.println("Great");
                System.out.println("rock - paper - scissors, shoot!");

                String choice = scan.nextLine();
                String compChoice = computerChoice();
                String res = result(choice, compChoice);
                printResult(choice, compChoice, res);
                break;

            case "no":
                System.out.println("Darn, some other time");
                break;

            default:
                System.out.println("Invalid input. (yes/no)");
                break;
        }
        scan.close();
    }

    public static String computerChoice() {
        int randomNumber = (int) (Math.random() * 3);
        switch (randomNumber) {
            case 0:
                return "rock";
            case 1:
                return "paper";
            case 2:
                return "scissors";
            default:
                return "Error";
        }
    }

    public static String result(String yourChoice, String computerChoice) {
        String result;
        if ((yourChoice.equalsIgnoreCase("rock") && computerChoice.equalsIgnoreCase("scissors")) ||
                (yourChoice.equalsIgnoreCase("paper") && computerChoice.equalsIgnoreCase("rock")) ||
                (yourChoice.equalsIgnoreCase("scissors") && computerChoice.equalsIgnoreCase("paper"))) {
            result = "You win!";
        } else if ((computerChoice.equalsIgnoreCase("rock") && yourChoice.equalsIgnoreCase("scissors")) ||
                (computerChoice.equalsIgnoreCase("paper") && yourChoice.equalsIgnoreCase("rock")) ||
                (computerChoice.equalsIgnoreCase("scissors") && yourChoice.equalsIgnoreCase("paper"))) {
            result = "You Lose!";
        } else {
            result = "It's a tie";
        }
        return result;
    }

    public static void printResult(String yourChoice, String computerChoice, String result) {
        System.out.println("You chose: " + yourChoice);
        System.out.println("The computer chose: " + computerChoice);
        System.out.println(result);
    }
}
