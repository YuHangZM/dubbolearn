package com.anla.rpc.hellodubbo.api.config;

import com.anla.rpc.hellodubbo.stub.provider.IndexFacade;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 统一引入dubbo 的 bean
 * @author luoan
 * @version 1.0
 * @date 2019/5/20 15:22
 **/
@Configuration
public class DubboBeanConfig {

    @Reference(version = "1.0.0")
    private IndexFacade indexFacade;

    @Bean
    public IndexFacade indexFacede(){
        return indexFacade;
    }
}
