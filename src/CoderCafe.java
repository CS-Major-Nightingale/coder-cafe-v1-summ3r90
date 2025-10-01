// File for your Coder Cafe code!
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CoderCafe {
    public static void main(String [] args) {
        //title and top border
        System.out.println("_____________________________________");
        System.out.println("|\t\t\t\t\t\t\t\t\t|");
        System.out.println("|\t\tSummer's Coder Cafe!\t\t|");

        //date time formatting
        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter newFormat = DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm:ss");
        String formattedDate = localDateTime.format(newFormat);
        System.out.println("|\t\t" + formattedDate + "\t\t\t|");

        //declare prices and number of drinks
        double matchaPrice = 4.50;
        double lattePrice = 5.30;
        double cappuccinoPrice = 3.75;
        double hotChocoPrice = 4.80;

        int matchas = 2;
        int lattes = 4;
        int cappuccinos = 3;
        int hotChocos = 1;

        //calculations for total drink prices
        double finalMatcha = matchas * matchaPrice;
        double finalLatte = lattes * lattePrice;
        double finalCappuccino = cappuccinos * cappuccinoPrice;
        double finalHotChoco = hotChocos * hotChocoPrice;
        //space
        System.out.println("|\t\t\t\t\t\t\t\t\t|");

        //print items, numbers and prices and then space line
        System.out.printf("|\t" + matchas + " x Iced Matcha\t\t $ %.2f \t|\n" , finalMatcha); //spaces, number of items, item name, spaces, price, spaces and new line
        System.out.printf("|\t" + lattes + " x Iced Latte\t\t $ %.2f \t|\n" , finalLatte);
        System.out.printf("|\t" + cappuccinos + " x Cappuccino\t\t $ %.2f \t|\n" , finalCappuccino);
        System.out.printf("|\t" + hotChocos + " x Hot Chocolate\t $ %.2f \t|\n" , finalHotChoco);
        System.out.println("|\t\t\t\t\t\t\t\t\t|");

        //declare subtotal, taxes and fees
        double subtotal = finalMatcha + finalLatte + finalCappuccino + finalHotChoco;
        double salesTax = 0.08875;
        double serviceFee = 1.21;
        double coderCafeFee = subtotal % (matchas + lattes + cappuccinos + hotChocos); //calculate remainder of subtotal/items

        double totalTax = subtotal * salesTax; //actual tax amount

        //print price of all items, taxes and fees, space
        System.out.printf("|\tSubtotal:\t\t\t $ %.2f\t|\n" , subtotal);
        System.out.printf("|\tSales Tax:\t\t\t $ %.2f\t\t|\n" , totalTax);
        System.out.printf("|\tService Fee:\t\t $ %.2f\t\t|\n" , serviceFee);
        System.out.printf("|\tCoder Cafe Fee:\t\t $ %.2f\t\t|\n" , coderCafeFee);
        System.out.println("|\t\t\t\t\t\t\t\t\t|");

        //declare + print total price, space
        double total = subtotal + totalTax + serviceFee + coderCafeFee;
        System.out.printf("|\tTotal:\t\t\t\t $ %.2f\t|\n" , total);
        System.out.println("|\t\t\t\t\t\t\t\t\t|");

        //thank you!! and space then closing border
        System.out.println("|\t\t\tThank You :)\t\t\t|");
        System.out.println("|\t\t\t\t\t\t\t\t\t|");
        System.out.println("-------------------------------------");

    }
}