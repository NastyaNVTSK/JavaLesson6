import java.util.Scanner;

public interface OrderConsoleInputReader  {

    public static Order readFromConsole() {
        String clientName = prompt("Client name: ");
        String product = prompt("Product: ");
        int qnt = Integer.parseInt(prompt("Quantity: "));
        int price = Integer.parseInt(prompt("Price: "));
        return new Order(clientName, product, qnt, price);
    }

    private static String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
    
}
