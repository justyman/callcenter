package com.gzb.callcenter.service.utils;

public class TokenVerificationUtil {

    private String finalUser = " ";
    private String finalTitle = " ";

    public void verifyToken(String userName, String userTitle){

        String AUTHORIZED_USER_NAME = "USER1";
        String AUTHORIZED_USER_TITLE = "MANAGER1";
        System.out.println("Token verification testing started.");

        if (AUTHORIZED_USER_NAME.equals(userName)){

            // TO DO
            this.finalUser = AUTHORIZED_USER_NAME;
            System.out.println("authorized user");

        }

        if (AUTHORIZED_USER_TITLE.equals(userTitle)){

            //TO DO
            this.finalTitle = AUTHORIZED_USER_TITLE;
            System.out.println("authorized title");
        }

    }
}
