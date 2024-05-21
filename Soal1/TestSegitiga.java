package Soal1;

import java.util.Scanner;

public class TestSegitiga {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan sisi1 dari segitiga: ");
        double side1 = input.nextDouble();
        System.out.print("Masukkan sisi2 dari segitiga: ");
        double side2 = input.nextDouble();
        System.out.print("Masukkan sisi3 dari segitiga: ");
        double side3 = input.nextDouble();

        System.out.print("Masukkan warna dari segitiga: ");
        String color = input.next();

        System.out.print("Apakah segitiga diisi (true/false)? ");
        boolean filled = input.nextBoolean();

        Segitiga segitiga = new Segitiga(side1, side2, side3);
        segitiga.setColor(color);
        segitiga.setFilled(filled);

        System.out.println("Luas segitiga: " + segitiga.getArea());
        System.out.println("Keliling segitiga: " + segitiga.getPerimeter());
        System.out.println("Warna segitiga: " + segitiga.getColor());
        System.out.println("Apakah segitiga diisi: " + segitiga.isFilled());
        System.out.println(segitiga.toString());
    }
}
