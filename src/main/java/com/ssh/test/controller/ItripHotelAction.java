package com.ssh.test.controller;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.ssh.test.bean.ItripHotelEntity;
import com.ssh.test.service.ItripHotelService;
import com.ssh.test.service.ItripHotelServiceImpl;

import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Map;

public class ItripHotelAction extends ActionSupport {

    private String name;

    private ItripHotelService itripHotelService;


    public String findByName(){
        try {
            name = new String(name.getBytes("iso-8859-1"),"UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        List<ItripHotelEntity> list  = itripHotelService.findByName(name);

        Map<String,Object> request = (Map<String, Object>) ActionContext.getContext().get("request");

        request.put("list",list);
        return  INPUT;

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ItripHotelService getItripHotelService() {
        return itripHotelService;
    }

    public void setItripHotelService(ItripHotelService itripHotelService) {
        this.itripHotelService = itripHotelService;
    }
}
