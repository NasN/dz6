package InterfaseAndEnum;

import java.util.Random;

public class Stock {
    public static void main(String args[]) {
        {
            final int Fruit = 20;
            final int Vegetables =15;
            final int Clothes = 500;
            final int Technique = 5000;
            final int Chemistry = 50;
            final int Other = 10;
        }
        Random r = new Random();
        Product[] arr = new Product[500];
        for (int i = 0; i < 500; i++) {
            arr[i] = Product.values()[r.nextInt(Product.values().length)];
            System.out.println(arr[i]);
        }

    }
}
