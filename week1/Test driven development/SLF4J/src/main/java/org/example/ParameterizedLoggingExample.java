package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ParameterizedLoggingExample {

    private static final Logger logger =
            LoggerFactory.getLogger(ParameterizedLoggingExample.class);

    public static void main(String[] args) {

        String userName = "John";
        int age = 25;

        logger.info("User Name: {}, Age: {}", userName, age);

        String course = "Java FSE";
        int week = 1;

        logger.info("Course: {}, Week: {}", course, week);

    }
}