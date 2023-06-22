import java.util.Scanner;

public class VetorString {

    public static void main(String[] args) {
        String[] vetorString = new String[10];
        vetorString[0] = "SOLID";
        vetorString[1] = "Singleton";
        vetorString[2] = "Factory";
        vetorString[3] = "Abstract Factory";
        vetorString[4] = "Builder";
        vetorString[5] = "Prototype";
        vetorString[6] = "Adapter";
        vetorString[7] = "Composite";
        vetorString[8] = "Proxy";
        vetorString[9] = "Facade";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of the design patter you want to search for...");
        String search = scanner.next();
        boolean control = false;
        for (int i = 0 ; i < vetorString.length ; i++)
        {
            if(search.equalsIgnoreCase(vetorString[i]))
            {
                control = true;
                break;
            }
        }
        if (control)
        {
            System.out.println("This Design Patter exist on List: " + search);
        }
        else
        {
            System.out.printf("there's no design pattern with this name %s, sorry...", search);
        }
    }
}
