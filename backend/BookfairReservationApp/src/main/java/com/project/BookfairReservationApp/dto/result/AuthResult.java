package com.project.BookfairReservationApp.dto.result;

import com.project.BookfairReservationApp.dto.GeneralResponseDto;
import com.project.BookfairReservationApp.enumtype.Roles;

public record AuthResult(
        GeneralResponseDto generalResponse,
        String email,
        Roles role,
        String accessToken,
        String refreshToken) {
}

