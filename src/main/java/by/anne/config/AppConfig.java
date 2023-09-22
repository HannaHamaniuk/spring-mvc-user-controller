package by.anne.config;

import by.anne.model.entities.User;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceView;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.UrlBasedViewResolver;

@EnableWebMvc
@ComponentScan(basePackages = "by.anne")
public class AppConfig {
    @Bean
    public ViewResolver viewResolverJsp(){
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix("/");
        viewResolver.setSuffix(".jsp");
        return viewResolver;
    }
    @Bean
    public Configuration configuration(){
        Configuration configuration = new Configuration();
        configuration.addAnnotatedClass(User.class);
        return configuration;
    }
    @Bean
    public SessionFactory factory(Configuration configuration){
        SessionFactory factory = configuration.buildSessionFactory();
        return factory;

    }
}
