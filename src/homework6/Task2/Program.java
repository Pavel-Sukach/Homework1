package homework6.Task2;

import java.util.*;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the list of your purchases (items separated by comma): ");
        String purchases = scanner.nextLine();

        Customer customer = new Customer(Customer.processPurch(purchases));
        ArrayDeque<Customer> customerQueue = new ArrayDeque<>();
        customerQueue.addLast(customer);
        Products.addProducts();

        while (customerQueue.peek() != null){
            CashDesk.processCustomer(customerQueue.poll());
        }

    }
}
