package ren.baojie.baojieren;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@MapperScan("ren.baojie.baojieren.dao")
@ServletComponentScan
public class BaojierenApplication {

    public static void main(String[] args) {
        SpringApplication.run(BaojierenApplication.class, args);
    }

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        RestTemplate restTemplate = builder.build();
        // List<HttpMessageConverter<?>> messageConverters = new ArrayList<>();
        // FastJsonHttpMessageConverter jsonConverter = new FastJsonHttpMessageConverter();
        // MediaType[] mediaTypeJson = {MediaType.APPLICATION_JSON, MediaType.APPLICATION_JSON_UTF8, MediaType.TEXT_PLAIN};
        // jsonConverter.setSupportedMediaTypes(Arrays.asList(mediaTypeJson));
        // messageConverters.add(jsonConverter);
        // restTemplate.setMessageConverters(messageConverters);
        return restTemplate;
    }
}
