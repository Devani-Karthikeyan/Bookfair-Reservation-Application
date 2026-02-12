package com.project.BookfairReservationApp.service;

import com.project.BookfairReservationApp.dto.request.UserLoginDto;
import com.project.BookfairReservationApp.dto.request.UserSignUp;
import com.project.BookfairReservationApp.dto.result.AuthResult;
import jakarta.servlet.http.HttpServletRequest;

public interface UserAuthenticationService {
    /**
     *  Signs up user; returns auth result
     * @param userSignUp
     * **/
    AuthResult signUp(UserSignUp userSignUp);

    /**
     * @param userLoginDto
     * **/
    AuthResult login(UserLoginDto userLoginDto);

    /**
     * @param request
     * **/
    AuthResult refreshToken( HttpServletRequest request);

}
