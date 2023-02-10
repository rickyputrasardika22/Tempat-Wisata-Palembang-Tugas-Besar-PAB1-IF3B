package com.tempatwisatapalembang;

public class GetterAndSetterWisataData
{
    private String nameWisata;
    private int imageWisata;
    private String descWisata;
    private String alamatWisata;
    private String jamOperasional;
    private String tarif;
    private String rating;
    private String lokasi;

    public String getLokasi() {
        return lokasi;
    }

    public void setLokasi(String lokasi) {
        this.lokasi = lokasi;
    }

    public String getNameWisata() {
        return nameWisata;
    }

    public void setNameWisata(String nameWisata) {
        this.nameWisata = nameWisata;
    }

    public String getDescWisata() {
        return descWisata;
    }

    public int getFotoWisata() {
        return imageWisata;
    }

    public void setFotoWisata(int fotoWisata) {
        this.imageWisata = fotoWisata;
    }

    public void setDescWisata(String descWisata) {
        this.descWisata = descWisata;
    }

    public String getAlamatWisata() {
        return alamatWisata;
    }

    public void setAlamatWisata(String alamatWisata) {
        this.alamatWisata = alamatWisata;
    }

    public String getJamOperasional() {
        return jamOperasional;
    }

    public void setJamOperasional(String jamOperasional) {
        this.jamOperasional = jamOperasional;
    }

    public String getTarif() {
        return tarif;
    }

    public void setTarif(String tarif) {
        this.tarif = tarif;
    }

    public String getRating()
    {
        return rating;
    }

    public void setRating(String rating)
    {
        this.rating = rating;
    }
}
