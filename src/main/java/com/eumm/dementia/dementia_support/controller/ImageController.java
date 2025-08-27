package com.eumm.dementia.dementia_support.controller;

import com.example.dementia.dto.request.ImageUploadRequest;
import com.example.dementia.entity.ImageEntity;
import com.example.dementia.service.ImageService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/images")
@RequiredArgsConstructor
public class ImageController {

    private final ImageService imageService;

    @PostMapping("/upload")
    public ResponseEntity<ImageEntity> uploadImage(@RequestBody ImageUploadRequest request) {
        return ResponseEntity.ok(imageService.uploadImage(request));
    }

    @GetMapping("/user/{userId}")
    public ResponseEntity<List<ImageEntity>> getUserImages(@PathVariable String userId) {
        return ResponseEntity.ok(imageService.getImagesByUser(userId));
    }
}
