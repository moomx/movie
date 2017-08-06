package com.moomx.mapper;

import com.moomx.pojo.MvType;
import com.moomx.pojo.MvTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MvTypeMapper {
    int countByExample(MvTypeExample example);

    int deleteByExample(MvTypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MvType record);

    int insertSelective(MvType record);

    List<MvType> selectByExample(MvTypeExample example);

    MvType selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MvType record, @Param("example") MvTypeExample example);

    int updateByExample(@Param("record") MvType record, @Param("example") MvTypeExample example);

    int updateByPrimaryKeySelective(MvType record);

    int updateByPrimaryKey(MvType record);
}