package com.zlikun.jee;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * @author zlikun
 * @date 2019/5/8 9:28
 */
@SpringBootApplication
public class TravisSampleApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(TravisSampleApplication.class)
                .web(WebApplicationType.SERVLET)
                .run(args);
    }

}
