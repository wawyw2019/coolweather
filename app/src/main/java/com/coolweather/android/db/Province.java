package com.coolweather.android.db;

import org.litepal.crud.LitePalSupport;

public class Province extends LitePalSupport{

    private int id;

    private String provinceName;

    private int provinceCode;

    private int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getProvinceName(){
        return provinceName;
    }

    public void setProvinceName(String provinceName){
        this.provinceCode = provinceCode;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
