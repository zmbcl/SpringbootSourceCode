package com.wisely.highlight_springmvc4;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

import com.wisely.highlight_springmvc4.interceptor.DemoInterceptor;
import com.wisely.highlight_springmvc4.messageconverter.MyMessageConverter;

@Configuration
@EnableWebMvc// 1
@EnableScheduling
@ComponentScan("com.wisely.highlight_springmvc4")
public class MyMvcConfig extends WebMvcConfigurerAdapter {// 2

	@Bean
	public InternalResourceViewResolver viewResolver() {
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setPrefix("/WEB-INF/classes/views/");
		viewResolver.setSuffix(".jsp");
		viewResolver.setViewClass(JstlView.class);
		return viewResolver;
	}

	/**
	 * @Description: 定义静态资源配置
	 * @Author: bcl
	 * @Date: 2020/3/19 3:36 下午
	 * @Param:
	 * @Return:
	 */
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {

		registry.addResourceHandler("/assets/**").addResourceLocations(
				"classpath:/assets/");// 3

	}


	@Bean
	public DemoInterceptor demoInterceptor() {
		return new DemoInterceptor();
	}

	/**
	 * @Description: 添加自定义过滤器
	 * @Author: bcl
	 * @Date: 2020/3/19 3:36 下午
	 * @Param:
	 * @Return:
	 */
	@Override
	public void addInterceptors(InterceptorRegistry registry) {// 2
		registry.addInterceptor(demoInterceptor());
	}

	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/index").setViewName("/index");
		registry.addViewController("/toUpload").setViewName("/upload");
		registry.addViewController("/converter").setViewName("/converter");
		registry.addViewController("/sse").setViewName("/sse");
		registry.addViewController("/async").setViewName("/async");
	}

	 @Override
	 public void configurePathMatch(PathMatchConfigurer configurer) {
	 configurer.setUseSuffixPatternMatch(false);
	 }
	// 文件上传部分
	@Bean
	public MultipartResolver multipartResolver() {
		CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver();
		multipartResolver.setMaxUploadSize(1000000);
		return multipartResolver;
	}
	
	@Override
    public void extendMessageConverters(List<HttpMessageConverter<?>> converters) {
        converters.add(converter());

    }
	
	@Bean 
	public MyMessageConverter converter(){
		return new MyMessageConverter();
	}

	

}
