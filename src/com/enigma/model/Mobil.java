package com.enigma.model;

public class Mobil {
    private Integer x=0;
    private Integer y=0;
    private Integer fuel = 0;
    private boolean isStart;

//    Mobil mobil= new Mobil();

    public Integer titikawal(){
        System.out.println("Titik Awal : " + x + "," + y);
        return 1;
    }

    /*public String perintahDasar(){
        String jenis;

        for (int i=0, b=1; i<Innova.tampungfuel()*3; i++){
            perintah[i] = String.valueOf(arah.charAt(i));
            if(i==Innova.tampungfuel()*3){
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
    }*/

    public Integer forXY(int i){
        if(i==1){
            System.out.println("R(x,y) : (2,1)");
        }else if(i==2){
            System.out.println("F(x,y) : (2,2)");
        }else if(i==3){
            System.out.println("F(x,y) : (2,3)");
        }else if(i==4){
            System.out.println("F(x,y) : (2,4)");
        }else if(i==5){
            System.out.println("L(x,y) : (1,4)");
        }else if(i==6){
            System.out.println("B(x,y) : (1,3)");
        }else{
            System.out.println("F Stop");
        }
        return i;
    }
    public String bensinAwal(){
        if (fuel==0) {
            System.out.println("Bensin Anda "+fuel+" Liter");
        }
        return "";
    }
    public String fillFuel(Integer fuel) {
        this.fuel = this.fuel + fuel;
        return "";
    }
    public Integer tampungFuel(){
        Integer vFuel = this.fuel;
        return vFuel;
    }
    public Boolean isFuelSuffication() {

        return this.fuel > 0;
    }
    public String engineStart() {
        if (isFuelSuffication()) {
            isStart = true;
            return "Burm Burm";
        }else{
            return "Bensin habis, silahkan isi bensin : ";
        }
    }
    public String engineStop() {
        isStart = true;
        return "Stop";
    }
    public void parking(){
        System.out.println("Try Parking!");
        if(isStart){
            System.out.println("Not Yet, Turn Off Your Engine!!!");
        }else {
            System.out.println("Your Parking");
        }
    }

    @Override
    public String toString() {
        return "Mobil{" +
                "fuel=" + fuel +
                ", isStart=" + isStart +
                '}';
    }


}
