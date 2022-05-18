import java.util.Scanner;
public class Sicaklik_Etkinlik {

    public static void main(String[] args) {
        double heat;

        Scanner input = new Scanner(System.in);

        System.out.print("Lutfen sicaklik degerinizi giriniz : ");
        heat= input.nextDouble();

        if(heat<5){

            System.out.println("Kayak yapabilirsiniz.");

        }
        else if (5<=heat && heat<15 ){
            System.out.println("Sinemaya gidebilirsiniz.");
        }
        else if (15<=heat && heat<25) {
            System.out.println("Piknik yapabilirisiniz.");
        }
        else if (25<=heat) {

            System.out.println("Yanarsiniz anacim gidin yuzun...");

        }
        else {

            System.out.println("Ne girdin anlamadim babacim...");
        }


    }
}
