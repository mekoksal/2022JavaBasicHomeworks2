public class Main {
    public static void main(String[] args) {

        DortIslem dortIslem = new DortIslem();
        int toplam = dortIslem.Topla(12,4);
        int fark = dortIslem.Cikar(12,4);
        int carpim = dortIslem.Carp(12,4);
        int bolum = dortIslem.Bol(12,4);
        System.out.println("Toplam:"+toplam);
        System.out.println("Fark:"+fark);
        System.out.println("Çarpım:"+carpim);
        System.out.println("Bölüm:"+bolum);

    }
}