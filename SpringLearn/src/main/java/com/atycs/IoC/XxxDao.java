package com.atycs.IoC;

import org.springframework.stereotype.Repository;

@Repository
public class XxxDao {
    public void getMessage() {
        System.out.print("I am a message.");
    }
}
