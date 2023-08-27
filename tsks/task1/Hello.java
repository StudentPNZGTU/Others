import java.util.Scanner;

class Hello {
    public static void main(String[] args) {
        System.out.println("Enter the user name:");

        Scanner scan = new Scanner(System.in);

        String name = scan.nextLine();

        System.out.println("Привет, " + name + "!");
    }
}
