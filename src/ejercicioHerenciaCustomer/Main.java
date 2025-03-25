package ejercicioHerenciaCustomer;

public class Main {

    public static void main(String[] args) {


        // Primer ejercicio
        /*Customer customer = new Customer(1, "Pepe", 20);

        Invoice invoice = new Invoice(2, customer, 500);

        System.out.println(customer);

        System.out.println(invoice);*/


        Customer customer2 = new Customer(2, "Pepe", 'm');

        System.out.println(customer2.toString2());

        Account cuenta = new Account(5, customer2, 1000);

        System.out.println(cuenta);

        cuenta.deposit(500);

        System.out.println(cuenta);

        cuenta.withdraw(700);

        System.out.println(cuenta);
    }
}
