package com.ssh.test.dao;

import com.ssh.test.bean.ItripHotelEntity;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Property;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("itripHotelDao")
public class ItripHotelDao extends BaseDao {
    public ItripHotelDao() {
    }

    @Autowired
    public ItripHotelDao(SessionFactory sessionFactory) {

        this.setSessionFactory(sessionFactory);
    }

    public List<ItripHotelEntity> getItripHotelList() {

        System.out.println(this.getHibernateTemplate());
        return super.getHibernateTemplate().find("from ItripHotelEntity as h ");
    }

    public List<ItripHotelEntity> findByName(String name) {

        DetachedCriteria detachedCriteria = DetachedCriteria.forClass(ItripHotelEntity.class);


        detachedCriteria.add(Property.forName("hotelName").eq(name));

        return detachedCriteria.getExecutableCriteria(this.getSession()).list();

    }
}
