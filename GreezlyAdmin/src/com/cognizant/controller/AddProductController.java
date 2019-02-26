package com.cognizant.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.cognizant.entity.Product;
import com.cognizant.helper.FactoryProductService;
import com.cognizant.service.ProductService;



/**
 * Servlet implementation class AddProductController
 */
@WebServlet("/addProduct")
public class AddProductController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddProductController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		
		String pid = request.getParameter("productId");
		String productName=request.getParameter("productName");
		String productCategory=request.getParameter("productCategory");
		String productCompany = request.getParameter("productCompany");
		String productDescription=request.getParameter("productDescription");
		//Integer productPrice=Integer.parseInt(request.getParameter("productPrice"));
		//Integer productId=Integer.parseInt(request.getParameter("productId"));
		
		String price = request.getParameter("productPrice");
		System.out.println("controller : "+pid);
		System.out.println("controller : "+productName);
		System.out.println("controller : "+price);
		//System.out.println(productId);
		Product product=new Product();
		product.setProductId(pid);
		product.setProductName(productName);
		product.setProductCategory(productCategory);
		product.setProductDescription(productDescription);
		product.setProductPrice(price);
		product.setProductCompany(productCompany);
		
		
		
		ProductService productService=FactoryProductService.createProductService();
		boolean productExists=productService.checkProduct(pid,productCategory);
		PrintWriter out = response.getWriter();
		RequestDispatcher dispatcher=request.getRequestDispatcher("addProduct.jsp");
		if(!productExists){
			
			boolean productAdded=productService.addProduct(product);
			if(productAdded){
				out.println("<script language=\"javascript\">" );
	            out.println("alert('Product added successfully!!! Redirecting to add product page')");
	            out.println("location='addProduct.jsp';");
	            out.println("</script>");
				// request.setAttribute("status","Product Added Successfully");
				//dispatcher.forward(request,response);
			}else{
				//request.setAttribute("status","Product Add Failed");
				//dispatcher.forward(request,response);
				out.println("<script language=\"javascript\">" );
	            out.println("alert('Product Cannot be addedd !!! Redirecting to admin home page')");
	            out.println("location='welcome_admin.jsp';");
	            out.println("</script>");
			}
		}
		
		else{
			
			out.println("<script language=\"javascript\">" );
            out.println("alert('Product Already Exists!!! Cannot be addedd !!! Redirecting to admin home page')");
            out.println("location='welcome_admin.jsp';");
            out.println("</script>");
		}
		
	}

}
