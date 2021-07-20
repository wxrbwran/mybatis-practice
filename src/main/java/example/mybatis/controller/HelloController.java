package example.mybatis.controller;


import example.mybatis.common.ApiRestResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wuxiaoran
 */
@RestController
@RequestMapping("index")
public class HelloController {

  @GetMapping("/hello")
  public ApiRestResponse hello() {
    return ApiRestResponse.success("hello");
  }
}
