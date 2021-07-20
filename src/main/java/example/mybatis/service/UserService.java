package example.mybatis.service;

import static org.mybatis.dynamic.sql.SqlBuilder.isEqualToWhenPresent;
import static org.mybatis.dynamic.sql.SqlBuilder.isIn;
import static org.mybatis.dynamic.sql.SqlBuilder.isLessThan;

import example.mybatis.model.dao.UserDynamicSqlSupport;
import example.mybatis.model.dao.UserMapper;
import example.mybatis.model.pojo.User;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import org.mybatis.dynamic.sql.SqlBuilder;
import org.mybatis.dynamic.sql.render.RenderingStrategies;
import org.mybatis.dynamic.sql.render.RenderingStrategy;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.where.condition.IsInWithSubselect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
  @Autowired
  UserMapper userMapper;

  public List<User> getUserList(String name) {
    SelectStatementProvider selectStatementProvider =
        SqlBuilder.select(UserMapper.selectList)
        .from(UserDynamicSqlSupport.user)
        .where(UserDynamicSqlSupport.name, isIn(
            SqlBuilder.select(UserDynamicSqlSupport.name)
            .from(UserDynamicSqlSupport.user)
        ))
        .and(UserDynamicSqlSupport.name, isEqualToWhenPresent(name))
        .build()
        .render(RenderingStrategies.MYBATIS3);

    return userMapper.selectMany(selectStatementProvider);


//    List<User> userList = userMapper.select(
//        c -> c.where(UserDynamicSqlSupport.name, IsInWithSubselect.of(
//            SqlBuilder.select(UserDynamicSqlSupport.name)
//            .from(UserDynamicSqlSupport.user)
//        ))
//        .and(UserDynamicSqlSupport.name, isEqualToWhenPresent(name))
//        .orderBy(UserDynamicSqlSupport.id.descending())
//    );
//    return userList;
  }

  public User getUserById(Integer id) {
    Optional<User> userOptional = userMapper.selectByPrimaryKey(id);
    return userOptional.orElse(null);
  }
}
