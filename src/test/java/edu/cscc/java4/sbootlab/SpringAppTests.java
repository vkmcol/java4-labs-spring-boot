package edu.cscc.java4.sbootlab;

import org.hamcrest.CoreMatchers;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PropertiesLoaderUtils;
import org.springframework.test.context.junit4.SpringRunner;

import java.lang.annotation.Annotation;
import java.net.InetAddress;
import java.util.Properties;

import static junit.framework.TestCase.*;
import static org.junit.Assert.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringAppTests {

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    public void contextLoadsAndIsProperlyDecorated_Test () {
        assertNotNull(applicationContext.getBean("springApp").getClass().
                getAnnotation(org.springframework.boot.autoconfigure.SpringBootApplication.class));
    }

    /* ----- uncomment one test at a time and add just enough code to make it pass -----

    @Test
    public void componentLoads_Test () {
        assertNotNull(applicationContext.getBean("someComponent"));
    }

    @Test
    public void someComponentHasSomeProperty_Test () throws Exception {
        SomeComponent someComponent = applicationContext.getBean(SomeComponent.class);
        Class[] paramList = { };
        assertNotNull(someComponent.getClass().getMethod("getSomeProperty", paramList));
    }

    @Test
    public void applicationPropertiesFileExists_Test () throws Exception {
        Resource applicationProperties = new ClassPathResource("/application.properties");
        Properties props = PropertiesLoaderUtils.loadProperties(applicationProperties);
    }

    @Test
    public void applicationPropertiesHasSomecomponentProperty_Test () throws Exception {
        Resource applicationProperties = new ClassPathResource("/application.properties");
        Properties props = PropertiesLoaderUtils.loadProperties(applicationProperties);
        assertEquals("defaultProfile",props.getProperty("edu.cscc.java4.sbootlab.SomeComponent.someProperty"));
    }

    @Test
    public void someComponentSetSomePropertyProperlyDecorated_Test () throws Exception {
        Class[] paramList = { String.class };

        SomeComponent someComponent = applicationContext.getBean(SomeComponent.class);
        Annotation annotation = someComponent.getClass().getMethod("setSomeProperty", paramList).getAnnotation(
          org.springframework.beans.factory.annotation.Value.class);
        assertNotNull(annotation);
        assertThat(annotation.toString(), CoreMatchers.containsString("${edu.cscc.java4.sbootlab.SomeComponent.someProperty}"));
        assertEquals("defaultProfile", someComponent.getSomeProperty());
    }

    @Test
    public void configurationPropertiesClassIsFound_Test () throws Exception {
        assertNotNull(Class.forName("edu.cscc.java4.sbootlab.SomeConfigProperties").newInstance());
    }

    @Test
    public void configurationPropertiesClassProperlyDecorated_Test () {
        SomeConfigProperties someConfigProperties = applicationContext.getBean(edu.cscc.java4.sbootlab.SomeConfigProperties.class);
        assertNotNull(someConfigProperties.getClass().getAnnotation(org.springframework.stereotype.Component.class));

        Annotation configPropsAnnotation = someConfigProperties.getClass().getAnnotation(org.springframework.boot.context.properties.ConfigurationProperties.class);
        assertNotNull(configPropsAnnotation);
        assertThat(configPropsAnnotation.toString(), CoreMatchers.containsString("edu.cscc.java4.sbootlab.config"));
    }

    @Test
    public void configurationPropertiesClassPullsPropsFromExternalConfig_Test () throws Exception {
        // Check properties file:
        Resource applicationProperties = new ClassPathResource("/application.properties");
        Properties props = PropertiesLoaderUtils.loadProperties(applicationProperties);
        assertEquals("true",props.getProperty("edu.cscc.java4.sbootlab.config.enabled"));
        assertEquals("www.cscc.edu",props.getProperty("edu.cscc.java4.sbootlab.config.remote-address"));
        assertEquals("You always pass failure on the way to success -- Mickey Rooney",
          props.getProperty("edu.cscc.java4.sbootlab.config.message-of-the-day"));

        // Check Java class properties
        SomeConfigProperties someConfigProperties = applicationContext.getBean(edu.cscc.java4.sbootlab.SomeConfigProperties.class);
        assertTrue(someConfigProperties.isEnabled());
        assertEquals(InetAddress.getByName("www.cscc.edu"),someConfigProperties.getRemoteAddress());
        assertEquals("You always pass failure on the way to success -- Mickey Rooney",someConfigProperties.getMessageOfTheDay());
    }

     */

}
