package com.example.vocout_backend;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VocableController {


    @CrossOrigin
    @GetMapping("/getAllVocables")
    public ResponseEntity<String> getAllVocables(){
        return new ResponseEntity<String>("all vocables", HttpStatus.OK);
    }
}
