package com.gzb.callcenter.service.utils;


import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Field;


public class TokenVerificationUtilTest {
    @Test
    public void verifyToken() throws Exception {

        String testAuthoriedUser = "USER1";
        String testAuthoriedTitle = "MANAGER1";
        String testUnauthorizedUser = "USERRRRR";
        String testUnauthorizedTitle = "MANAGERRRR";

        TokenVerificationUtil util = new TokenVerificationUtil();
        Class<?> clazz = util.getClass();

        Field userField = clazz.getDeclaredField("finalUser");
        userField.setAccessible(true);
        Field titleField = clazz.getDeclaredField("finalTitle");
        titleField.setAccessible(true);

        util.verifyToken(testAuthoriedUser,testAuthoriedTitle);
        Assert.assertEquals(testAuthoriedUser, userField.get(util));
        Assert.assertEquals(testAuthoriedTitle, titleField.get(util));

        titleField.set(util," ");
        util.verifyToken(testAuthoriedUser,testUnauthorizedTitle);
        Assert.assertEquals(testAuthoriedUser, userField.get(util));
        Assert.assertEquals(" ", titleField.get(util));


    }

}