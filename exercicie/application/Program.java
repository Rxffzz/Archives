package exercicie.application;

import exercicie.entities.Product;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    String path = "C:\\Users\\Rafael\\Documents\\archives\\src\\compras.csv";

    System.out.println("Insert the quantity of products you want: ");
    int n = sc.nextInt();

    try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
        for (int i = 0; i < n; i++) {
            System.out.println("Product #" + (i + 1) + ":");

            System.out.println("Insert the name of product: ");
            String name = sc.next();

            System.out.println("Insert the price of product: ");
            double price = sc.nextDouble();

            System.out.println("Insert the quantity of products: ");
            int quantity = sc.nextInt();

            Product p = new Product(name, price, quantity);

            bw.append("Name/Price/quantity: ");
            bw.append(p.getName());
            bw.append(", ");
            bw.append(String.valueOf(p.getPrice()));
            bw.append(", ");
            bw.append(String.valueOf(p.getQuantity()));
            bw.newLine();
        }
    } catch (IOException e) {
        System.out.println("error with file " + path);
        e.printStackTrace();
    }

        sc.close();
    }
}
