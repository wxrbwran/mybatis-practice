package example.mybatis.controller;

import example.mybatis.common.ApiRestResponse;
import example.mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wuxiaoran
 */
@RestController
@RequestMapping("user")
public class UserController {

  @Autowired
  UserService userService;

  @GetMapping("/list")
  public ApiRestResponse getUserList() {
    return ApiRestResponse.success(userService.getUserList());
  }
}
