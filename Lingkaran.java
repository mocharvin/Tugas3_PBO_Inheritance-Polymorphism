public class Lingkaran extends Bentuk {
    private double radius;
    public static final double PHI = Math.PI; //bisa pake 3.14 ato 22/7

    //constructor
    public Lingkaran(double radius, String warna) {
        super(warna); //manggil constructor dari class bentuk (induknya)
        this.radius = radius;
    }

    //accessor
    public double getRadius() {
        return radius;
    }

    //mutatuor
    public void setRadius(double r) {
        radius = r;
    }

    public double hitungLuas() {
        return PHI * radius * radius;
    }

    //override dari class bentuk
    @Override
    public void printInfo() {
        System.out.println("Lingkaran " + getWarna() + ", luas = " + hitungLuas());
    }
}