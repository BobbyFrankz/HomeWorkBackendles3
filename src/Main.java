import java.util.Scanner;

public class Main {



    public static void main (String[] args) {
        boolean play = true;
        String ongeldig = "Ongeldige invoer";
        String  input;

        while (play) {
            Scanner scanner = new Scanner(System.in);

            Integer[] numeric = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
            String[] alphabetic = {"Een", "Twee", "Drie", "Vier", "Vijf", "Zes", "Zeven", "Acht", "negem", "nul"};

            System.out.println("type 'x' to stop and type v to continue");
            input = scanner.nextLine().toLowerCase();

            if(input.equals("x")) {
                play = false;
            } else if(input.equals("v")) {
                System.out.println("Give your number 0 to 10");
                int inputScanner = scanner.nextInt();
                System.out.println();
                Translator translate = new Translator(alphabetic, numeric);
                String answer = translate.translate(inputScanner);
                System.out.println(answer);
            }else {
                  System.out.println(ongeldig);
            }


        }

    }
}
