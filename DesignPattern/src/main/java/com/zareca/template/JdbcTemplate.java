package com.zareca.template;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: ly
 * @Date: 2020/10/18 22:12
 * @Description:
 */
public abstract class JdbcTemplate {

    private DataSource dataSource;

    public JdbcTemplate(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public List<?> executeQuery(String sql, RowMapper<?> rowMapper, Object[] values) throws Exception {
        Connection conn = this.getConnection();
        PreparedStatement pstm = this.createPrepareStatement(conn, sql);
        ResultSet rs = this.executeQuery(pstm, values);
        List<?> result = this.paresResultSet(rs, rowMapper);
        this.closeResultSet(rs);
        this.closeStatement(pstm);
        this.closeConnection(conn);
        return result;
    }

    private void closeConnection(Connection conn) throws Exception{
        conn.close();
    }

    private void closeStatement(PreparedStatement pstm) throws Exception{
        pstm.close();
    }

    private void closeResultSet(ResultSet rs) throws Exception{
        rs.close();
    }

    private List<?> paresResultSet(ResultSet rs, RowMapper<?> rowMapper) throws Exception{
        ArrayList<Object> result = new ArrayList<Object>();
        int rowNum = 1;
        while (rs.next()){
            result.add(rowMapper.mapRow(rs, rowNum++));
        }

        return result;

    }


    private ResultSet executeQuery(PreparedStatement pstm, Object[] values) throws Exception {
        for (int i = 0; i < values.length; i++) {
            pstm.setObject(i, values[i]);
        }

        return pstm.executeQuery();

    }

    protected PreparedStatement createPrepareStatement(Connection conn, String sql) throws Exception {
        return conn.prepareStatement(sql);
    }

    protected Connection getConnection() throws Exception {
        return this.dataSource.getConnection();
    }
}
