package example.mybatis.service;

import example.mybatis.model.dao.UserMapper;
import example.mybatis.model.pojo.User;
import example.mybatis.model.pojo.UserExample;
import java.util.Arrays;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author wuxiaoran
 */
@Service
@Slf4j
public class UserService {
  @Autowired
  UserMapper userMapper;

  public List<User> getUserList() {
    UserExample userExample = new UserExample();
    userExample.setOrderByClause("id desc, created_time desc");
    userExample
        .or()
        .andNameEqualTo("wuxiaoran")
        .andCreatedTimeIsNotNull();
    userExample
        .or()
        .andNameIn(Arrays.asList(
            "gaoxue", "liuyiyi"
        ))
        .andCreatedTimeIsNotNull();
    log.info("count, {}" , userMapper.countByExample(userExample));
    return userMapper.selectByExample(userExample);
  }
}
