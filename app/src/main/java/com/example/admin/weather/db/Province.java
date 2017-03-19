package com.example.admin.weather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by admin on 2017/3/19.
 */

public class Province extends DataSupport {
    private int id;
    private String provinceName;
    private int privincecode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getPrivincecode() {
        return privincecode;
    }

    public void setPrivincecode(int privincecode) {
        this.privincecode = privincecode;
    }
}
