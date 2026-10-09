public class Silinder extends Lingkaran {
    private double tinggi;

    //constructor
    public Silinder(double tinggi, double radius, String warna) {
        super(radius, warna); //manggil constructor dari class lingkaran (induknya)
        this.tinggi = tinggi;
    }

    //accessor
    public double getTinggi() {
        return tinggi;
    }

    //mutator
    public void setTinggi(double t) {
        tinggi = t;
    }

    public double hitungVolume() {
        return hitungLuas() * tinggi;
    }

    //override dari class lingkaran
    @Override
    public void printInfo() {
        System.out.println("Silinder warna " + getWarna() + ", volume = " + hitungVolume());
    }
}