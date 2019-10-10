/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.ulang.pkg10114504.latihan17.programtunjangan;

/**
 *
 * @author 
 * NAMA     : Sandy Akbar
 * KELAS    : PBO-Ulang
 * NIM      : 10114504
 * DESKRIPSI:Program Ini berisi tunjangan karyawan
 */
import java.util.Scanner;

public class PBOULANG10114504Latihan17ProgramTunjangan {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int gajiPokok; 
        int tunjangan; 
        int totalGaji;
        String Status;
        
        Scanner scan = new Scanner(System.in);   
        Scanner keyboard = new Scanner (System.in);
        
        System.out.println("================PROGRAM TUNJANGAN================");
        //Input
        System.out.print("Berapa Gaji Pokok anda Perbulan : Rp.");
        gajiPokok = scan.nextInt();
        System.out.print("Status Anda (Menikah/Belum)      : ");
        Status = keyboard.nextLine();
        //Proses
        if (Status.equals("Menikah")){
        tunjangan = gajiPokok * 35/100;
        }
        else {
                tunjangan = 0;
                } 
    
        totalGaji = gajiPokok + tunjangan;
        // Output
        System.out.println("");
        System.out.println("==========HASIL PERHITUNGAN GAJI ANDA=========");
        System.out.println("GAJI POKOK      : Rp." + gajiPokok+".0");
        System.out.println("TUNJANGAN       : Rp." + tunjangan+".0");
        System.out.println("TOTAL GAJI      : Rp." + totalGaji+".");
        System.out.println("(Developed by Muhammad Syahrun Dalu)");
    }
    
}
