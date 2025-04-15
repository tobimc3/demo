package com.mcfarland.demo.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;
import com.mcfarland.demo.entity.Employee;


@Repository
public class EmployeeDaoImpl implements EmployeeDao{

private final NamedParameterJdbcTemplate template;

public EmployeeDaoImpl(NamedParameterJdbcTemplate template) {
    this.template = template;
}

/*@Override
public List<Employee> findAll() {
return template.query("SELECT * FROM employee", new EmployeeRowMapper());
}*/

@Override
public void insertEmployee(Employee emp) {
/*final String sql = "INSERT INTO employee (employeeId, employeeName, employeeAddress, employeeEmail) VALUES (:employeeId, :employeeName, :employeeAddress, :employeeEmail)";
SqlParameterSource param = new MapSqlParameterSource()
.addValue("employeeId", emp.getEmployeeId())
.addValue("employeeName", emp.getEmployeeName())
.addValue("employeeAddress", emp.getEmployeeAddress())
template.update(sql, param, new GeneratedKeyHolder());*/
}

@Override
public void updateEmployee(Employee emp) {
/*final String sql = "UPDATE employee SET employeeName=:employeeName, employeeAddress=:employeeAddress, employeeEmail=:employeeEmail WHERE employeeId=:employeeId";
SqlParameterSource param = new MapSqlParameterSource()
.addValue("employeeId", emp.getEmployeeId())
.addValue("employeeName", emp.getEmployeeName())
.addValue("employeeAddress", emp.getEmployeeAddress())
template.update(sql, param, new GeneratedKeyHolder());*/
}

@Override
public void executeUpdateEmployee(Employee emp) {
/*final String sql = "UPDATE employee SET employeeName=:employeeName, employeeAddress=:employeeAddress, employeeEmail=:employeeEmail WHERE employeeId=:employeeId";
Map<String, Object> map = new HashMap<>();
  map.put("employeeId", emp.getEmployeeId());
  map.put("employeeName", emp.getEmployeeName());
  map.put("employeeAddress", emp.getEmployeeAddress());
  template.execute(sql, map, new PreparedStatementCallback<Object>() {

    @Override
    public Object doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
        return ps.executeUpdate();
    }
    });*/
}

@Override
public void deleteEmployee(Employee emp) {
/*final String sql = "DELETE FROM employee WHERE employeeId=:employeeId";
Map<String, Object> map = new HashMap<>();
map.put("employeeId", emp.getEmployeeId());
template.execute(sql, map, new PreparedStatementCallback<Object>() {

@Override
public Object doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
return ps.executeUpdate(); */
}

}


