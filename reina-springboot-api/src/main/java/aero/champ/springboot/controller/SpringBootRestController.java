package aero.champ.springboot.controller;

import aero.champ.springboot.service.SpringBootMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "springboot-controller")
public class SpringBootRestController {

    @Autowired
    private SpringBootMessageService springBootMessageService;

    @RequestMapping(value = "/get", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_VALUE, method =
            RequestMethod.POST)
    public ResponseEntity<String> getName(@RequestBody String name) {
        return new ResponseEntity<String>(springBootMessageService.getName(name), HttpStatus.OK);
    }
}
