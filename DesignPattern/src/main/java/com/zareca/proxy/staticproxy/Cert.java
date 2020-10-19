package com.zareca.proxy.staticproxy;

import lombok.Data;

import java.util.Date;

/**
 * @Auther: ly
 * @Date: 2020/10/15 14:49
 * @Description:
 */
public class Cert {

    private String name;

    private String sn;

    private Integer certId;

    private Date dateTime;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }

    public Integer getCertId() {
        return certId;
    }

    public void setCertId(Integer certId) {
        this.certId = certId;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }
}
