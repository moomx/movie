package com.moomx.mapper;

import com.moomx.pojo.MvUserlogin;
import com.moomx.pojo.MvUserloginExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MvUserloginMapper {
    int countByExample(MvUserloginExample example);

    int deleteByExample(MvUserloginExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MvUserlogin record);

    int insertSelective(MvUserlogin record);

    List<MvUserlogin> selectByExample(MvUserloginExample example);

    MvUserlogin selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MvUserlogin record, @Param("example") MvUserloginExample example);

    int updateByExample(@Param("record") MvUserlogin record, @Param("example") MvUserloginExample example);

    int updateByPrimaryKeySelective(MvUserlogin record);

    int updateByPrimaryKey(MvUserlogin record);
}