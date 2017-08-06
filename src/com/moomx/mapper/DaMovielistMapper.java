package com.moomx.mapper;

import com.moomx.pojo.DaMovielist;
import com.moomx.pojo.DaMovielistExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DaMovielistMapper {
    int countByExample(DaMovielistExample example);

    int deleteByExample(DaMovielistExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DaMovielist record);

    int insertSelective(DaMovielist record);

    List<DaMovielist> selectByExample(DaMovielistExample example);

    DaMovielist selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DaMovielist record, @Param("example") DaMovielistExample example);

    int updateByExample(@Param("record") DaMovielist record, @Param("example") DaMovielistExample example);

    int updateByPrimaryKeySelective(DaMovielist record);

    int updateByPrimaryKey(DaMovielist record);
}