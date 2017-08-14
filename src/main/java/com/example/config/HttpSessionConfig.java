package com.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

@EnableRedisHttpSession
public class HttpSessionConfig {

	@Bean
	public LettuceConnectionFactory connectionFactory(){ 
		LettuceConnectionFactory l =  new LettuceConnectionFactory();
		l.setHostName("ec2-34-231-155-48.compute-1.amazonaws.com");
		l.setPort(32839);
		l.setPassword("p0c3d8918f9f7202efc237d62c0558e050a64d8d33aa03aed4d9b42d27489d3e8");
		return l;
	}	
}
