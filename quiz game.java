//Quiz game
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        char choice;
        int count =0;

    do{
        System.out.println("What is the capital of France?\nA. France\nB. Quebec\nC.New York ");
        choice = sc.next().charAt(0);
        if (choice =='A' || choice=='a'){
            System.out.println("Correct Answer.");
            count++;
        } else {
            System.out.println("Incorrect.");
        }
        System.out.println("What is the capital of Bangladesh?\nA. Chittagong\nB. Dhaka\nC. Rangpur ");
        choice = sc.next().charAt(0);
        if (choice =='B' || choice=='b'){
            System.out.println("Correct Answer.");
            count++;
        }else{
            System.out.println("Incorrect.");
        }
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Total score point "+count+"/2");

        System.out.println("Do you want to continue? (Y/N)");
         choice = sc.next().charAt(0);
    } while (choice== 'Y' || choice == 'y');
    sc.close();

    }
}
