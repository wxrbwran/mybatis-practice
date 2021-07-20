package example.mybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author wuxiaoran
 */
@SpringBootApplication
@MapperScan(basePackages = "example.mybatis.model.dao")
public class Application {

  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }

}
