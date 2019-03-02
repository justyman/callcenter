package com.gzb.callcenter.service.utils;

import org.apache.commons.lang.StringUtils;

public class AgeUtil {

    public int age (String type,String mode){

        StringBuffer temp = new StringBuffer("");
        System.out.println("testing in.");


        // to test the branch test coverage
        if ("M".equals(StringUtils.trim(type)) && "G".equals(mode)){
            return 20;
        }else if ("Y".equals(StringUtils.trim(type))){
            return 15;
        }else if ("B".equals(StringUtils.trim(type))){
            return 10;
        }else {
            return 1;
        }


    }
}
