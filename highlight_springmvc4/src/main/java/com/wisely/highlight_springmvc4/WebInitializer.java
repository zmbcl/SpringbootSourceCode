package com.wisely.highlight_springmvc4;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class WebInitializer implements WebApplicationInitializer {//1是Spring提供用来配置servlet3。0+配置的接口，从而实现替换web.xml

	@Override
	public void onStartup(ServletContext servletContext)
			throws ServletException {
		AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
        ctx.register(MyMvcConfig.class);
        ctx.setServletContext(servletContext); //2注册配置类，并将其和当前servletContext关联
        
        Dynamic servlet = servletContext.addServlet("dispatcher", new DispatcherServlet(ctx)); //3注册Springmvc的DispatcherServlet
        servlet.addMapping("/");
        servlet.setLoadOnStartup(1);
        servlet.setAsyncSupported(true);//1

	}

}
