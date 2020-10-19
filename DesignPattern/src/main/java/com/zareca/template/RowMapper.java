package com.zareca.template;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @Auther: ly
 * @Date: 2020/10/18 22:11
 * @Description:
 */
public interface RowMapper<T> {

    T mapRow(ResultSet rs, int rowNum) throws SQLException, Exception;
}
