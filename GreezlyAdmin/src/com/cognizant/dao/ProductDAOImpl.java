package com.cognizant.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.cognizant.entity.Product;
import com.cognizant.helper.ConnectionManager;

public class ProductDAOImpl implements ProductDAO{

	private ConnectionManager manager=new ConnectionManager();
	@Override
	public boolean checkProduct(int productId, String productCategory) {
		// TODO Auto-generated method stub
		Connection connection=manager.openConnection();
		boolean result=false;
		try {
			PreparedStatement statement=connection.prepareStatement("select * from product_table where pid=? and category=?");
		    statement.setInt(1, productId);
		    statement.setString(2,productCategory);
		    ResultSet resultSet=statement.executeQuery();
		    if(resultSet.next()){
		    	result=true;
		    }
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		manager.closeConnection();
		
		return result;
	}

	@Override
	public boolean addProduct(Product product) {
		// TODO Auto-generated method stub
		
		Connection connection=manager.openConnection();
		System.out.println("DAO : "+product.getProductId());
		boolean result=false;
		try {
			PreparedStatement preparedStatement=connection.prepareStatement("insert into product_table values(?,?,?,?,?,?)");
			
			preparedStatement.setString(1, product.getProductId());
			preparedStatement.setString(2, product.getProductName());
			preparedStatement.setString(5, product.getProductCompany());
			preparedStatement.setString(6,product.getProductCategory());
			preparedStatement.setString(4, product.getProductPrice());
			preparedStatement.setString(3, product.getProductDescription());
			      
	        
			int rows=preparedStatement.executeUpdate();
			manager.closeConnection();
			if(rows>0)
				result=true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public List<Product> viewProducts() {
		// TODO Auto-generated method stub
		return null;
	}

}
