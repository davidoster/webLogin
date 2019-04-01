/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import database.Database;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.Product;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

/**
 *
 * @author George.Pasparakis
 */
public class ProductController extends AbstractController {
    
    public ProductController() {
    }
    
    @Override
    protected ModelAndView handleRequestInternal(
            HttpServletRequest request,
            HttpServletResponse response) throws Exception {
        return new ModelAndView("products", "products", returnAllProducts());
    }
    
    private List<Product> returnAllProducts() throws SQLException {
        String server = "ra1.anystream.eu:1011";
        String username = "example_user";
        String password = "example_password";
        String database = "example_database";
        String query = "SELECT * FROM `example_database`.`products`;";
        List<Product> products = new ArrayList<>();
        Database db = new Database();
        
        ResultSet rs = db.Database(server, database, username, password, query);
        while(rs.next()) {
            products.add(new Product(rs.getInt(1), rs.getString(2), rs.getFloat(3)));
        }
        return products;
    }
}
