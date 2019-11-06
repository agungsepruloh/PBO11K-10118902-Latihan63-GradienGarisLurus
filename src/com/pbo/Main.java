package com.pbo;

/*
 * #Author
 * Nama  : Agung Sepruloh
 * NIM   : 10118902
 * Kelas : IF-11K
 * Deskripsi Program : program ini berguna untuk menghitung Gradien Garis Lurus dengan diketahui dua titik yang dilalui
 *
 */

public class Main {

    public static void main(String[] args) {
	    Koordinat koordinat1 = new Koordinat(2, 10, 5, 7);
        System.out.println(String.format("Garis yang melalui titik (%d, %d) dan (%d, %d) memiliki gradien sebesar %d",
                koordinat1.getX1(), koordinat1.getY1(), koordinat1.getX2(), koordinat1.getY2(), koordinat1.hitungGradien()));

        Koordinat koordinat2 = new Koordinat(5, 1, 3, 12);
        System.out.println(String.format("Garis yang melalui titik (%d, %d) dan (%d, %d) memiliki gradien sebesar %d",
                koordinat2.getX1(), koordinat2.getY1(), koordinat2.getX2(), koordinat2.getY2(), koordinat2.hitungGradien()));
    }
}
