
package PenaltyKick;
import java.util.*;

public class operation {
    IO io = new IO();
    int power = io.power();
    int arah = io.arah();
    double akurasi;
    int kiper;
    double koef;
    
    
    public double koefisien(){
       if(arah==1){koef = 10;}
       else if (arah==2){koef = 5;}
       else if (arah==3){koef = 3;}
       else if (arah==4){koef = 10;}
       else if (arah==5){koef = 5;}
       else if (arah>5){koef = 100;}
       return koef;
    }
    public double akurasi(){
        akurasi = (koef*power)+25;
        return akurasi;
}
    public int arahKiper(){
        Random r = new Random();
        kiper = r.nextInt(6)+1;
        return kiper;
    }
    
    public void hasil(){
        koefisien();
        akurasi();
        arahKiper();
        
        if(akurasi>50){
            System.out.println("Wadoo00 tendanganmu melebarr :( ");
        }
        else if(kiper==arah){
            System.out.println("Sayang sekali, tendanganmu ditepis!!");
        }
        else{
            System.out.println("GOOOOLL !! kiper menebak ke arah yang salah!!");
        }
    }
    
}