package com.example.demo.typeHandler;

import com.example.demo.entity.SexEnum;
import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;
import org.apache.ibatis.type.MappedTypes;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@MappedJdbcTypes(JdbcType.INTEGER)
@MappedTypes(value = SexEnum.class)
public class SexTypeHandler extends BaseTypeHandler<SexEnum> {
    @Override
    public void setNonNullParameter(PreparedStatement preparedStatement, int i, SexEnum sexEnum, JdbcType jdbcType) throws SQLException {
        preparedStatement.setInt(i, sexEnum.getId());
    }

    @Override
    public SexEnum getNullableResult(ResultSet resultSet, String s) throws SQLException {
        int sexenum = resultSet.getInt(s);
        if (sexenum != 1 && sexenum != 2){
            return null;
        }
        return SexEnum.getEnumById(sexenum);
    }

    @Override
    public SexEnum getNullableResult(ResultSet resultSet, int i) throws SQLException {
        int sexenum = resultSet.getInt(i);
        if (sexenum != 1 && sexenum != 2){
            return null;
        }
        return SexEnum.getEnumById(sexenum);
    }

    @Override
    public SexEnum getNullableResult(CallableStatement callableStatement, int i) throws SQLException {
        int sexenum = callableStatement.getInt(i);
        if (sexenum != 1 && sexenum != 2){
            return null;
        }
        return SexEnum.getEnumById(sexenum);
    }
}
