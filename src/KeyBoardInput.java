import java.util.Scanner;

public class KeyBoardInput {

    public static void main(String[] args) {

        Scanner keyBoard= new Scanner(System.in);

        System.out.println("KeyBoardInput");

        String name = keyBoard.nextLine();

        System.out.println("Name is " + name);
    }
}
