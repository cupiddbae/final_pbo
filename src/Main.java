import java.io.*;
import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);

    static double[] hitungPersegi(){
        System.out.print("Masukkan panjang persegi: ");
        double panjang = input.nextDouble();
        System.out.print("Masukkan lebar persegi: ");
        double lebar = input.nextDouble();

        Persegi persegi = new Persegi(panjang, lebar);

        System.out.println("Luas persegi: " + persegi.luas + "\n");
        return new double[]{panjang, lebar, persegi.luas};
    }

    static double[] hitungSegitiga(){
        System.out.print("Masukkan panjang segitiga: ");
        double alas = input.nextDouble();
        System.out.print("Masukkan lebar persegi: ");
        double tinggi = input.nextDouble();

        Segitiga segitiga = new Segitiga(alas, tinggi);

        System.out.println("Luas segitiga: " + segitiga.luas + "\n");
        return new double[]{alas, tinggi, segitiga.luas};
    }

    public static void main(String[] args) throws IOException {
        String namaFile = "output.txt";
        File file = new File(namaFile);
        FileWriter fileWriter = new FileWriter(file, true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        PrintWriter printWriter = new PrintWriter(bufferedWriter);
        int menu;
        do {
            System.out.print("Pilih Bangun Ruang\n1. Persegi\n2. Segitiga\n3. Keluar dari program\n=> ");
            menu = input.nextInt();

            if (menu == 1) {
                double[] hasilPersegi = hitungPersegi();
                printWriter.println("Luas persegi dengan panjang " + hasilPersegi[0] + " dan lebar " + hasilPersegi[1] + " adalah " + hasilPersegi[2]);
            } else if (menu == 2) {
                double[] hasilSegitiga = hitungSegitiga();
                printWriter.println("Luas segitiga dengan alas " + hasilSegitiga[0] + " dan tinggi " + hasilSegitiga[1] + " adalah " + hasilSegitiga[2]);
            } else if (menu == 3) {
                printWriter.close();
                System.exit(0);
            } else {
                System.out.println("Menu tidak tersedia");
            }
        } while (menu != 3);

    }
}
