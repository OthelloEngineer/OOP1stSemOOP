import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Customer jens = new Customer("123", 25, "Jens Vejmand");
        Book book1 = new Book(123, "bookieBoi", "Jawremce");
        PurchaseTicker test = new PurchaseTicker(jens, Genre.FANTASY, LocalDate.now(), book1);
        System.out.println(test.timeOfPurchase());
    }
}