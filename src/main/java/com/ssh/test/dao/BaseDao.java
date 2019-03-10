package com.ssh.test.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class BaseDao extends HibernateDaoSupport {

        public BaseDao(){}

        @Autowired
        public BaseDao(SessionFactory sessionFactory){

            this.setSessionFactory(sessionFactory);
        }





}
