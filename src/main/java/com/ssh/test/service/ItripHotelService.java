package com.ssh.test.service;

import com.ssh.test.bean.ItripHotelEntity;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Property;

import java.util.List;

public interface ItripHotelService  {

    public List<ItripHotelEntity> fintList();

    public List<ItripHotelEntity> findByName(String name);


}
