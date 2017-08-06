package com.moomx.mapper;

import com.moomx.pojo.MvUrl;
import com.moomx.pojo.MvUrlExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MvUrlMapper {
    int countByExample(MvUrlExample example);

    int deleteByExample(MvUrlExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MvUrl record);

    int insertSelective(MvUrl record);

    List<MvUrl> selectByExample(MvUrlExample example);

    MvUrl selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MvUrl record, @Param("example") MvUrlExample example);

    int updateByExample(@Param("record") MvUrl record, @Param("example") MvUrlExample example);

    int updateByPrimaryKeySelective(MvUrl record);

    int updateByPrimaryKey(MvUrl record);
}