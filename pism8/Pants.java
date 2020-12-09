package pism8;

public class Pants extends Clothes {
    private boolean flared;
    public String getFlared() {
        if (flared) {
            return "присутствует";
        } else {
            return "отсутствует";
        }
    }
    public Pants(){
        super();
        boolean flared=false;
    }
    public Pants(String prod,double pr,boolean flaring){
        super(prod,pr);
        flared = flaring;
    }
    public Pants(String prod,double pr,String st,boolean flaring){
        super(prod,pr,st);
        flared = flaring;
    }
    public String brand(double pr,boolean flaring){
        String s3;
        if(pr>600) {
            if (flaring = true) {
                s3 = "Бренд люкс";
            } else {
                s3 = "Бренд среднего класса";
            }
        }
        if(pr>=200 && pr<=600) {
            s3 = "Бренд среднего класса";
        }
        else{
            s3="Бренд масс-маркета";
        }
        return s3;
    }
}
