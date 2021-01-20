/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kutyak;

/**
 *
 * @author Blackdog
 */
public class KutyaClass {

    private String fajta, nem, nev;
    private int kor;

    public KutyaClass(String csv) {
        String[] e = csv.split(";");
        if(e.length != 4) return;
        this.fajta = e[0];
        this.nem = e[1];
        this.kor = Integer.parseInt(e[2]);
        this.nev = e[3];
    }

    public String getFajta() {
        return fajta;
    }

    public String getNem() {
        return nem;
    }

    public String getNev() {
        return nev;
    }

    public int getKor() {
        return kor;
    }
    
}
