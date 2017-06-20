package com.example.asus.taniticisesler;

/**
 * Created by asus on 19.6.2017.
 */

public class SatirModel {



    private int LogoId,mediaId;
    private String isim;

    public SatirModel(int logoId, int mediaId, String isim) {
        LogoId = logoId;
        this.mediaId = mediaId;
        this.isim = isim;
    }

    public int getLogoId() {
        return LogoId;
    }

    public void setLogoId(int logoId) {
        LogoId = logoId;
    }

    public int getMediaId() {
        return mediaId;
    }

    public void setMediaId(int mediaId) {
        this.mediaId = mediaId;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }
}
