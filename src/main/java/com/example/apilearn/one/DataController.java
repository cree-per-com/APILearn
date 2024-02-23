package com.example.apilearn.one;

import com.example.apilearn.one.Data;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DataController {

    @GetMapping("/api/data")
    public Data getData() {
        Data data = new Data();
        data.setId(9999);
        data.setName("박민우 입니다 야옹");
        return data;
    }
}