package javaEssential.hw7.task3;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InvalidStoreNameException {
        Scanner sc = new Scanner(System.in);
        int numberOfGoods;
        String productName;
        String storeName;
        double priceInUSD;
        System.out.println("This is a platform for the sale of products.");
        System.out.print("How many items would you like to add? : ");
        while (true) {
            try {
                numberOfGoods = Integer.parseInt(sc.nextLine());
                break;
            } catch (NumberFormatException ex1) {
                System.out.println("Unacceptable symbols. Enter the desired number of products you want to add. (Preferably no more than 5)");
                System.out.print("Try again: ");
                continue;
            }
        }
        Price[] products = new Price[numberOfGoods];
            for (int i = 0; i < numberOfGoods; i++) {
                System.out.println("Product №" + (i+1));
                System.out.print("Enter product name - ");
                productName = sc.nextLine();
                System.out.print("Enter store name - ");
                storeName = sc.nextLine();
                while(true) {
                    System.out.print("Enter price in USD - ");
                    try{
                        priceInUSD = Integer.parseInt(sc.nextLine());
                        break;
                    } catch (NumberFormatException ex2){
                        System.out.println("Unacceptable symbols. Enter the desired number of products you want to add. (Preferably no more than 5)");
                        System.out.print("Try again: ");
                        continue;
                    }
                }
                products[i] = new Price(productName,storeName,priceInUSD);
        }
        System.out.println(Arrays.toString(products));
        Arrays.sort(products);
        System.out.println(Arrays.toString(products));
        System.out.print("Products added. Which store are you interested in for details?: ");
        while(true){
            try {
                int counter = 0;
                String searchedStoreName = sc.nextLine();
                for (int j = 0; j < products.length; j++) {
                    if (products[j].getStoreName().equals(searchedStoreName)) {
                            System.out.println(products[j]);
                            counter++;
                    }
                }
                if (counter == 0) throw new InvalidStoreNameException();
            }catch (InvalidStoreNameException ex3){
                System.out.println(ex3);
                continue;
            }
        }
    }
}
