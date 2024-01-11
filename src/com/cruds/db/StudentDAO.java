package com.cruds.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import com.cruds.entity.Student;
import com.cruds.execption.SMSExeception;

public class StudentDAO {
	
	public boolean delete(int rollno)
	{
		String sql = "delete from student where roll_no = ?";
		int rows = 0;
		
		try(Connection conn = DBConnectionManager.getConnection())
		{
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, rollno);
			
			rows = ps.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return rows > 0;
	}
	
	public Vector<Vector<String>> getTableData()
	{
		String sql = "select roll_no,name from student";
		Vector<Vector<String>> data = new Vector<>();
		Vector<String> row = null;
		
		try(Connection conn = DBConnectionManager.getConnection())
		{
			PreparedStatement ps=conn.prepareStatement(sql);
			
			ResultSet rs = ps.executeQuery();
			
			while(rs != null && rs.next())
				
			{
				row = new Vector<>();
				row.add(String.valueOf(rs.getInt(1)));
				row.add(rs.getString(2));
				data.add(row);
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return data;
	}
	public boolean create(Student s) throws SMSExeception
	{
		String sql = "insert into student(roll_no,name) values (? , ?)";
		int rows = 0;
		
		try(Connection conn = DBConnectionManager.getConnection())
		{
			PreparedStatement   ps = conn.prepareStatement(sql);
			ps.setInt(1, s.getRoll_no());
			ps.setString(2, s.getName());
			
			rows = ps.executeUpdate();
			
		} catch (SQLException e) {
			if(e.getMessage().contains("Duplicate"))
			{
				throw new SMSExeception("Roll No already exists ! " + s.getRoll_no());
			}
			else
			{
				throw new SMSExeception("Database error during create " + e.getMessage());

			}
		}
		return rows > 0;
	}

}
