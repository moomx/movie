package com.moomx.pojo;

import java.util.Date;

public class MvImage {
    private Integer id;

    private String url;

    private Integer mmId;

    private Date date;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public Integer getMmId() {
        return mmId;
    }

    public void setMmId(Integer mmId) {
        this.mmId = mmId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}