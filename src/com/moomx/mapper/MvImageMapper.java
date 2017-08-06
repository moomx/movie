package com.moomx.mapper;

import com.moomx.pojo.MvImage;
import com.moomx.pojo.MvImageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MvImageMapper {
    int countByExample(MvImageExample example);

    int deleteByExample(MvImageExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MvImage record);

    int insertSelective(MvImage record);

    List<MvImage> selectByExample(MvImageExample example);

    MvImage selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MvImage record, @Param("example") MvImageExample example);

    int updateByExample(@Param("record") MvImage record, @Param("example") MvImageExample example);

    int updateByPrimaryKeySelective(MvImage record);

    int updateByPrimaryKey(MvImage record);
}