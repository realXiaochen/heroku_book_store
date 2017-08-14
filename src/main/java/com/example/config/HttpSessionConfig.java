package com.example.config;

import java.net.URI;

import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

@EnableRedisHttpSession
public class HttpSessionConfig {

	@Bean
	public LettuceConnectionFactory connectionFactory(){
//		LettuceConnectionFactory lettuceConnectionFactory = new LettuceConnectionFactory();
//		URI redisUri =  new URI(System.getenv("REDISCLOUD_URL"));
		return new LettuceConnectionFactory();
	}
	
	
		
		
//    URI redisUri =  new URI(System.getenv("REDISCLOUD_URL"));
//    JedisConnectionFactory redisConnectionFactory = new JedisConnectionFactory();
//    redisConnectionFactory.setHostName(redisUri.getHost());
//    redisConnectionFactory.setPort(redisUri.getPort());
//    redisConnectionFactory.setPassword(redisUri.getUserInfo().split(":",2)[1]);
//    redisConnectionFactory.setUsePool(true);
//    return redisConnectionFactory;

}
