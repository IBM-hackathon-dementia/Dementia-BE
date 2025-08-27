package com.eumm.dementia.dementia_support.service.impl;

import com.example.dementia.dto.request.AuthRequest;
import com.example.dementia.dto.response.AuthResponse;
import com.example.dementia.entity.UserEntity;
import com.example.dementia.repository.UserRepository;
import com.example.dementia.service.AuthService;
import com.example.dementia.util.JwtTokenProvider;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService {

    private final UserRepository userRepository;
    private final JwtTokenProvider jwtTokenProvider;

    @Override
    public AuthResponse login(AuthRequest request) {
        UserEntity user = userRepository.findByUsername(request.getUsername())
                .orElseThrow(() -> new RuntimeException("User not found"));

        // TODO: 비밀번호 검증 (BCrypt 등)
        String accessToken = jwtTokenProvider.generateToken(user.getUsername());
        String refreshToken = jwtTokenProvider.generateRefreshToken(user.getUsername());

        return new AuthResponse(accessToken, refreshToken);
    }

    @Override
    public AuthResponse refreshToken(String refreshToken) {
        // TODO: refreshToken 검증 후 새로운 accessToken 발급
        String username = jwtTokenProvider.getUsername(refreshToken);
        String newAccess = jwtTokenProvider.generateToken(username);
        return new AuthResponse(newAccess, refreshToken);
    }
}
