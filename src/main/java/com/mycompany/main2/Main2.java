
package com.mycompany.main2;

import java.util.Scanner;

public class Main2 {

public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите название производителя телефона: ");
        String manufacturerInput = input.nextLine();

        Seller seller = new Seller(manufacturerInput);
        seller.modify();

        System.out.println("Название производителя телефона: " + seller.getManufacturer());
    }
}
