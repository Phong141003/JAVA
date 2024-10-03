public class Computer {
    private String model;
    private short rate;

    public Computer(String model){
        this.model = model;
        rate =0;
    }
    public String getModel(){
        return model;
    }
    public short getRate(){
        return rate;
    }
    public void setRate(short rate){
        this.rate = rate;
    }
    public String toString(){
        return "Shop{"+
                "model = "+ model +
                ", rate = "+ rate+
                "%}";
    }
}
