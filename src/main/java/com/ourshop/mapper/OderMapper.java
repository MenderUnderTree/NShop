package com.ourshop.mapper;

import java.util.List;

import com.ourshop.model.Oder;
import com.ourshop.model.OderExample;
import org.apache.ibatis.annotations.Param;


public interface OderMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oder
     *
     * @mbggenerated
     */
    int countByExample(OderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oder
     *
     * @mbggenerated
     */
    int deleteByExample(OderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oder
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer oid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oder
     *
     * @mbggenerated
     */
    int insert(Oder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oder
     *
     * @mbggenerated
     */
    int insertSelective(Oder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oder
     *
     * @mbggenerated
     */
    List<Oder> selectByExample(OderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oder
     *
     * @mbggenerated
     */
    Oder selectByPrimaryKey(Integer oid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oder
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") Oder record, @Param("example") OderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oder
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") Oder record, @Param("example") OderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oder
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Oder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oder
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Oder record);
}