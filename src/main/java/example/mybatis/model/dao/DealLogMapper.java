package example.mybatis.model.dao;

import example.mybatis.model.pojo.DealLog;
import example.mybatis.model.pojo.DealLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface DealLogMapper {
    long countByExample(DealLogExample example);

    int deleteByExample(DealLogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DealLog record);

    int insertSelective(DealLog record);

    List<DealLog> selectByExample(DealLogExample example);

    DealLog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DealLog record, @Param("example") DealLogExample example);

    int updateByExample(@Param("record") DealLog record, @Param("example") DealLogExample example);

    int updateByPrimaryKeySelective(DealLog record);

    int updateByPrimaryKey(DealLog record);
}