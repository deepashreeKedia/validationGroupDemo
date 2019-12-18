package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
public class TestController {

    @Autowired
    private ValidationAppform validationAppform;

    @PostMapping(value = "/test", consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ResponseEntity getCreditData(@RequestBody Appform user) {
        validateAppform(user);
        return new ResponseEntity<>("success", HttpStatus.OK);
    }

    private void validateAppform(Appform appform) {
        switch (appform.getPartnerName()) {
            case "ZEST":
                validationAppform.validateForZest(appform);
                break;
            case "CF":
                validationAppform.validateForCF(appform);
                break;
            default:
                throw new IllegalArgumentException("partner not supported");
        }
    }
}
