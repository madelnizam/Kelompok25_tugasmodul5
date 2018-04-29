
package PenaltyKick;
import java.util.*;

public class IO {
    int power;
    int arah;
    
    Scanner sc = new Scanner(System.in);
    public int arah(){
    System.out.print("1. Kiri atas \n2. Kiri bawah \n3. Tengah \n4. Kanan atas"
            + "\n5. Kanan bawah \nTentukan arah tendanganmu : ");
    arah = sc.nextInt();
    return arah;
    }
    public int power(){
    System.out.print("Tentukan power tendanganmu (1-10) : ");
    power = sc.nextInt();
    return power;
    }
}  
    
