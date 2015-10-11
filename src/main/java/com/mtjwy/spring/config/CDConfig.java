package com.mtjwy.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.mtjwy.spring.soundsystem.CompactDisc;
import com.mtjwy.spring.soundsystem.SgtPeppers;

@Configuration
public class CDConfig {
  @Bean
  public CompactDisc compactDisc() {
    return new SgtPeppers();
  }
}