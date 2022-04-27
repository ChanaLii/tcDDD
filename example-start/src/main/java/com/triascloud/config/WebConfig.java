package com.triascloud.config;

import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 功能描述
 *
 * @author Li3Guan1Yong3
 * @date 2022-04-27 14:00:17
 */
public class WebConfig implements WebMvcConfigurer {

    /**
     * fix 「rg.springframework.web.servlet.NoHandlerFoundException: No handler found for GET /favicon.ico」
     */
    private final String FAVICON_ICO = "/favicon.ico";
    private final String SOURCE_LOCATION = "classpath:/static/";

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler(FAVICON_ICO).addResourceLocations(SOURCE_LOCATION);
    }
}
