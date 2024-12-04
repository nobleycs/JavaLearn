package com.atycs.IoC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class XxxService {
    @Autowired
    private XxxDao xxxDao;

    public void getMessage() {
        xxxDao.getMessage();
    }
}
