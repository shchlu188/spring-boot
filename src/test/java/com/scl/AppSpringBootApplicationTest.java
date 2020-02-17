package com.scl;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


/**
 * Created with IntelliJ IDEA.
 * User: chenglu
 * Date: 2020/2/16
 * Description:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class AppSpringBootApplicationTest {
    // logging
    Logger logger = LoggerFactory.getLogger(getClass());
    @Test
    public void contextLoads(){
        logger.trace("trace...");
        logger.debug("debug...");
        logger.info("info...");
        logger.warn("warn...");
        logger.error("error...");

    }

}