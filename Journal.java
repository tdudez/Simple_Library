public class Journal extends Resouce {
    int vol;
    int no;
    
    Journal(String isbn, String title, String publication, int year, int vol, int no){
        super(isbn, title, publication, year);
        this.vol = vol;
        this.no = no;
    }
}
