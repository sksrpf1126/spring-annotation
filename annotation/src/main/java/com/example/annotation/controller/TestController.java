package com.example.annotation.controller;

import com.example.annotation.dto.ModelAttributeDto;
import com.example.annotation.dto.RequestBodyDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
public class TestController {

    /**
     * Query String 형태 or Form 형식의 Body 데이터를 객체로 변환
     */
    @GetMapping("/model")
    public String modelAttributeTest(@ModelAttribute ModelAttributeDto dto) {
        log.info("modelAttributeDto = {}", dto);
        return "success";
    }


    /**
     * HTTP 요청 본문(바디)의 JSON 및 XML 형태의 데이터를 JAVA 객체로 변환
     */
    @PostMapping("/request")
    public String requestBodyTest(@RequestBody RequestBodyDto dto) {
        log.info("requestBodyDto = {}", dto);
        return "success";
    }
}
