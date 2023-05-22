import java.util.Scanner;

public class grade {
    public static void main(String[] args) {

        int math, physics, turkish, chemistry, music;

        Scanner input = new Scanner(System.in);

        System.out.print("Your math grade :");
        math = input.nextInt();

        System.out.print("Your physics grade :");
        physics = input.nextInt();

        System.out.print("Your turkish grade : ");
        turkish = input.nextInt();

        System.out.print("Your chmeistry grade :");
        chemistry = input.nextInt();

        System.out.print("Your music grade :");
        music = input.nextInt();

        if (math < 0 || math > 100 || physics < 0 || physics > 100 || turkish < 0 || turkish > 100 || chemistry < 0 || chemistry > 100 || music < 0 || music > 100) {
            System.out.println("You entered an invalid grade. Please enter a grade between 0 and 100");
        } else {
            double avarage = (math + physics + turkish + chemistry + music) / 5;
            System.out.println("Your grade avarage is : " + avarage);
            if (avarage >= 55) {
                System.out.println("Your grade avarage is above 55. You passed the class.");
            } else {
                System.out.println("You failed the class. ");
            }
        }
    }
}