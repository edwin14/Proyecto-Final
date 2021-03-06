
package com.edwin.web;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;


public class WebApp extends AbstractAnnotationConfigDispatcherServletInitializer {
    
   @Override
    protected String[] getServletMappings(){
      return new String[]{
          "/restaurante/*"
      } ; 
    }
    @Override
    protected Class<?>[] getRootConfigClasses(){
        return new Class<?>[0];
    }
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[]{WebAppConfig.class};
 } 
    
}
