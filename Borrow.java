import java.util.Date;

public class Borrow {
    private int id;
    private int textamount;
    private int journalamount;
    private Text [] text = new Text[textamount];
    private Journal [] journal = new Journal[journalamount];
    private String bdate; //borrow date
    private String rdate; //return date

    Borrow(int id,
            int textamount,
            int journalamount,
            Text[] text,
            Journal[] journal ){
        Date date = new Date();
        bdate += date.getDay()+"/"+date.getMonth()+"/"+date.getYear();
        rdate += 14+date.getDay()+"/"+date.getMonth()+"/"+date.getYear();
    }

    public int getid(){
        return id;
    }
    
    public int gettextamount(){
        return textamount;
    }
    
    public int getjournalamount(){
        return journalamount;
    }
    
    public Text[] gettextbook(){
        return text;
    }
    
    public Journal[] getjournal(){
        return journal;
    }
    
    public String getborrowdate(){
        return bdate;
    }
    
    public String getreturndate(){
        return rdate;
    }
    

}
