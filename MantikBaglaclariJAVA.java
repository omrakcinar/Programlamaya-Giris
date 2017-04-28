/*OWNED byKodaman*/
package mantikbaglaclari;

import java.util.Scanner;

public class MantikBaglaclari {

    public static void main(String[] args) {
        System.out.println("Karşılaştırma yapacağınız değerleri girin.");
        System.out.println("Değer 1: ");
        Scanner deger1 = new Scanner(System.in);
        double x = deger1.nextDouble();
        
        System.out.println("Değer 2: ");
        Scanner deger2 = new Scanner(System.in);
        double y = deger2.nextDouble();
        
        System.out.println("Değer 3: ");
        Scanner deger3 = new Scanner(System.in);
        double z = deger3.nextDouble();
        
        if (y>x && z<x && y>z) {
            System.out.println(x + " değeri " + y + " ve " + z + " değerleri arasındadır.");
            }
        else {
            System.out.println(x + " değeri " + y + " ve " + z + " değerleri arasında DEĞİLDİR!");
        }
        if (x==y && x<z){
            System.out.println(x + " değeri " + y + " değerine eşit ve " + z + " değerinden küçüktür. ");
        }
        else {
            System.out.println(x + " değeri " + y + " değerine eşit ve her iki değer " + z + " değerinden küçük DEĞİLDİR! ");
        }
        if (x>y || x>z) {
            System.out.println(x + " değeri " + y + " veya " + z + "değerinden büyüktür.");
        }
        else {
            System.out.println(x + " değeri " + y + " veya " + z + " değerinden büyük DEĞİLDİR! ");
        }
        if (x==y && y==z && x==z) {
            System.out.println("Her üç değer de birbirine eşittir.");
        }
        else {
            System.out.println("Üç değer birbirine eşit değildir.");
        }
    }
    }
    

