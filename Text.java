public class Text extends Resouce {
    public String author;

    Text(String isbn, String title, String publication, int year, String author){
        super(isbn, title, publication, year);
        this.author = author;
    }
}
