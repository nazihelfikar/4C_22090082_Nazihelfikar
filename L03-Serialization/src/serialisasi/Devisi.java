/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serialisasi;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author teguh
 */
public class Devisi implements Serializable{
    private String Id_Devisi;
    private String Nama_Devisi;
    private List<Employe> employes;

    public String getId_Devisi() {
        return Id_Devisi;
    }

    public void setId_Devisi(String Id_Devisi) {
        this.Id_Devisi = Id_Devisi;
    }

    public String getNama_Devisi() {
        return Nama_Devisi;
    }

    public void setNama_Devisi(String Nama_Devisi) {
        this.Nama_Devisi = Nama_Devisi;
    }

    public List<Employe> getEmployes() {
        return employes;
    }

    public void setEmployes(List<Employe> employes) {
        this.employes = employes;
    }
    @Override
    public String toString() {
        String devisi, user = "";
        devisi = "Devisi : \r\n"
                + "Id Devisi = " + Id_Devisi + "\r\n"
                + "Nama Devisi = " + Nama_Devisi + "\r\n"
                + "=======================\r\n"
                + "Employe : \r\n";
        user = employes.stream().map((obj) -> 
       obj.toString()).reduce(user, String::concat);
        return devisi + user;
    }

}
