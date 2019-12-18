package com.example.demo;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class ZestValidationCondition implements Condition {

    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        Appform user = (Appform) conditionContext.getBeanFactory().getBean("User");
        System.out.println(user.getPartnerName());
        return false;
    }
}
