package tr.com.obss;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
import tr.com.obss.config.AppConfig;

public class SpringMvcInitializer
        extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[] {AppConfig.class };
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return null;
    }

    @Override
    protected String[] getServletMappings() {
        return new String[] { "/" };
    }

}
