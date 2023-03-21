public class MethodParametreDemo {
    public static void main(String[] args) {
        konsolCiktisi("Ozan");
        konsolCiktisi("Onur");
        toplamaIslemi(5,10);
        toplamaIslemi(100,456);
        sinavNotlari("Tibet", 100);
        sinavNotlari("Osman", 50);

        System.out.println("....................");
        System.out.println(carpma(5,9));
        System.out.println(carpma(10,2));
        System.out.println(toplama(5,10));
        System.out.println(toplama(100,456));
        System.out.println(toplamaIslemi(20,15,66));
        System.out.println(toplamaIslemi(8.0,4.5));
    }
    private static void konsolCiktisi(String isim){
        System.out.println("Merhaba Dünya!" + " ve merhaba " + isim);
    }

    private static void toplamaIslemi(int a, int b){
        System.out.println(a+b);
    }

    private static int toplamaIslemi(int a, int b, int c){
        return a+b+c;
    }
    private static double toplamaIslemi(double a, double b){
        return a+b;
    }

    //Konsola kişinin adını ve sınav notunu yazdıran bir method oluşturun.
    //Method 2 adet parametre alsin, ad ve sınav notu

    private static void sinavNotlari(String ad, int not){
        System.out.println(ad + " isimli ögrencinin notu " + not);
    }
    //Method Return type kullanımı
    private static int carpma(int a, int b){
        int carpmaSonucu = a*b;
        return carpmaSonucu;
    }
    private static int toplama(int a, int b){
        int toplamaSonucu = a+b;
        return toplamaSonucu;
    }
}
