public class Main {
    public static void main(String[] args) {

        sayiBulmaca();
    }
//Java'da fonksiyon isimleri camelCasing yazılır!
    public static void sayiBulmaca(){
        int[] sayilar = new int[]{1,2,5,7,9,0};
        int arancak = 5;
        boolean varMi = false;

        for(int sayi : sayilar){
            if(arancak==sayi){
                varMi=true;
                break;
            }
        }

        if(varMi){ //varMi ---> varMi == true ile aynı anlama gelir.
            mesajVer("Sayı vardır:"+arancak);
        }else {
            mesajVer("Sayı yoktur:"+arancak);
        }
    }

    public static void mesajVer(String mesaj){
        System.out.println(mesaj);
    }
}