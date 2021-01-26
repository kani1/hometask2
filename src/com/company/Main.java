package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(hat(23, 34));
        System.out.println(hat(55, 66));
        System.out.println(hat(18, 23));
        System.out.println(hat(34, 45));
        System.out.println(hat(25, 55));
        System.out.println(hat(65,45));
    }

    public static String hat(int age, int temp){
        if ((age>20 && age < 45 ) &&(temp > -20 && temp <30)){
            return "Можно идти гулять";
        }
        else if (age<20 &&(temp>0 && temp<28)){
            return "Можно выйти гулять";
        }
        else if ( age >45 && (temp>-10 && temp<25)){
            return "Можно идти гулять";
        }
        else {
            return "Оставайтесь дома";
        }
    }
}

