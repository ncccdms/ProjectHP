/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjectPhone;

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Phone redmiNote8 = new Xiomai();
        Phone Ifhon14 = new Ifhon();
        Phone Reno8 = new Oddo();
        Phone S20 = new Sumsang();
        UserPhone Amin = new UserPhone(redmiNote8);
        UserPhone Andi = new UserPhone(Ifhon14);
        UserPhone Siti = new UserPhone(Reno8);
        UserPhone Joko = new UserPhone(S20);
        Scanner input = new Scanner(System.in);
        String aksi,pilih = null;
        
        System.out.println("Chose Your HandPhone : ");
        System.out.println("[1] Xiomai");
        System.out.println("[2] Ifhon");
        System.out.println("[3] Oddo");
        System.out.println("[4] Sumsang");
        System.out.println("---------------------------");
        System.out.println("Pilih HP : ");
        aksi = input.nextLine();
        if(aksi.equalsIgnoreCase("1")){
            System.out.println("Anda memilih Xiomai");
            System.out.flush();
            Amin.turnOnThePhone();
            Amin.cetakPhone();
            pilih = input.nextLine();
            if(pilih.equalsIgnoreCase("1")){ 
                Amin.turnOnThePhone(); 
            }else if(pilih.equalsIgnoreCase("2")){ 
                Amin.turnOffThePhone(); 
            }else if(pilih.equalsIgnoreCase("3")){ 
                Amin.makePhoneLouder(); 
            }else if(pilih.equalsIgnoreCase("4")){ 
                Amin.makePhoneSilent(); 
            }else if(pilih.equalsIgnoreCase("5")){ 
                Amin.getVolume();
            }else if(pilih.equalsIgnoreCase("0")){ 
                System.exit(0); 
            } else {
                System.out.println("Kamu memilih aksi yang salah!");
            }
        }else if(aksi.equalsIgnoreCase("2")){    
            System.out.println("Anda memilih Ifhon");
            System.out.flush();
            Andi.turnOnThePhone();
            Andi.cetakPhone();
            pilih = input.nextLine();
            if(pilih.equalsIgnoreCase("1")){ 
                Andi.turnOnThePhone(); 
            }else if(pilih.equalsIgnoreCase("2")){ 
                Andi.turnOffThePhone(); 
            }else if(pilih.equalsIgnoreCase("3")){ 
                Andi.makePhoneLouder(); 
            }else if(pilih.equalsIgnoreCase("4")){ 
                Andi.makePhoneSilent(); 
            }else if(pilih.equalsIgnoreCase("5")){ 
                Andi.getVolume();
            }else if(pilih.equalsIgnoreCase("0")){ 
                System.exit(0); 
            } else {
                System.out.println("Kamu memilih aksi yang salah!");
            }
        }else if(aksi.equalsIgnoreCase("3")){
            System.out.println("Anda memilih Oddo");
            System.out.flush();
            Siti.turnOnThePhone();
            Siti.cetakPhone();
            pilih = input.nextLine();
            if(pilih.equalsIgnoreCase("1")){ 
                Siti.turnOnThePhone(); 
            }else if(aksi.equalsIgnoreCase("2")){ 
                Siti.turnOffThePhone(); 
            }else if(pilih.equalsIgnoreCase("3")){ 
                Siti.makePhoneLouder(); 
            }else if(pilih.equalsIgnoreCase("4")){ 
                Siti.makePhoneSilent(); 
            }else if(pilih.equalsIgnoreCase("5")){ 
                Siti.getVolume();
            }else if(pilih.equalsIgnoreCase("0")){ 
                System.exit(0); 
            } else {
                System.out.println("Kamu memilih aksi yang salah!");
            }
        }else if(aksi.equalsIgnoreCase("4")){
            System.out.println("Anda memilih Sumsang");
            System.out.flush();
            Joko.turnOnThePhone();
            Joko.cetakPhone();
            pilih = input.nextLine();
            if(pilih.equalsIgnoreCase("1")){ 
                Joko.turnOnThePhone(); 
            }else if(pilih.equalsIgnoreCase("2")){ 
                Joko.turnOffThePhone(); 
            }else if(pilih.equalsIgnoreCase("3")){ 
                Joko.makePhoneLouder(); 
            }else if(pilih.equalsIgnoreCase("4")){ 
                Joko.makePhoneSilent(); 
            }else if(pilih.equalsIgnoreCase("5")){ 
                Joko.getVolume();
            }else if(pilih.equalsIgnoreCase("0")){ 
                System.exit(0); 
            } else {
                System.out.println("Kamu memilih aksi yang salah!");
            }
        }else{
            System.out.println("HP tidak tersedia!!");
        }
    }
}


