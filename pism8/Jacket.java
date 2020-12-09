package pism8;

public class Jacket extends Clothes{
    private String season;
    private boolean hood;
    public String getSeason(){
        return season;
    }
    public String getHood(){
        if (hood) {
            return "есть";
        } else {
            return "отсутствует";
        }
    }
    public Jacket(){
        super();
        season = "No season";
        hood = false;
    }
    public Jacket(String prod,double pr,String seas){
        super(prod,pr);
        season=seas;
    }
    public Jacket(String prod,double pr,String st,String seas,boolean hd){
        super(prod,pr,st);
        season=seas;
        hood=hd;
    }
    public String brand(double p,boolean h){
        String s1;
        if(p>600) {
            if (h = false) {
                s1 = "Бренд люкс";
            } else {
                s1 = "Бренд среднего класса";
            }
        }
        if(p>=200 && p<=600) {
            s1 = "Бренд среднего класса";
        }
        else{
            s1="Бренд масс-маркета";
        }
        return s1;
    }
}
