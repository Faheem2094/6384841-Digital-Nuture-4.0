package com.cognizant.spring_country;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringCountryApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(SpringCountryApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(SpringCountryApplication.class, args);
        displayCountry();
    }

    public static void displayCountry() {
        LOGGER.info("START");

        ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
        Country country = context.getBean("country", Country.class);

        LOGGER.debug("Country: {}", country);

        LOGGER.info("END");
    }
}
