package rikkeiacademy.rikkei;

import java.util.Scanner;

public class academy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float width;
        System.out.println("Nhập chiều dài: ");
        width = scanner.nextFloat();

        float height;
        System.out.println("Nhập chiều cao: ");
        height = scanner.nextFloat();

        float area = width*height;
        System.out.println("area = " +area);
    }
}
