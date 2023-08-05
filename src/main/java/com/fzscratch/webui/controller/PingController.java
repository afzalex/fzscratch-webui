package com.fzscratch.webui.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

@Slf4j
@RestController
@RequestMapping("/api/ping")
public class PingController {
    @GetMapping
    public String ping() {
        return LocalDateTime.now().toString();
    }

    @GetMapping("/echo")
    public Map<String, String> echo(@RequestParam Map<String, String> queryParams) {
        return queryParams;
    }

    @GetMapping("/error")
    public String error(@RequestParam String msg) {
        if (true) throw new RuntimeException(msg);
        return LocalDateTime.now().toString();
    }
}
