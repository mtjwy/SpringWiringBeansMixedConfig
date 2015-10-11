package com.mtjwy.spring.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.mtjwy.spring.soundsystem.CDPlayer;
import com.mtjwy.spring.soundsystem.CompactDisc;

@Configuration
public class CDPlayerConfig {
  
  @Bean
  public CDPlayer cdPlayer(CompactDisc compactDisc) {
    return new CDPlayer(compactDisc);
  }

}
