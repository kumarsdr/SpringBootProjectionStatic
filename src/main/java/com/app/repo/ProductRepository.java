package com.app.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.model.Product;

public interface ProductRepository extends JpaRepository<Product,Integer> {


	
	  interface ViewA 
	  { 
		  String getProdCode(); 
		  String getProdModel(); 
	  }
	  
	  interface ViewB 
	  { 
		  Double getProdCost(); 
		  String getProdVendor(); 
	  }
	  
	  List<ViewA> findByProdCost(Double prodCost); 
	 // List<ViewB> findByProCode(String prodCode);
	List<ViewB> findByProdCode(String prodCode);

	 

}
