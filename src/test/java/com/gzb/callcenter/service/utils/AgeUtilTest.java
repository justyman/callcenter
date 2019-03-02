package com.gzb.callcenter.service.utils;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class AgeUtilTest {
    @Test
    public void age() throws Exception {

        AgeUtil util = new AgeUtil();

        Assert.assertEquals(20,util.age("M","G"));
        Assert.assertEquals(1,util.age("M","N"));
        Assert.assertEquals(15,util.age("Y","N"));
        Assert.assertEquals(15,util.age("Y","G"));
        Assert.assertEquals(10,util.age("B","G"));
        Assert.assertEquals(1,util.age("O","G"));
    }

}