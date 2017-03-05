package BookShop;

public class GoldenEditionBook extends Book {
    GoldenEditionBook(String author, String title, double price) {
        super(author, title, price + price * 0.3);
    }
}