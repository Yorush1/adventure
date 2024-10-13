import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Character c = new Character("Xiangling" , " welcome to Liyue. Your first objective is to explore this cave." , 100 , 100);
        System.out.println("Your name: " + c.name);
        System.out.println("Your current HP status: " + c.hp);
        System.out.println("Your current Mana: " + c.mana);
        c.display();

        Scanner scanner = new Scanner(System.in);
        String choice;


        do {
            System.out.println("Would you like to go in the cave?  Yes or No");
            choice = scanner.nextLine();
            if (choice.equals("No")) {
                System.out.println("Affirmative. Staying in Liyue...");
                scanner.close();
                return;
            } else if (!choice.equals("Yes")) {
                System.out.println("Invalid choice! Please type Yes or No.");
            }
        } while (!choice.equals("Yes"));
        System.out.println("Entering cave.... Please wait....");
        System.out.println("........");
        System.out.println("..LOADING..");
        System.out.println("........");




        do {
            System.out.println("There are 2 paths, Left and Right.");
            System.out.println("Would you like to go to the Left or Right?");
            choice = scanner.nextLine();
            if (!choice.equals("Left") && !choice.equals("Right")) {
                System.out.println("Invalid choice! Please type Left or Right.");
            }
        } while (!choice.equals("Left") && !choice.equals("Right"));


        if (choice.equals("Left")) {
            System.out.println("Monster ahead be careful - " + c.mana + " Mana");
        } else {
            c.mana +=88;
            System.out.println("New area explored, mana added + " + c.mana);


            String fightChoice;
            do {
                System.out.println("Monster found! Would you like to fight it? Yes or No");
                fightChoice = scanner.nextLine();
                if (!fightChoice.equals("Yes") && !fightChoice.equals("No")) {
                    System.out.println("Invalid choice! Please type Yes or No.");
                }
            } while (!fightChoice.equals("Yes") && !fightChoice.equals("No"));


            if (fightChoice.equals("Yes")) {
                System.out.println("You've fought the monster and won!!! Please proceed.");
                System.out.println("........");
                System.out.println("..LOADING..");
                System.out.println("........");
            } else {
                System.out.println("You chose to avoid the monster and proceeded to move.");
            }
        }


        do {
            System.out.println("You've reached the end of the cave. Would you like to exit the cave? Yes or No");
            choice = scanner.nextLine();
            if (!choice.equals("Yes") && !choice.equals("No")) {
                System.out.println("Invalid choice! Please type Yes or No.");
            }
        } while (!choice.equals("Yes") && !choice.equals("No"));


        if (choice.equals("Yes")) {
            System.out.println("Exiting the cave....");
            c.hp += 34;
            System.out.println("Welcome back to Liyue! You're getting extra HP: +" + c.hp);
            do {
                System.out.println("Would you like to leave the town?");
                choice = scanner.nextLine();
                if (!choice.equals("Yes") && !choice.equals("No")) {
                    System.out.println("Invalid choice! Please type Yes or No.");
                }
            } while (!choice.equals("Yes") && !choice.equals("No"));

            if (choice.equals("Yes")) {
                System.out.println("...Leaving the town....");
                System.out.println("...LOADING...");
                System.out.println("You've left the town. Goodluck on your adventure Traveler! We will miss you here!!!");
                System.out.println("We will miss you traveler. Just like how much i miss her...");
            }

        } else {
            System.out.println("Affirmative. Staying in the cave...");
        }

        scanner.close();
    }
}
