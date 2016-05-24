package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Configuration
	static class DashboardConfiguration {

        // Doesn't work
//		@Bean
//		public com.vaadin.wscdn.WidgetSet vaadinCdnInitializer() {
//			return new com.vaadin.wscdn.WidgetSet();
//		}

        // Works well
        @Bean
        public in.virit.WidgetSet vaadinCdnInitializer() {
            return new in.virit.WidgetSet();
        }
	}
}
