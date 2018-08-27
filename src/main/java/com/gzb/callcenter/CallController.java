package com.gzb.callcenter;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Date 2018-08-27
 * @author justyman
 */

@RestController
public class CallController {


    @RequestMapping(value = "/calling",method = RequestMethod.GET)
    private String call(){


        return "on calling.....";
    }
}
