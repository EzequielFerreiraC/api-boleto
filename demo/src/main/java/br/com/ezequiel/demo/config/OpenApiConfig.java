package br.com.ezequiel.demo.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI().info(new Info()
                .title("API boleto")
                .description("Api de pagamento de Boletos")
                .contact(new Contact().name("Ezequiel").email("ezequiel.cardoso1605@gmail.com"))
                .version("1.0.0"));
    }
}
