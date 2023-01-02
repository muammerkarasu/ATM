import java.util.Scanner;
public class Atm {
    public static void main(String[] args){
        int bakiye=1000, miktar,input;
        Scanner scan=new Scanner (System.in);
        System.out.println("merhaba Muammer Bankasina hosgeldiniz! ");
        System.out.println("Guncel Bakiyeniz: "+ bakiye+" TL");

        while (bakiye>0){
            System.out.println("1-) Para yatir ");
            System.out.println("2-) Para cek ");
            System.out.println("3-) Bakiye sorgula");
            System.out.println("4-) cikis yap");
            System.out.println("Yapmak istediğiniz işlemi seçiniz : ");
            input=scan.nextInt();

            if (input==1){
                System.out.print("Yatirmak istediginiz miktar : ");
                miktar=scan.nextInt();
                bakiye+=miktar;
            }else if(input==2){
                System.out.print("Cekmek istediginiz miktar : ");
                miktar=scan.nextInt();
                if(miktar>bakiye){
                    System.out.println("Yetersiz Bakiye !!");
                }else{
                    bakiye-=miktar;
                    System.out.println("Kalan bakiye: "+bakiye);
                }
            }else if(input==3){
                System.out.println("Guncel Baiyeniz : "+bakiye +" TL");
            }else if(input==4){
                System.out.println("Cikis Yapiliyor !!");
                break;
             }else{
                System.out.println("gecersiz islem yaptiniz: ");
             }
    }
    System.out.println("Tekrar Bekleriz! ");


    }
}
