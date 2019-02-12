package edu.cscc.java4.sbootlab;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PropertiesLoaderUtils;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import java.net.InetAddress;
import java.util.Properties;

import static junit.framework.TestCase.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles(profiles = "devl")
public class SpringAppDevProfileTests {

    @Autowired
    private ApplicationContext applicationContext;

    /* ----- uncomment one test at a time and add just enough code to make it pass -----

    @Test
    public void testComponentHasExternalizedDevlProfileProperty () throws Exception {
        TestComponent testComponent = applicationContext.getBean(edu.cscc.java4.sbootlab.TestComponent.class);
        assertEquals("developmentProfile",testComponent.getExternalProperty());

        Resource applicationProperties = new ClassPathResource("/application-devl.properties");
        Properties props = PropertiesLoaderUtils.loadProperties(applicationProperties);
        assertEquals("developmentProfile",props.getProperty("edu.cscc.java4.sbootlab.externalProperty"));
    }

    @Test
    public void configurationPropertiesClassPullsPropsFromExternalConfig_Test () throws Exception {
        SomeConfigProperties someConfigProperties = applicationContext.getBean(edu.cscc.java4.sbootlab.SomeConfigProperties.class);
        assertFalse(someConfigProperties.isEnabled());
        assertEquals(InetAddress.getByName("jeff-anderson.com"),someConfigProperties.getRemoteAddress());
        assertEquals("Happiness is the only thing that multiplies when you share it. -- Albert Schweitzer",someConfigProperties.getMessageOfTheDay());
    }

     */

}
