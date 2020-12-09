package pism8;

public class Cardigan extends Clothes {
    private double sleeveLength;
    private double woolPercent;
    public double getSleeveLength(){
        return sleeveLength;
    }
    public double getWoolPercent(){
        return woolPercent;
    }
    public Cardigan(){
        super();
        sleeveLength=55;
        woolPercent=0;
    }
    public Cardigan(String prod,double pr,String st,double woolP){
        super(prod,pr,st);
        woolPercent = woolP;
    }
    public Cardigan(String prod,double pr,String st,double sleeveL,double woolP){
        super(prod,pr,st);
        sleeveLength = sleeveL;
        woolPercent = woolP;
    }
    public String brand(double p,double wool){
        String s2=null;
        if(p>600) {
            if (wool>20) {
                s2 = "Бренд люкс";
            } else {
                if (wool > 10) {
                    s2 = "Бренд среднего класса";
                }
                if(wool<10){
                    s2 ="Бренд масс-маркета";
                }
            }
        }
        if(p>=200) {
            if(p<=600){
                s2 = "Бренд среднего класса";
            }
        }
        else{
            s2 ="Бренд масс-маркета";
        }
        return s2;
    }
}
