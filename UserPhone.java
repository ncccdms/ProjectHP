/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjectPhone;

/**
 *
 * @author LENOVO
 */
public class UserPhone {
        private Phone phone; 
        public UserPhone(Phone phone){
            this.phone = phone; 
        }
        
        void turnOnThePhone(){ 
            this.phone.powerOn(); 
        }
        
        void turnOffThePhone(){ 
            this.phone.powerOff(); 
        }
        
        void makePhoneLouder(){ 
            this.phone.volumeUp(); 
        }
        
        void makePhoneSilent(){ 
            this.phone.volumeDown(); 
        }
        
        void getVolume(){
            this.phone.volumeValue();
        }
        
        void cetakPhone(){
            System.out.println("=== APLIKASI INTERFACE ===");
            System.out.println("[1] Nyalakan HP");
            System.out.println("[2] Matikan HP");
            System.out.println("[3] Perbesar Volume");
            System.out.println("[4] Kecilkan Volume");
            System.out.println("[5] Tampilkan Volume");
            System.out.println("[0] Keluar");
            System.out.println("--------------------------");
            System.out.print("Pilih aksi> ");
        }
}
