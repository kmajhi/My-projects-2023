import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char choice;
        float num1, num2;

        do {
            System.out.print(">>Enter the operator[ + - * / ] =>>\t");
            char ch = sc.next().charAt(0);

            switch (ch) {
                case '+':
                    System.out.print("Enter the first number:>>\t");
                    num1 = sc.nextFloat();
                    System.out.print("Enter the second number:>>\t");
                    num2 = sc.nextFloat();
                    float sum = num1 + num2;
                    System.out.println("\nSum>> " +num1+" + "+num2+ " =\t" + sum);
                    break;

                case '-':
                    System.out.print("Enter the first number:>>\t");
                    num1 = sc.nextFloat();
                    System.out.print("Enter the second number:>>\t");
                    num2 = sc.nextFloat();
                    float difference = num1 - num2;
                    System.out.println("\nDifference>> "+num1+" - "+num2+ " =\t" + difference);
                    break;

                case '*':
                    System.out.print("Enter the first number:>>\t");
                    num1 = sc.nextFloat();
                    System.out.print("Enter the second number:>>\t");
                    num2 = sc.nextFloat();
                    float multi = num1 * num2;
                    System.out.println("\nMultiplication>> "+num1+" x "+num2+ " =\t" + multi);
                    break;

                case '/':
                    System.out.print("Enter the first number:>>\t");
                    float num3 = sc.nextFloat();
                    System.out.print("Enter the second number:>>\t");
                    float num4 = sc.nextFloat();
                    float division = num3 / num4;
                    System.out.println("\nDivision>> "+num3+" / "+num4+ " =\t" + division);
                    break;

                default:
                    System.out.println("Wrong input. Please enter only '+' or '-' or '*' or '/'\n");
                    break;
            }

            System.out.println("\n---- Do you want to continue? (Y/N) ----");
            choice = sc.next().charAt(0);

        } while (choice == 'Y' || choice == 'y');

        sc.close();
    }
}
