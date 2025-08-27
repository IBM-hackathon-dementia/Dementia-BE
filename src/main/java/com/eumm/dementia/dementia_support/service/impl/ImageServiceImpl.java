package com.eumm.dementia.dementia_support.service.impl;

import com.example.dementia.dto.request.ImageUploadRequest;
import com.example.dementia.entity.ImageEntity;
import com.example.dementia.repository.ImageRepository;
import com.example.dementia.service.ImageService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ImageServiceImpl implements ImageService {

    private final ImageRepository imageRepository;

    @Override
    public ImageEntity uploadImage(ImageUploadRequest request) {
        ImageEntity entity = ImageEntity.builder()
                .userId(request.getUserId())
                .imageUrl(request.getImageUrl())
                .description(request.getDescription())
                .uploadDate(LocalDateTime.now())
                .scheduledDate(request.getScheduledDate())
                .build();
        return imageRepository.save(entity);
    }

    @Override
    public List<ImageEntity> getImagesByUser(String userId) {
        return imageRepository.findByUserId(userId);
    }
}
