package com.fzscratch.webui.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Getter;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Getter
@Builder
public class ErrorResponse {
    private int status;
    private String error;
    private String message;
}
