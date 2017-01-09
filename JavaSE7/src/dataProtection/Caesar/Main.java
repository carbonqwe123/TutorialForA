package dataProtection.Caesar;

public class Main {
  public static void main(String[] args) {
        System.out.print("Enter the number: ");
        Scanner scanInput = new Scanner(System.in);
        if (scanInput.hasNextInt()) {
            int number = scanInput.nextInt();
            System.out.print("Вы ввели число: ");
            System.out.println(number);
        }

    }
}
