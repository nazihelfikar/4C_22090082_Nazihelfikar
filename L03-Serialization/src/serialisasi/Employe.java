/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serialisasi;

import java.io.Serializable;

/**
 *
 * @author teguh
 */
public class Employe implements Serializable {
    private String Id;
    private String Nama;
    private transient String Password; // transient member
    private static int Age; // static member
    private final String NIK ; // final member
    
    public Employe (String id, String nama, String password, int age, String nik) {
        this.Id = id;
        this.Nama = nama;
        this.Password = password;
        this.Age= age;
        this.NIK = nik;
    }
    
    @Override
    public String toString() {
        return "\r\nID = " + Id + "\r\nNama = " +Nama + "\r\nPassword = "+Password +"\r\nUsia = "+Age+"\r\nNIK = "+NIK+"\r\n";
    } 
}
