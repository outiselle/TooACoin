import java.util.Random;
import java.util.Scanner;

public class CoinFlip {

    float t = 0;
    float c = 0;
    float chance;

    Random rn = new Random();
    Scanner sc = new Scanner(System.in);

    public void Flip(){

        System.out.println("inserire percentuale aumento uscita testa");
        chance = sc.nextFloat();
        System.out.println(chance);

        for (int i = 0; i<100; i++){
            float a = rn.nextFloat(0,2);
            a = a*100;

            // testa se < chance o dispari
            // altrimenti croce

            if (a<chance || a%2!=0){
                t++;
            } else {
                c++;
            }
        }
        System.out.println("Testa è uscita " + t + " volte");
        System.out.println("Croce è uscita " + c + " volte");
    }
    
}
