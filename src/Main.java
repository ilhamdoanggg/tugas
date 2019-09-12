import com.enigma.model.Mobil;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        Mobil Innova = new Mobil();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer x=1;
        Integer y=1;
        System.out.print(Innova.bensinAwal());
        System.out.print("Isi Bensin : ");
        String input = br.readLine();
        Integer inputInteger = Integer.parseInt(input);
        Innova.fillFuel(inputInteger);
        Innova.engineStart();

        System.out.print("Masukan Posisi Awal mobil anda :");
        String titik = br.readLine();
        String[] value = titik.split("[,?.@]+");

        String titikawalx = value[0];
        String titikawaly = value[1];
        System.out.println("titik x = " +titikawalx+ " titik y = " +titikawaly);
        int tAwalIntX = Integer.parseInt(titikawalx);
        int tAwalIntY = Integer.parseInt(titikawaly);

/*
        int tAwalIntX = Integer.parseInt(titikawalx);
        int tAwalIntY = Integer.parseInt(titikawaly);
        System.out.println(tAwalIntX + "," + tAwalIntY);
*/

        System.out.println(Innova.engineStart());
        System.out.print("Masukkan Arah R,L,F,B: ");
        String arah = br.readLine();
        String [] perintah = new String[Innova.tampungFuel()*3];

        for (int i=0, b=1; i<Innova.tampungFuel()*3; i++){
            perintah[i] = String.valueOf(arah.charAt(i));
            if(i==Innova.tampungFuel()*3){
                System.out.println("Bensin Habis!");
            }
            if (perintah[i].equals("R")) {
                tAwalIntX = tAwalIntX + 1;
                System.out.println("R(x,y) : " + tAwalIntX + "," + tAwalIntY);
            }else if(perintah[i].equals("F")){
                tAwalIntY = tAwalIntY+1;
                System.out.println("R(x,y) : " + tAwalIntX + ","+ tAwalIntY );
            }else if(perintah[i].equals("L")){
                tAwalIntX = tAwalIntX-1;
                System.out.println("R(x,y) : " + tAwalIntX + "," + tAwalIntY );
            }else if(perintah[i].equals("B")){
                tAwalIntY = tAwalIntY-1;
                System.out.println("R(x,y) : " + tAwalIntX + "," + tAwalIntY );
            }else{
                System.out.println("Masukkan Huruf Sesuai Perintah!");
            }
        }
        //Innova.setCommand();
        Innova.parking();
        System.out.println(Innova.toString());
    }
}
