package com.clientmanager.clientmanager.validation;


import com.clientmanager.clientmanager.model.UserDetails;
import com.clientmanager.clientmanager.repository.UserRepository;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ResponseStatusException;


@Component
public class UserValidation {

    @Autowired
    private UserRepository userRepository;

    public void validator(UserDetails userValidation){


        if(userRepository.existsByUserName(userValidation.getUserName())) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST,"is exits user");
        }


        if(StringUtils.isBlank(userValidation.getUserName())) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "usernat valid");
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
