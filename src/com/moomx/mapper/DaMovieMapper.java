package com.moomx.mapper;

import com.moomx.pojo.DaMovie;
import com.moomx.pojo.DaMovieExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DaMovieMapper {
    int countByExample(DaMovieExample example);

    int deleteByExample(DaMovieExample example);

    int deleteByPrimaryKey(Long id);

    int insert(DaMovie record);

    int insertSelective(DaMovie record);

    List<DaMovie> selectByExample(DaMovieExample example);

    DaMovie selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") DaMovie record, @Param("example") DaMovieExample example);

    int updateByExample(@Param("record") DaMovie record, @Param("example") DaMovieExample example);

    int updateByPrimaryKeySelective(DaMovie record);

    int updateByPrimaryKey(DaMovie record);
}