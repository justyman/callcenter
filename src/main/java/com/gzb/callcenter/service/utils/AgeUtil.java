package com.gzb.callcenter.service.utils;

import org.apache.commons.lang.StringUtils;

public class AgeUtil {

    public int age (String type){
        if ("M".equals(StringUtils.trim(type))){
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
