package pism8;

public class Main {
    public static void main(String[] args){

        Jacket obj1 = new Jacket("фабрика Свитанак",135.0,"Пуховик детский","Зима",true);
        System.out.println("Инфо:\nВещь 1:"+" Производитель - "+obj1.getProducer()+". Цена - "+obj1.getPrice()+
                ". Стиль одежды - "+obj1.getStyle()+". Сезон - "+obj1.getSeason()+". Наличие капюшона - "+obj1.getHood());
        System.out.println("Бренд вещь 1: "+obj1.brand(135.0,true));

        Jacket obj2 = new Jacket();
        System.out.println("Вещь 2:"+" Производитель - "+obj2.getProducer()+". Цена - "+obj2.getPrice()+
                ". Стиль одежды - "+obj2.getStyle()+". Сезон - "+obj2.getSeason()+". Наличие капюшона - "+obj2.getHood());
        System.out.println("Бренд вещь 2: "+obj2.brand(obj2.getPrice(),false));

        Jacket obj3 = new Jacket("Пальто Элема",200,"Демисезон");
        System.out.println("Вещь 3:"+" Производитель - "+obj3.getProducer()+". Цена - "+obj3.getPrice()+
                ". Стиль одежды - "+obj3.getStyle()+". Сезон - "+obj3.getSeason()+". Наличие капюшона - "+obj3.getHood());
        System.out.println("Бренд вещь 3: "+obj3.brand(obj3.getPrice(),false));

        Cardigan obj4 = new Cardigan("Трикотажная фабрика Алеся",40.0,"Блуза шёлковая",0);
        System.out.println("Вещь 4:"+" Производитель - "+obj4.getProducer()+". Цена - "+obj4.getPrice()+
                ". Стиль одежды - "+obj4.getStyle()+". Длина рукава - "+obj4.getSleeveLength()+ ", % шерсти - "+
                obj4.getWoolPercent());
        System.out.println("Бренд вещь 4: "+obj4.brand(obj4.getPrice(),obj4.getWoolPercent()));
        Cardigan obj5 = new Cardigan("Кашемировые свитера Italy",1000,"Кашемировый свитер кэжуал",
                55.5,70);
        System.out.println("Вещь 5:"+" Производитель - "+obj5.getProducer()+". Цена - "+obj5.getPrice()+
                ". Стиль одежды - "+obj5.getStyle()+". Длина рукава - "+obj5.getSleeveLength()+ ", % шерсти - "+
                obj5.getWoolPercent());
        System.out.println("Бренд вещь 5: "+obj5.brand(obj5.getPrice(),obj5.getWoolPercent()));
        Cardigan obj6 = new Cardigan();
        System.out.println("Вещь 6:"+" Производитель - "+obj6.getProducer()+". Цена - "+obj6.getPrice()+
                ". Стиль одежды - "+obj6.getStyle()+". Длина рукава - "+obj6.getSleeveLength()+", % шерсти -"+
                obj6.getWoolPercent());
        System.out.println("Бренд вещь 6: "+obj6.brand(obj6.getPrice(),obj6.getWoolPercent()));

        Pants obj7 = new Pants();
        System.out.println("Вещь 7:"+" Производитель - "+obj7.getProducer()+". Цена - "+obj7.getPrice()+
                ". Стиль одежды - "+obj7.getStyle()+". Расклешённость - "+obj7.getFlared());
        System.out.println("Бренд вещь 7: "+obj7.brand(obj7.getPrice(),false));

        Pants obj8 = new Pants("Брючная фабрика Гомель",60, true);
        System.out.println("Вещь 8:"+" Производитель - "+obj8.getProducer()+". Цена - "+obj8.getPrice()+
                ". Стиль одежды - "+obj8.getStyle()+". Расклешённость - "+obj8.getFlared());
        System.out.println("Бренд вещь 8: "+obj8.brand(obj8.getPrice(),true));

        Pants obj9 = new Pants("Швеция",375,"Кюлоты на выход",true);
        System.out.println("Вещь 9:"+" Производитель - "+obj9.getProducer()+". Цена - "+obj9.getPrice()+
                ". Стиль одежды - "+obj9.getStyle()+". Расклешённость - "+obj9.getFlared());
        System.out.println("Бренд вещь 9: "+obj9.brand(obj9.getPrice(),true));
    }
}
