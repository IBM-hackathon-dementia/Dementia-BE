package com.eumm.dementia.dementia_support.controller;

@RestController
@RequestMapping("/auth")
public class AuthController {
    private final JwtTokenProvider jwtTokenProvider;

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody LoginRequest request) {
        // TODO: UserRepository에서 username/password 검증
        String token = jwtTokenProvider.generateToken(request.getUsername());
        return ResponseEntity.ok(token);
    }
}
