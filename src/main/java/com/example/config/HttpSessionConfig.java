package com.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

import redis.clients.jedis.JedisPoolConfig;

@Configuration
@EnableRedisHttpSession
public class HttpSessionConfig {

    @Bean
    public RedisConnectionFactory jedisConnectionFactory(){
       JedisPoolConfig poolConfig = new JedisPoolConfig();
//       poolConfig.setMaxActive(10);
       poolConfig.setMaxIdle(5);
       poolConfig.setMinIdle(1);
       poolConfig.setTestOnBorrow(true);
       poolConfig.setTestOnReturn(true);
       poolConfig.setTestWhileIdle(true);
       JedisConnectionFactory jedisConnectionFactory = new JedisConnectionFactory(poolConfig);
       return jedisConnectionFactory;
    }	
}

