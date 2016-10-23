package com.sysdt.estimuladorapp.dao;

import com.sysdt.estimuladorapp.model.Paciente;
import com.sysdt.estimuladorapp.model.PacienteExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PacienteMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table paciente
     *
     * @mbggenerated Sat Aug 27 14:10:49 CDT 2016
     */
    int countByExample(PacienteExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table paciente
     *
     * @mbggenerated Sat Aug 27 14:10:49 CDT 2016
     */
    int deleteByExample(PacienteExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table paciente
     *
     * @mbggenerated Sat Aug 27 14:10:49 CDT 2016
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table paciente
     *
     * @mbggenerated Sat Aug 27 14:10:49 CDT 2016
     */
    int insert(Paciente record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table paciente
     *
     * @mbggenerated Sat Aug 27 14:10:49 CDT 2016
     */
    int insertSelective(Paciente record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table paciente
     *
     * @mbggenerated Sat Aug 27 14:10:49 CDT 2016
     */
    List<Paciente> selectByExample(PacienteExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table paciente
     *
     * @mbggenerated Sat Aug 27 14:10:49 CDT 2016
     */
    Paciente selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table paciente
     *
     * @mbggenerated Sat Aug 27 14:10:49 CDT 2016
     */
    int updateByExampleSelective(@Param("record") Paciente record, @Param("example") PacienteExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table paciente
     *
     * @mbggenerated Sat Aug 27 14:10:49 CDT 2016
     */
    int updateByExample(@Param("record") Paciente record, @Param("example") PacienteExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table paciente
     *
     * @mbggenerated Sat Aug 27 14:10:49 CDT 2016
     */
    int updateByPrimaryKeySelective(Paciente record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table paciente
     *
     * @mbggenerated Sat Aug 27 14:10:49 CDT 2016
     */
    int updateByPrimaryKey(Paciente record);
}