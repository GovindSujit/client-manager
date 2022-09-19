package com.clientmanager.clientmanager.validation;


import com.clientmanager.clientmanager.model.UserDetails;
import org.apache.commons.lang3.StringUtils;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;


public class UserValidation {


    public void validator(UserDetails userValidation){

        if(StringUtils.isBlank(userValidation.getUserName())){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
        }
        if(StringUtils.isBlank(userValidation.getAddress())){
          throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
        }

        if(StringUtils.isBlank(userValidation.getEmail())){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
        }

        java.util.regex.Pattern pattern =
                java.util.regex.Pattern.compile("\\w+\\.\\w+");

        java.util.regex.Matcher matcher = pattern.matcher(userValidation.getUserName());

        System.out.println(matcher.matches());
    }

}
