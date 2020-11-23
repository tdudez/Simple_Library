public class Member {
    private int tel;
    private String name;
    private String address;
    private Borrow borrow;

    Member(int tel,
            String name,
            String address,
            int id,
            int textamount,
            int journalamount,
            Text[] text,
            Journal[] journal){
        this.tel = tel;
        this.name = name;
        this.address = address;
        borrow = new Borrow(id, textamount, journalamount, text, journal);
    }

    public int gettel(){
        return tel;
    }

    public String getname(){
        return name;
    }

    public String getaddress(){
        return address;
    }

    public Borrow getBorrow(){
        return borrow;
    }

}