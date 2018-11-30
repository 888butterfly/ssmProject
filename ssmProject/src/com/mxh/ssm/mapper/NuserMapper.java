package com.mxh.ssm.mapper;

import com.mxh.ssm.pojo.Nuser;
import com.mxh.ssm.pojo.NuserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
@Repository
public interface NuserMapper {
    int countByExample(NuserExample example);

    int deleteByExample(NuserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Nuser record);

    int insertSelective(Nuser record);

    List<Nuser> selectByExample(NuserExample example);

    Nuser selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Nuser record, @Param("example") NuserExample example);

    int updateByExample(@Param("record") Nuser record, @Param("example") NuserExample example);

    int updateByPrimaryKeySelective(Nuser record);

    int updateByPrimaryKey(Nuser record);
}