import java.util.Calendar;
import java.util.Date;

public class Borrow {
    private int id;
    private int textamount;
    private int journalamount;
    private Text [] text;
    private Journal [] journal;
    private String bdate; //borrow date
    private String rdate; //return date

    Borrow(int id,
            int textamount,
            int journalamount,
            Text[] text,
            Journal[] journal ){
        this.text = new Text[textamount];
        this.journal = new Journal[journalamount];
        this.id = id;
        this.textamount = textamount;
        this.journalamount = journalamount;
        settext(text);
        setjournal(journal);
        Date date = new Date(); 
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH);
        int day = cal.get(Calendar.DAY_OF_MONTH);

        month++;
        
        bdate = day+"/"+month+"/"+year;

        if(month==1&&month==3&&month==5&&month==7&&month==8&&month==10){
            if(14+day>31){
                rdate = (14-31+day) + "/" + (1+month) + "/" + year;
            }
            else{
                rdate = (14+day) + "/" + month + "/" + year;
            }
        }
        else if(month==12){
            if(14+day>31){
                rdate = (14-31+day) + "/" + (1+month-12) + "/" + (year+1);
            }
            else{
                rdate = (14+day) + "/" + month + "/" + year;
            }
        }
        else if(month==2){
            if(((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)){
                if(14+day>29){
                    rdate = (14-29+day) + "/" + (1+month) + "/" + year;
                }
                else{
                    rdate = (14+day) + "/" + month + "/" + year;
                }
            }
            else{
                if(14+day>28){
                    rdate = (14-28+day) + "/" + (1+month) + "/" + year;
                }
                else{
                    rdate = (14+day) + "/" + month + "/" + year;
                }
            }
        }
        else{
            if(14+day>30){
                rdate = (14-30+day) + "/" + (1+month) + "/" + (year);
            }
            else{
                rdate = (14+day) + "/" + month + "/" + year;
            }
        }
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
