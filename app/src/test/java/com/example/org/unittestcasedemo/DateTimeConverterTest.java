package com.example.org.unittestcasedemo;

import org.junit.Assert;
import org.junit.Test;

public class DateTimeConverterTest {

    @Test
    public void convertLongTimeValidation(){
       Assert.assertEquals("02-Jan-2017", DateTimeConverter.convertTime(Long.valueOf
               ("1483331575239")));
    }

    @Test
    public void wrongTimeFormatValidation(){
        Assert.assertEquals("02-Jan",DateTimeConverter.convertTime(Long.valueOf
                ("1483331575239")));
    }

    @Test
    public void nullValidation() throws Exception{
        try {
            Assert.assertEquals("02-Jan-2017",DateTimeConverter.convertTime(Long.valueOf
                    ("null")));
        } catch (Exception e){
            e.printStackTrace();
        }

    }
}
