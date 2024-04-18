package com.pluralsight;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class CellPhoneService
{
    private static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args)
    {
      CellPhone phone1 = register();
      CellPhone phone2 = register();


      System.out.printf("Phone 1\nSerial Number: %s\nModel: %s\nCarrier: %s\nPhone Number: %s\nOwner Name: %s",phone1.getSerialNumber(),phone1.getModel(),phone1.getCarrier(),phone1.getPhoneNumber(),phone1.getOwner());
      System.out.println();
      System.out.println("----------------------------------");
      System.out.printf("Phone 2\nSerial Number: %s\nModel: %s\nCarrier: %s\nPhone Number: %s\nOwner Name: %s",phone2.getSerialNumber(),phone2.getModel(),phone2.getCarrier(),phone2.getPhoneNumber(),phone2.getOwner());






    }
    public static CellPhone register() {
        CellPhone phone = new CellPhone();

        System.out.println("Please enter the following information");

        System.out.print("Serial Number:");
        String serialNumber = userInput.nextLine().strip();
        phone.setSerialNumber(serialNumber);

        System.out.print("Model Number:");
        String model = userInput.nextLine().strip();
        phone.setModel(model);

        System.out.print("Carrier:");
        String carrier = userInput.nextLine().strip();
        phone.setCarrier(carrier);

        System.out.print("Phone Number:");
        String phoneNumber = userInput.nextLine().strip();
        phone.setPhoneNumber(phoneNumber);

        System.out.print("Owner:");
        String owner = userInput.nextLine().strip();
        phone.setOwner(owner);

        return phone;
    }
}