public abstract class Bangunan {
    // atribut
    double panjang;
    double lebar;
    double luas;
    // constructor
    Bangunan(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.luas = hitungLuas(this.panjang, this.lebar);
    }

    // abstract method
    abstract double hitungLuas(double panjang, double lebar);
}
