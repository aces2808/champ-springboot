package aero.champ.springboot.service;

import org.springframework.stereotype.Service;

@Service
public class SpringBootMessageServiceImpl implements SpringBootMessageService {


    public String getName(String name) {
        return "Hello " + name;
    }
}
