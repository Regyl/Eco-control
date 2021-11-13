package com.leadersofdigital.ecocontrol.api.config;

import com.leadersofdigital.ecocontrol.exception.EntityNotFoundException;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ApiResponse(responseCode = "400", description = "Request entity not found")
    @ExceptionHandler(EntityNotFoundException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public Map<String, Object> handleEntityNotFoundException(EntityNotFoundException e) {
        Map<String, Object> body = new HashMap<>(2);
        body.put("message", "Request entity not found");
        body.put("timestamp", LocalDateTime.now());
        return body;
    }
}
