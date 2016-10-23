package com.sysdt.estimuladorapp.dao;

import com.sysdt.estimuladorapp.model.Responsable;
import com.sysdt.estimuladorapp.model.ResponsableExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ResponsableMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table responsable
     *
     * @mbggenerated Sat Aug 27 14:10:49 CDT 2016
     */
    int countByExample(ResponsableExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table responsable
     *
     * @mbggenerated Sat Aug 27 14:10:49 CDT 2016
     */
    int deleteByExample(ResponsableExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table responsable
     *
     * @mbggenerated Sat Aug 27 14:10:49 CDT 2016
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table responsable
     *
     * @mbggenerated Sat Aug 27 14:10:49 CDT 2016
     */
    int insert(Responsable record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table responsable
     *
     * @mbggenerated Sat Aug 27 14:10:49 CDT 2016
     */
    int insertSelective(Responsable record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table responsable
     *
     * @mbggenerated Sat Aug 27 14:10:49 CDT 2016
     */
    List<Responsable> selectByExample(ResponsableExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table responsable
     *
     * @mbggenerated Sat Aug 27 14:10:49 CDT 2016
     */
    Responsable selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table responsable
     *
     * @mbggenerated Sat Aug 27 14:10:49 CDT 2016
     */
    int updateByExampleSelective(@Param("record") Responsable record, @Param("example") ResponsableExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table responsable
     *
     * @mbggenerated Sat Aug 27 14:10:49 CDT 2016
     */
    int updateByExample(@Param("record") Responsable record, @Param("example") ResponsableExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table responsable
     *
     * @mbggenerated Sat Aug 27 14:10:49 CDT 2016
     */
    int updateByPrimaryKeySelective(Responsable record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table responsable
     *
     * @mbggenerated Sat Aug 27 14:10:49 CDT 2016
     */
    int updateByPrimaryKey(Responsable record);
}