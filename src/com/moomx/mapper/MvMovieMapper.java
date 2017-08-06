package com.moomx.mapper;

import com.moomx.pojo.MvMovie;
import com.moomx.pojo.MvMovieExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MvMovieMapper {
    int countByExample(MvMovieExample example);

    int deleteByExample(MvMovieExample example);

    int deleteByPrimaryKey(Long id);

    int insert(MvMovie record);

    int insertSelective(MvMovie record);

    List<MvMovie> selectByExample(MvMovieExample example);

    MvMovie selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") MvMovie record, @Param("example") MvMovieExample example);

    int updateByExample(@Param("record") MvMovie record, @Param("example") MvMovieExample example);

    int updateByPrimaryKeySelective(MvMovie record);

    int updateByPrimaryKey(MvMovie record);
}