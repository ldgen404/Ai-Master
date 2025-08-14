package com.ldgen.ldgenaimaster;

import cn.hutool.core.date.SystemClock;
import cn.hutool.core.text.StrFormatter;
import dev.langchain4j.community.store.embedding.redis.spring.RedisEmbeddingStoreAutoConfiguration;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.core.env.Environment;

@EnableAspectJAutoProxy(exposeProxy = true)
@SpringBootApplication(exclude = {RedisEmbeddingStoreAutoConfiguration.class})
@MapperScan("com.ldgen.ldgenaimaster.mapper")
public class LdgenAiMasterApplication {
    public static void main(String[] args) {
        long start = SystemClock.now();
        ConfigurableApplicationContext context = SpringApplication.run(LdgenAiMasterApplication.class, args);
        Environment env = context.getEnvironment();
        String appName = env.getProperty("spring.application.name", "LdgenAiMaster");
        String profile = String.join(",", env.getActiveProfiles());
        if (profile.isEmpty()) {
            profile = env.getProperty("spring.profiles.active", "default");
        }
        int port = Integer.parseInt(env.getProperty("server.port", "8080"));

        System.out.println(StrFormatter.format(
                ">>>>>{} 启动成功。环境：{}。耗时：{}秒。端口：{}<<<<<",
                appName,
                profile,
                (SystemClock.now() - start) / 1000,
                port
        ));
    }
}

