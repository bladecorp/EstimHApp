package com.sysdt.estimuladorapp.dao;

import com.sysdt.estimuladorapp.model.Tipoonda;
import com.sysdt.estimuladorapp.model.TipoondaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TipoondaMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tipoonda
     *
     * @mbggenerated Sat Aug 27 14:10:49 CDT 2016
     */
    int countByExample(TipoondaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tipoonda
     *
     * @mbggenerated Sat Aug 27 14:10:49 CDT 2016
     */
    int deleteByExample(TipoondaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tipoonda
     *
     * @mbggenerated Sat Aug 27 14:10:49 CDT 2016
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tipoonda
     *
     * @mbggenerated Sat Aug 27 14:10:49 CDT 2016
     */
    int insert(Tipoonda record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tipoonda
     *
     * @mbggenerated Sat Aug 27 14:10:49 CDT 2016
     */
    int insertSelective(Tipoonda record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tipoonda
     *
     * @mbggenerated Sat Aug 27 14:10:49 CDT 2016
     */
    List<Tipoonda> selectByExample(TipoondaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tipoonda
     *
     * @mbggenerated Sat Aug 27 14:10:49 CDT 2016
     */
    Tipoonda selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tipoonda
     *
     * @mbggenerated Sat Aug 27 14:10:49 CDT 2016
     */
    int updateByExampleSelective(@Param("record") Tipoonda record, @Param("example") TipoondaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tipoonda
     *
     * @mbggenerated Sat Aug 27 14:10:49 CDT 2016
     */
    int updateByExample(@Param("record") Tipoonda record, @Param("example") TipoondaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tipoonda
     *
     * @mbggenerated Sat Aug 27 14:10:49 CDT 2016
     */
    int updateByPrimaryKeySelective(Tipoonda record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tipoonda
     *
     * @mbggenerated Sat Aug 27 14:10:49 CDT 2016
     */
    int updateByPrimaryKey(Tipoonda record);
}