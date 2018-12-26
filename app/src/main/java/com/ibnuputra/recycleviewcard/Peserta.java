package com.ibnuputra.recycleviewcard;

public class Peserta {
    private String nama;
    private String nis;
    private String nomor;

    public Peserta(String nama, String nis, String nomor ){
        this.nama = nama;
        this.nis = nis;
        this.nomor = nomor;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNis() {
        return nis;
    }

    public void setNis(String nis) {
        this.nis = nis;
    }

    public String getNomor() {
        return nomor;
    }

    public void setNomor(String nomor) {
        this.nomor = nomor;
    }


}
