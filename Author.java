package org.capgemini.demo;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE,ElementType.METHOD,ElementType.CONSTRUCTOR})
@Retention(RetentionPolicy.CLASS)
public @interface Author {
	
	String authorName();
	String publishDate() default "12-Mar-2000"; 
	double price();

}
