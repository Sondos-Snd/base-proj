package com.example.javaudemy;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@OpenAPIDefinition(
		info = @Info(
				title = " Documentation swagger",
				description = "something",
				version="v1.0",
				contact=@Contact(
						name="sondos",
						email="@test",
						url="https"
				),
				license=@License(
						name="sping",
						url="https"
				)

		),
		externalDocs = @ExternalDocumentation(
				description ="spring java udemy",
				url="https"
		)
)
public class JavaudemyApplication {

	@Bean
	public ModelMapper modelmapper() {
		return new ModelMapper();
	}

	public static void main(String[] args) {
		SpringApplication.run(JavaudemyApplication.class, args);
	}

}
