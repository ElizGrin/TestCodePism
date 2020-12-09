package pism8;

public class Clothes {
    private String producer;
    private double price;
    private String style;
    public String getProducer(){
        return producer;
    }
    public double getPrice(){
        return price;
    }
    public String getStyle(){
        return style;
    }
    public Clothes(){
        price = 0;
        producer = "Неизвестный";
        style = "Не определён";
    }
    public Clothes(String prod,double prc){
        producer = prod;
        price = prc;
    }
    public Clothes(String prod,double prc,String stl){
        producer = prod;
        price = prc;
        style = stl;
    }
    public String brand(double p){
        String s;
        if(p<200){
            s="Бренд масс-маркета";
        }
        if(p>=200 && p<=600){
            s="Бренд среднего класса";
        }
        else{
            s="Бренд люкс";
        }
        return s;
    }
}
