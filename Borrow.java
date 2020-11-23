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
        this.id = id;
        this.textamount = textamount;
        this.journalamount = journalamount;
        settext(text);
        setjournal(journal);
        bdate += date.getDay()+"/"+date.getMonth()+"/"+date.getYear();
        rdate += 14+date.getDay()+"/"+date.getMonth()+"/"+date.getYear();
    }

    private void settext(Text[] text){
        int i;
        for(i=0;i<textamount;i++){
            this.text[i]=text[i];
        }
    }
    
    private void setjournal(Journal[] journal){
        int i;
        for(i=0;i<journalamount;i++){
            this.journal[i]=journal[i];
        }
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
