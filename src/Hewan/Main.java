/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hewan;

/**
 *
 * @author lenovo
 */
public class Main {
    
    public static void main(String[] args){
        Hewan HEWAN = new Hewan();
        Ikan IKAN = new Ikan();
        Ayam AYAM = new Ayam();
        Harimau HARIMAU = new Harimau();
        
        HEWAN.jenis();
        
        HEWAN = IKAN;
        HEWAN.jenis();
        
        HEWAN = AYAM;
        HEWAN.jenis();
        
        HEWAN = HARIMAU;
        HEWAN.jenis();
    }
    
}
