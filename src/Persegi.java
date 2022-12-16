public class Persegi extends Bangunan{
    Persegi(double panjang, double lebar) {
        super(panjang, lebar);
    }

    @Override
    double hitungLuas(double panjang, double lebar) {
        return panjang * lebar;
    }
}
