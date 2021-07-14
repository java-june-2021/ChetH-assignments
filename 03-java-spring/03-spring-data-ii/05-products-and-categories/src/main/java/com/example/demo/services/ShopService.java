package com.example.demo.services;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.models.Category;
import com.example.demo.models.Product;
import com.example.demo.repositories.CategoryRepository;
import com.example.demo.repositories.ProductRepository;

@Service
public class ShopService {

	// adding the Category and Product repositories as dependencies
	private CategoryRepository categoryRepository;
	private ProductRepository productRepository;

	public ShopService(CategoryRepository categoryRepository, ProductRepository productRepository) {
		this.categoryRepository = categoryRepository;
		this.productRepository = productRepository;
	}
	
	// returns all the categories
	public List<Category> allCategories() {
		return categoryRepository.findAll();
	}
	
	// returns categories not in a product
	public List<Category> categoriesNotInProduct(Product product) {
		// first let's get a list of categories for current product
		List<Long> catIds = new ArrayList<>();
		for(Category category : product.getCategories()) {
			catIds.add(category.getId());
		}
		//If there are no categories in current product then return all categories
		if(product.getCategories().isEmpty()) {
			return categoryRepository.findAll();
		} else {
			//return list of categories not in current product
			return categoryRepository.findByIdNotIn(catIds);
		}		
	}
	
	// creates a category
	public Category createCategory(Category c) {
		return categoryRepository.save(c);
	}
	
	// returns one category
	public Category getOneCategory(Long id) {
		return categoryRepository.findById(id).orElse(null);
	}
	
	// add category to a product
	public void addCategoryToProduct(Long categoryId, Long productId) {
		if(productRepository.findById(productId).isPresent() &&
				categoryRepository.findById(categoryId).isPresent()) {
			productRepository.findById(productId).get().getCategories().add(categoryRepository.findById(categoryId).get());
			productRepository.save(productRepository.findById(productId).get());
		}
	}

	// returns all the products
	public List<Product> allProducts() {
		return productRepository.findAll();
	}
	
	// returns products not in category
	public List<Product> productsNotInCategory(Category category) {
		// first let's get a list of products in current category
		List<Long> prodIds = new ArrayList<>();
		for(Product product : category.getProducts()) {
			prodIds.add(product.getId());
		}
		//If there are no products in current category then return all products
		if(category.getProducts().isEmpty()) {
			return productRepository.findAll();
		} else {
			//return list of products not in current category
			return productRepository.findByIdNotIn(prodIds);
		}		
	}
	
	// creates a product
	public Product createProduct(Product p) {
		return productRepository.save(p);
	}
	
	// returns one product
	public Product getOneProduct(Long id) {
		return productRepository.findById(id).orElse(null);
	}
	
	// add product to a category
	public void addProductToCategory(Long productId, Long categoryId) {
		if(categoryRepository.findById(categoryId).isPresent() &&
				productRepository.findById(productId).isPresent()) {
			categoryRepository.findById(categoryId).get().getProducts().add(productRepository.findById(productId).get());
			categoryRepository.save(categoryRepository.findById(categoryId).get());
		}
	}

}