
package com.mycompany.main2;


public class Seller {
    
    private String manufacturer;

    public Seller(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void modify() {
        char[] manufacturerChars = manufacturer.toLowerCase().toCharArray();
        for (int i = 0; i < manufacturerChars.length; i++) {
            if (manufacturerChars[i] == 'o') {
                manufacturerChars[i] = 'a';
            }
        }
        if (manufacturerChars[0] != 'n') {
            manufacturer = new String(manufacturerChars);
        }
    }
}