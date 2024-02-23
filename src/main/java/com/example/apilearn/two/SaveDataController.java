package com.example.apilearn.two;

import com.example.apilearn.one.Data;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SaveDataController {
    @PostMapping("/api/saveData")
    public ResponseEntity<Data> saveData(@RequestBody Data data) {
        System.out.println("Received data: " + data);
        // 여기서 데이터를 처리하고 저장하는 로직을 구현할 수 있습니다.

        // 데이터를 처리한 후 클라이언트에게 응답을 반환합니다.
        return ResponseEntity.ok(data);
    }
}

