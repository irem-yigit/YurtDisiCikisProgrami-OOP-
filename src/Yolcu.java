import java.util.Scanner;

public class Yolcu implements YurtDisiKurallari {

    private int harc;
    private boolean siyasiYasak;
    private boolean vizeDurumu;

    public Yolcu(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Yatırdığınız harç bedeli: ");
        this.harc=scan.nextInt();
        scan.nextLine();

        System.out.println("Herhangi bir siyasi yasağınız bulunuyor mu ? (evet ya da hayır) ");
        String cevap = scan.nextLine();

        if (cevap.equals("evet")){
            this.siyasiYasak=true;
        }
        else {
            this.siyasiYasak=false;
        }

        System.out.println("Vizeniz bulunuyor mu ? (evet ya da hayır) ");
        String cevap2 = scan.nextLine();

        if (cevap.equals("evet")){
            this.vizeDurumu=true;
        }
        else {
            this.vizeDurumu=false;
        }

    }

    @Override
    public boolean yurtdisiHarciKontrol() {
        if (this.harc<15){
            System.out.println("Lütfen yurtdışı çıkış harcını tam yatırın.");
            return false;
        }
        else {
            System.out.println("Yurtdışı harcı işlemi tamam...");
            return true;
        }
    }

    @Override
    public boolean siyasiYasakKontrol() {
        if (this.siyasiYasak==true){
            System.out.println("Siyasi yasağınız bulunuyor.Yurtdışına çıkamazsınız...");
            return false;
        }
        else {
            System.out.println("Siyasi yasağınız bulunmuyor.");
            return true;
        }
    }

    @Override
    public boolean vizeDurumuKontrol() {
        if (this.vizeDurumu==true){
            System.out.println("Vize işlemleri tamam...");
            return true;
        }
        else {
            System.out.println("Vizeniz gideceğiniz ülkeye bulunmamaktadır.");
            return false;
        }
    }
}
