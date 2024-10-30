package poplaroot.communication.example.service.spring2.DualPlugExample.demonstration2.config;

import com.tunjix.poplaroot.spring.boot.start.core.PoplarRootSpringApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * AUTHOR: XirALi · MaMat（西尔艾力·买买提）
 * DATE: 2024/10/29 14:13
 */
@Configuration
public class PoplarootConfig {
    @Bean
    public PoplarRootSpringApplication poplarRootSpringApplication(){
        return new PoplarRootSpringApplication();
    }

}
