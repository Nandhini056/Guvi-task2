import java.util.Scanner;

class Price {

    public static int findHighestPriceProductId(Product[] products) {
        int highestPriceProductId = products[0].getPid();
        double highestPrice = products[0].getPrice();

        for (int i = 1; i < products.length; i++) {
            if (products[i].getPrice() > highestPrice) {
                highestPrice = products[i].getPrice();
                highestPriceProductId = products[i].getPid();
            }
        }

        return highestPriceProductId;
    }


    public static double calculateTotalAmountSpent(Product[] products) {
        double totalAmount = 0;

        for (Product product : products) {
            totalAmount += product.getPrice() * product.getQuantity();
        }

        return totalAmount;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Product[] products = new Product[5];


        for (int i = 0; i < 5; i++) {
            System.out.println("Enter details for Product " + (i + 1));
            System.out.print("Product ID: ");
            int pid = scanner.nextInt();
            System.out.print("Price: ");
            double price = scanner.nextDouble();
            System.out.print("Quantity: ");
            int quantity = scanner.nextInt();


            products[i] = new Product(pid, price, quantity);
        }


        int highestPriceProductId = findHighestPriceProductId(products);
        System.out.println("Product ID with the highest price: " + highestPriceProductId);


        double totalAmountSpent = calculateTotalAmountSpent(products);
        System.out.println("Total amount spent on all products: $" + totalAmountSpent);

        scanner.close();
    }
}