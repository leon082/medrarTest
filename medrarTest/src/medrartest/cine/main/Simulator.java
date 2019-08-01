/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medrartest.cine.main;

import java.util.Random;
import medrartest.cine.model.Chair;
import medrartest.cine.model.Cinema;
import medrartest.cine.model.Customer;
import medrartest.cine.model.CustomerQueue;
import medrartest.cine.model.Movie;

/**
 *
 * @author luis.leon
 */
public class Simulator {

    private static Cinema cinema;
    private static CustomerQueue customers;

    //create the cinema
    public static void main(String[] args) {
        // TODO code application logic here

        //Create the Cine
        createCinema();

        //Show Cine Actual
        showCinema();

        //Load 100 Customers
        customers = new CustomerQueue();
        loadCustomers();

        //let's begin
        attend();
    }

    public static void attend() {

        for (int k = 0; k < customers.size(); k++) {

            Customer customer = customers.getCustomer();

            System.out.println("Main Customer ");
            System.out.println("Customer " + customer.getName());
            System.out.println("Cash " + customer.getCash());
            System.out.println("Age " + customer.getAge());
          

            if (customer.getAge() >= cinema.getMovie().getMinimumAge()
                    && customer.getCash() >= cinema.getPrice()
                    && cinema.getEnabledChairs() > 0) {

                boolean attended = false;
                while (!attended) {

                    int ticket = new Random().nextInt(72);
                    int count = 0;
                    Chair[][] chairs = cinema.getChairs();

                    for (int i = chairs.length - 1; i >= 0; i--) {

                        for (int j = chairs[i].length - 1; j >= 0; j--) {
                            count++;
                            if (count == ticket && chairs[i][j].isState()) {
                                chairs[i][j].setState(false);

                                attended = true;
                                  System.out.println("assigned ticket " + ticket);
                                  System.out.println("--------------------------------");
                                  
                                showCinema();

                                break;
                            }
                        }

                    }

                }
            }else{
                 System.out.println("Invalid Customer");
                 System.out.println("****************************************");
            }
           

        }

    }

    public static void createCinema() {
        cinema = Cinema.getInstance();

        cinema.setMovie(new Movie("Fast and Furious", " 156 Min", 16, "Cameroon"));
        cinema.setPrice(10000);
    }

    public static void loadCustomers() {

        for (int i = 0; i < 100; i++) {

            Customer customer = new Customer();

            customer.setName("Customer" + i);
            customer.setAge(new Random().nextInt(20));
            customer.setCash(new Random().nextInt(200000));
            customers.Insert(customer);
        }

    }

    public static void showCinema() {
        System.out.println("Movie Data : ");
        System.out.println("Movie's Title: " + cinema.getMovie().getTitle());
        System.out.println("Movie's Director: " + cinema.getMovie().getDirector());
        System.out.println("Movie's Price: " + cinema.getPrice());
        Chair[][] chairs = cinema.getChairs();
        for (int i = chairs.length - 1; i >= 0; i--) {

            for (int j = chairs[i].length - 1; j >= 0; j--) {
                System.out.print(
                        (chairs[i][j].isState() ? chairs[i][j].getColumn() + "" + chairs[i][j].getRow() : "N/A") + "\t"
                ); // Tabulador
            }
            System.out.print("\n"); // Salto de Línea
        }
        System.out.println("****************************************");
    }

}
