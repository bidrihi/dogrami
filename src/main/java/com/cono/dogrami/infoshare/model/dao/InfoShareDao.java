package com.cono.dogrami.infoshare.model.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("infoShareDao")
public class InfoShareDao {

    @Autowired
    private SqlSessionTemplate session;
}
