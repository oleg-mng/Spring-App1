package org.example;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component
//@Scope("prototype")
public class ClassicalMusic implements Music {

//    @PostConstruct
//    public void doMyInit(){
//        System.out.println("do my initialization");
//    }
//    @PreDestroy
//    public void doMyDestroy(){
//        System.out.println("do my destruction");
//    }

    @Override
    public String getSong() {
        return "four seasons";
    }
}
