package com.NickWilsonDev;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import junit.framework.Assert;



/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }

    //@Test
    public void testPrintHelloWorld() {
        Assert.assertEquals(App.getHelloWorld(), "Hello World");
    }

    //@Test
    public void testPrintHelloWorld2() {
        Assert.assertEquals(App.getHelloWorld2(), "Hello World 222");
    }
}
