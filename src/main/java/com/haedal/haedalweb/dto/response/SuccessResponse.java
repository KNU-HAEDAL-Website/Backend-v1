package com.haedal.haedalweb.dto.response;

import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@Builder
@RequiredArgsConstructor
public class SuccessResponse {
    private final Boolean success;
    private final String message;
}