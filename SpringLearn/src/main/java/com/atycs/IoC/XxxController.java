package com.atycs.IoC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class XxxController {

    @Autowired
    private XxxService xxxService;

    public void getMessage() {
        xxxService.getMessage();
    }
}
