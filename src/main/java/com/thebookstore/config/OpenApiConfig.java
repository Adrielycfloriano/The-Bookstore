package com.thebookstore.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@OpenAPIDefinition
@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI theBookstore(){
        return new OpenAPI().info(
                new Info()
                        .title("The Bookstore API")
                        .description("Projeto desenvolvido para Sistema de Cadastro de Livros e Autores")
        );
    }
}
