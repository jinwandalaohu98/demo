package com.ssh.test.service;

import com.ssh.test.bean.ItripHotelEntity;
import com.ssh.test.dao.ItripHotelDao;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Property;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

public class ItripHotelServiceImpl extends HibernateDaoSupport implements ItripHotelService{

    @Autowired
    public ItripHotelServiceImpl(@Qualifier("sessionFactory") SessionFactory sessionFactory){
        this.setSessionFactory(sessionFactory);
    }
    @Resource
    private ItripHotelDao itripHotelDao;

    public List<ItripHotelEntity> fintList(){

        return itripHotelDao.getItripHotelList();
    }

    public List<ItripHotelEntity> findByName(String name){

        DetachedCriteria detachedCriteria = DetachedCriteria.forClass(ItripHotelEntity.class);


        detachedCriteria.add(Property.forName("hotelName").eq(name));

        return  detachedCriteria.getExecutableCriteria(this.getSession()).list();


    }







}
