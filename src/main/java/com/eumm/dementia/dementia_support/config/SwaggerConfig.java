package com.eumm.dementia.dementia_support.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {
    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Dementia Reminiscence Therapy API")
                        .version("1.0")
                        .description("치매 회상 치료 지원 시스템 API 문서"));
    }
}
