package com.info.lab4;

public class Resimler {
    private String resim_key;
    private String resim_no;
    private String resim_ad;

    public Resimler() {
    }

    public Resimler(String resim_key, String resim_no, String resim_ad) {
        this.resim_key = resim_key;
        this.resim_no = resim_no;
        this.resim_ad = resim_ad;
    }

    public String getResim_key() {
        return resim_key;
    }

    public void setResim_key(String resim_key) {
        this.resim_key = resim_key;
    }

    public String getResim_no() {
        return resim_no;
    }

    public void setResim_no(String resim_no) {
        this.resim_no = resim_no;
    }

    public String getResim_ad() {
        return resim_ad;
    }

    public void setResim_ad(String resim_ad) {
        this.resim_ad = resim_ad;
    }
}
