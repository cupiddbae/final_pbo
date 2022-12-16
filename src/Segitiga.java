public class Segitiga extends Bangunan{
    Segitiga(double alas, double tinggi) {
        super(alas, tinggi);
    }

    @Override
    double hitungLuas(double alas, double tinggi) {
        return 0.5 * alas * tinggi;
    }
}
