import java.util.Scanner;

public class FruitShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fruit = scanner.nextLine();
        String day = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());
        double productPrice = 0;
        if (day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") || day.equals("Thursday ") || day.equals("Friday")) {
            if (fruit.equals("banana")) {
                productPrice = 2.50;
            } else if (fruit.equals("apple")) {
                productPrice = 1.20;
            } else if (fruit.equals("orange")) {
                productPrice = 0.85;
            } else if (fruit.equals("grapefruit")) {
                productPrice = 1.45;
            } else if (fruit.equals("kiwi")) {
                productPrice = 2.70;
            } else if (fruit.equals("pineapple")) {
                productPrice = 5.50;
            } else if (fruit.equals("grapes")) {
                productPrice = 3.85;
            }

        }

        if (day.equals("Saturday") || day.equals("Sunday")) {
            if (fruit.equals("banana")) {
                productPrice = 2.70;
            } else if (fruit.equals("apple")) {
                productPrice = 1.25;
            } else if (fruit.equals("orange")) {
                productPrice = 0.90;
            } else if (fruit.equals("grapefruit")) {
                productPrice = 1.60;
            } else if (fruit.equals("kiwi")) {
                productPrice = 3.00;
            } else if (fruit.equals("pineapple")) {
                productPrice = 5.60;
            } else if (fruit.equals("grapes")) {
                productPrice = 4.20;
            }

        }

        if (productPrice > 0) {
            double totalPrice = quantity * productPrice;
            System.out.printf("%.2f", totalPrice);
        } else {
            System.out.println("error");
        }
    }
}

