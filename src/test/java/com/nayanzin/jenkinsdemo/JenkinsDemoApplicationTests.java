package com.nayanzin.jenkinsdemo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JenkinsDemoApplicationTests {

  @Test
  void contextLoads() {
  }

  @Test
  void failTest() {
    throw new RuntimeException();
  }

}
