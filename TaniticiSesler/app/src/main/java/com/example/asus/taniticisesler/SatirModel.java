package com.example.asus.taniticisesler;

/**
 * Created by asus on 19.6.2017.
 */

public class SatirModel {

    private int LogoId;
    private String isim;

    public SatirModel(int logoId, String isim) {
        LogoId = logoId;
        this.isim = isim;
    }

    public int getLogoId() {
        return LogoId;
    }

    public void setLogoId(int logoId) {
        LogoId = logoId;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }
}
