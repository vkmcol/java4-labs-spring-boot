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
        assertNotNull(applicationContext.getBean("testComponent"));
    }

    @Test
    public void componentHasExternalizedProperty_Test () throws Exception {
        TestComponent testComponent = applicationContext.getBean(edu.cscc.java4.sbootlab.TestComponent.class);
        assertEquals("activeProfile",testComponent.getExternalProperty());

        Resource applicationProperties = new ClassPathResource("/application.properties");
        Properties props = PropertiesLoaderUtils.loadProperties(applicationProperties);
        assertEquals("activeProfile",props.getProperty("edu.cscc.java4.sbootlab.externalProperty"));
    }

    @Test
    public void configurationPropertiesClassIsFound_Test () {
        SomeConfigProperties someConfigProperties = applicationContext.getBean(edu.cscc.java4.sbootlab.SomeConfigProperties.class);
    }

    @Test
    public void configurationPropertiesClassProperlyDecorated_Test () {
        SomeConfigProperties someConfigProperties = applicationContext.getBean(edu.cscc.java4.sbootlab.SomeConfigProperties.class);
        Annotation annotation = someConfigProperties.getClass().getAnnotation(org.springframework.boot.context.properties.ConfigurationProperties.class);
        assertNotNull(annotation);
        assertThat(annotation.toString(), CoreMatchers.containsString("prefix=edu.cscc.java4.sbootlab.config"));
    }

    @Test
    public void configurationPropertiesClassPullsPropsFromExternalConfig_Test () throws Exception {
        SomeConfigProperties someConfigProperties = applicationContext.getBean(edu.cscc.java4.sbootlab.SomeConfigProperties.class);
        assertTrue(someConfigProperties.isEnabled());
        assertEquals(InetAddress.getByName("www.cscc.edu"),someConfigProperties.getRemoteAddress());
        assertEquals("You always pass failure on the way to success -- Mickey Rooney",someConfigProperties.getMessageOfTheDay());
    }

    */

}
