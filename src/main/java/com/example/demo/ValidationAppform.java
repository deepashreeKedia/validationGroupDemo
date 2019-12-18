package com.example.demo;

import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;

@Service
@Validated
public class ValidationAppform {

    @Validated(ZestValidationGroup.class)
     void validateForZest(@Valid Appform user){
    }

    @Validated(CFValidationGroup.class)
     void validateForCF(@Valid Appform user){
    }

}
