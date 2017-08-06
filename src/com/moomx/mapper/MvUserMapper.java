package com.moomx.mapper;

import com.moomx.pojo.MvUser;
import com.moomx.pojo.MvUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MvUserMapper {
    int countByExample(MvUserExample example);

    int deleteByExample(MvUserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MvUser record);

    int insertSelective(MvUser record);

    List<MvUser> selectByExample(MvUserExample example);

    MvUser selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MvUser record, @Param("example") MvUserExample example);

    int updateByExample(@Param("record") MvUser record, @Param("example") MvUserExample example);

    int updateByPrimaryKeySelective(MvUser record);

    int updateByPrimaryKey(MvUser record);
}