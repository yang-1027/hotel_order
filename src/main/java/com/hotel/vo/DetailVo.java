package com.hotel.vo;

/**
 * @program: HotelOrder1
 * @description:
 * @author: yhh
 * @create: 2020-04-27 22:13
 **/
public class DetailVo {

    private String stayName;

    private Integer stayPhone;

    private String  stayCardId;

    public String getStayName() {
        return stayName;
    }

    public void setStayName(String stayName) {
        this.stayName = stayName;
    }

    public Integer getStayPhone() {
        return stayPhone;
    }

    public void setStayPhone(Integer stayPhone) {
        this.stayPhone = stayPhone;
    }

    public String getStayCardId() {
        return stayCardId;
    }

    public void setStayCardId(String stayCardId) {
        this.stayCardId = stayCardId;
    }
}

