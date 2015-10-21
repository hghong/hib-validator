package com.hong.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import com.hong.validator.SameValidator;

@Target({ ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = SameValidator.class)
@Documented
public @interface Same {
	String value();

	String message() default "{字段不相符}";

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};
}