package com.sehkmet.microservices.productservice.mapper;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class ErrorMapper {

    /**
     * Creates map with key: "message" and value: exception's message.
     *
     * @param throwable - the thrown exception
     * @return the created map
     */
    public Map<String, String> createErrorMap(Throwable throwable) {
        Map<String, String> errorMessageMap = new HashMap<>();
        errorMessageMap.put("message", throwable.getMessage());

        return errorMessageMap;
    }

    /**
     * Creates map with key: "message" and value: exception's message.
     *
     * @param message - the thrown exception
     * @return the created map
     */
    public Map<String, String> createErrorMap(String message) {
        Map<String, String> errorMessageMap = new HashMap<>();
        errorMessageMap.put("message", message);

        return errorMessageMap;
    }
}
