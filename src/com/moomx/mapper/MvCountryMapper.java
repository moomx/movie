package com.moomx.mapper;

import com.moomx.pojo.MvCountry;
import com.moomx.pojo.MvCountryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MvCountryMapper {
    int countByExample(MvCountryExample example);

    int deleteByExample(MvCountryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MvCountry record);

    int insertSelective(MvCountry record);

    List<MvCountry> selectByExample(MvCountryExample example);

    MvCountry selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MvCountry record, @Param("example") MvCountryExample example);

    int updateByExample(@Param("record") MvCountry record, @Param("example") MvCountryExample example);

    int updateByPrimaryKeySelective(MvCountry record);

    int updateByPrimaryKey(MvCountry record);
}