import java.time.LocalDate;

public record PurchaseTicker(Customer customer, Genre bookGenre, LocalDate timeOfPurchase, Book book){}