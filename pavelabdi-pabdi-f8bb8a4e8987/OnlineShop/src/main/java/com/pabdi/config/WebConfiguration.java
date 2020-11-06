package com.pabdi.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.*;
import org.thymeleaf.spring5.SpringTemplateEngine;
import org.thymeleaf.spring5.templateresolver.SpringResourceTemplateResolver;
import org.thymeleaf.spring5.view.ThymeleafViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = { "com.pabdi"})
public class WebConfiguration implements WebMvcConfigurer {

    @Autowired
    ApplicationContext applicationContext;

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/style/**").addResourceLocations("/style/");
        registry.addResourceHandler("swagger-ui.html")
                .addResourceLocations("classpath:/META-INF/resources/");
        registry.addResourceHandler("/webjars/**")
                .addResourceLocations("classpath:/META-INF/resources/webjars/");

        registry.addResourceHandler("/static/**")
                .addResourceLocations("/WEB-INF/views/frontend/build/static/");
        registry.addResourceHandler("/*.js")
                .addResourceLocations("/WEB-INF/views/frontend/build/");
        registry.addResourceHandler("/*.json")
                .addResourceLocations("/WEB-INF/views/frontend/build/");
        registry.addResourceHandler("/*.ico")
                .addResourceLocations("/WEB-INF/views/frontend/build/");
        registry.addResourceHandler("/index.html")
                .addResourceLocations("/WEB-INF/views/frontend/build/index.html");
    }

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/user-registration").setViewName("user-registration");
        registry.addViewController("/index").setViewName("index");
    }

    @Override
    public void configureViewResolvers(ViewResolverRegistry registry) {
        ThymeleafViewResolver viewResolver = new ThymeleafViewResolver();
        viewResolver.setTemplateEngine(getTemplateEngine());
        registry.viewResolver(viewResolver);
    }

    @Bean
    public SpringTemplateEngine getTemplateEngine() {
        SpringTemplateEngine springTemplateEngine = new SpringTemplateEngine();
        springTemplateEngine.setTemplateResolver(getThymeleafTemplateResolver());
        return springTemplateEngine;
    }

    @Bean
    public SpringResourceTemplateResolver getThymeleafTemplateResolver() {
        SpringResourceTemplateResolver springResourceTemplateResolver = new SpringResourceTemplateResolver();
        //springResourceTemplateResolver.setPrefix("/WEB-INF/views/");
        springResourceTemplateResolver.setPrefix("/WEB-INF/views/frontend/build/");
        springResourceTemplateResolver.setSuffix(".html");
        springResourceTemplateResolver.setApplicationContext(applicationContext);
        springResourceTemplateResolver.setTemplateMode("HTML");
        return springResourceTemplateResolver;
    }
}
