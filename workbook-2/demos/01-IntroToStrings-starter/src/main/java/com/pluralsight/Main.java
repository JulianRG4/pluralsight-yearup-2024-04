package com.pluralsight;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Hello world!");
    }

    public static void formatPhoneNumber()
    {
        String phoneNumber = "8885551212";
        String formattedPhone;

        String areaCode = phoneNumber.substring(0,3);
        String preFix = phoneNumber.substring(3,6);
        String last4 = phoneNumber.substring(6);

        System.out.println("area code: " + areaCode);
        System.out.println("prefix: " + preFix);
        System.out.println("last 4: " + last4);

        formattedPhone = "(" + areaCode + ")" + preFix + "-" + last4;
        formattedPhone = String.format("(%s) %s-%s" ,areaCode, preFix, last4);




    }
}