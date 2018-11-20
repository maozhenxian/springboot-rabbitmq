package com.mzx.demo.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.mzx.demo.product.ProductDemo;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductDemoTest {

    @Autowired
    private ProductDemo demo = new ProductDemo();
    
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testSendToQueue() {
        String str = "z";
        StringBuffer sbf = new StringBuffer(str);
        for (int i = 0; i < 10; i++) {
            demo.sendToQueue(sbf.toString());
            sbf.append(str);
        }
    }

}
