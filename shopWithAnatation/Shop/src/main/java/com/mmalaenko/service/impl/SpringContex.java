package com.mmalaenko.service.impl;

import com.mmalaenko.utill.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringContex {
    public static AnnotationConfigApplicationContext getApplicationComtext(){
        return applicationContext;
    }

    private  static AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

}
