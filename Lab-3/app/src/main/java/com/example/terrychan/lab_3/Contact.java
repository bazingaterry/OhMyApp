package com.example.terrychan.lab_3;

import java.io.Serializable;

/**
 * Created by terrychan on 10/9/16.
 */

public class Contact implements Serializable {
    private static final long serialVersionUID = -1L;
    private String name, tel, type, location, color;
    private boolean star;

    public String getName() {
        return name;
    }

    public String getFirstLetter() {
        return name.substring(0, 1);
    }

    public String getTel() {
        return tel;
    }

    public String getType() {
        return type;
    }

    public String getLocation() {
        return location;
    }

    public String getColor() {
        return color;
    }

    public boolean isStar() {
        return star;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStar(boolean star) {
        this.star = star;
    }

    public Contact(String data) {
        String[] data_split = data.split("\t");
        name = data_split[0];
        tel = data_split[1];
        type = data_split[2];
        location = data_split[3];
        color = data_split[4];
        star = false;
    }
}
