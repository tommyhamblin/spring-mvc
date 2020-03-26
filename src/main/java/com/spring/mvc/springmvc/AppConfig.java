/*
 * Copyright 2020 Tommy Hamblin
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * you may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.spring.mvc.springmvc;

import java.util.Locale;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * The bean configuration for the view resolver.
 *
 * @author tommy.hamblin.
 */
@Configuration
public class AppConfig implements WebMvcConfigurer
{
    /**
     * Default constructor.
     */
    public AppConfig()
    {
        super();
    }

    /**
     * {@inheritDoc}.
     *
     * @param registry - the resource handler registry.
     */
    @Override
    public void addResourceHandlers(final ResourceHandlerRegistry registry)
    {
        registry.addResourceHandler("/files/**")
                .addResourceLocations("/WEB-INF/pdf/");
    }

    /**
     * {@inheritDoc}.
     *
     * @param registry - the interceptor registry.
     */
    @Override
    public void addInterceptors(final InterceptorRegistry registry)
    {
        registry.addInterceptor((this.localeChangeInterceptor()));
    }

    /**
     * The session locale resolver for I18N.
     *
     * @return LocaleResolver - the session locale resolver.
     */
    @Bean
    public LocaleResolver localeResolver()
    {
        SessionLocaleResolver slr = new SessionLocaleResolver();
        slr.setDefaultLocale(Locale.UK);
        return slr;
    }

    /**
     * The locale change interceptor for I18N.
     *
     * @return LocaleChangeInterceptor - the locale change interceptor.
     */
    @Bean
    public LocaleChangeInterceptor localeChangeInterceptor()
    {
        LocaleChangeInterceptor lci = new LocaleChangeInterceptor();
        lci.setParamName("lang");
        return lci;
    }

    /**
     * The view resolver {@link Bean}.
     *
     * @return ViewResolver - component resolver.
     */
    @Bean
    public ViewResolver viewResolver()
    {
        InternalResourceViewResolver bean = new InternalResourceViewResolver();
        bean.setPrefix("/WEB-INF/jsp/");
        bean.setSuffix(".jsp");
        bean.setOrder(0);
        return bean;
    }
}