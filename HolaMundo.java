import java.util.Scanner;

public class HolaMundo {

    public static void main(String[] args) {
        System.out.println("Hola Samuel");

        System.out.print("Que mas?");

        System.out.printf("Esto es una cadena: %s", "Samuel");
    
        var scanner = new Scanner(System.in);

        scanner.close();
    }
}

