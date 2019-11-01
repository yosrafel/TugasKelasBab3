package com.example.proteintracker.Model;

public class DaftarTeman {

    private String nama;
    private String nim;
    private String gender;
    private String cita;
    private String hobi;
    private String motohidup;
    private int foto;

    public DaftarTeman(String namaku, String nimku, String cita, String hobi, String motohidup, int foto, String gender) {
        this.nama = namaku;
        this.nim = nimku;
        this.cita = cita;
        this.hobi = hobi;
        this.motohidup = motohidup;
        this.foto = foto;
        this.gender = gender;
    }


    public String getNama() {
        return nama;
    }

    public void setNamaku(String nama) {
        this.nama = nama;
    }


    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getCita() {
        return cita;
    }

    public void setCita(String cita) {
        this.cita = cita;
    }

    public String getHobi() {
        return hobi;
    }

    public void setHobi(String hobi) {
        this.hobi = hobi;
    }

    public String getMoto() {
        return motohidup;
    }

    public void setMotohidup(String motohidup) {
        this.motohidup = motohidup;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }


    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}