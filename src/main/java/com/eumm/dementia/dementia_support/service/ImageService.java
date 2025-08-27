package com.eumm.dementia.dementia_support.service;

import com.example.dementia.dto.request.ImageUploadRequest;
import com.example.dementia.entity.ImageEntity;

import java.util.List;

public interface ImageService {
    ImageEntity uploadImage(ImageUploadRequest request);
    List<ImageEntity> getImagesByUser(String userId);
}
