public class Bentuk {
    //instance variable
    protected String warna;

    //constructor
    public Bentuk(String warna) {
        this.warna = warna;
    }

    //accessor
    public String getWarna() {
        return warna;
    }

    //mutator
    public void setWarna(String warna) {
        this.warna = warna;
    }

    public void printInfo() {
        System.out.println("Bentuk berwarna " + warna);
    }
}