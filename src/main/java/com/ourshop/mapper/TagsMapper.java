package com.ourshop.mapper;

import java.util.List;

import com.ourshop.model.Tags;
import com.ourshop.model.TagsExample;
import org.apache.ibatis.annotations.Param;

public interface TagsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tags
     *
     * @mbggenerated
     */
    int countByExample(TagsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tags
     *
     * @mbggenerated
     */
    int deleteByExample(TagsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tags
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer tagid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tags
     *
     * @mbggenerated
     */
    int insert(Tags record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tags
     *
     * @mbggenerated
     */
    int insertSelective(Tags record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tags
     *
     * @mbggenerated
     */
    List<Tags> selectByExample(TagsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tags
     *
     * @mbggenerated
     */
    Tags selectByPrimaryKey(Integer tagid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tags
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") Tags record, @Param("example") TagsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tags
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") Tags record, @Param("example") TagsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tags
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Tags record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tags
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Tags record);
}