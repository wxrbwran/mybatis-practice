package example.mybatis.controller;

import example.mybatis.common.ApiRestResponse;
import example.mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {

  @Autowired
  UserService userService;

  @GetMapping("list")
  public ApiRestResponse getUserList(@RequestParam(value = "name", required = false) String name) {
    return ApiRestResponse.success(userService.getUserList(name));
  }

  @GetMapping("info")
  public ApiRestResponse getUserInfo(@RequestParam("id") Integer id) {
    return ApiRestResponse.success(userService.getUserById(id));
  }


}
