package com.example.demo.controllers;
import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.models.Category;
import com.example.demo.models.Product;
import com.example.demo.services.ShopService;

@Controller
public class HomeController {
	private final ShopService shopService;
	
	public HomeController(ShopService shopService) {
		this.shopService = shopService;
	}

	@RequestMapping("/")
	public String index() {
		return "redirect:/categories/new";
	}
	
	@RequestMapping("/categories/{index}")
	public String findCategoryByIndex(Model model, @PathVariable("index") Long index) {
		// make sure index or category id is valid
		if(shopService.getOneCategory(index) == null) {
			return "redirect:/categories/new";
		}
		Category showCategory = shopService.getOneCategory(index);
		List<Product> showProduct = shopService.productsNotInCategory(showCategory);
		model.addAttribute("category", showCategory);
		model.addAttribute("products", showProduct);
		return "/showcategory.jsp";
	}
	
	@PostMapping("/categories/{index}")
	public String addProdToCategory(@PathVariable("index") Long categoryId,
			@RequestParam(value="product") String prodIdString) {
		shopService.addProductToCategory(Long.valueOf(prodIdString), categoryId);
		return "redirect:/categories/{index}";
	}
	
	
	
	@RequestMapping("/categories/new")
	public String newCategory(@ModelAttribute("newCategory") Category category) {
		return "/newcategory.jsp";
	}

	@RequestMapping(value="/categories/new", method=RequestMethod.POST)
	public String addCategory(@Valid @ModelAttribute("newProduct") Category category, BindingResult result) {
		if (result.hasErrors()) {
			return "/newcategory.jsp";
		} else {
			shopService.createCategory(category);
    		return "redirect:/";
		}
	}
	
	@ModelAttribute("categoryList")
	public List<Category> getCategoryList() {
		List<Category> categoryList = shopService.allCategories();
		return categoryList;
	}
	
	@RequestMapping("/products/new")
	public String newProduct(@ModelAttribute("newProduct") Product product) {
		return "/newproduct.jsp";
	}

	@RequestMapping(value="/products/new", method=RequestMethod.POST)
	public String addProduct(@Valid @ModelAttribute("newProduct") Product product, BindingResult result) {
		if (result.hasErrors()) {
			return "/newproduct.jsp";
		} else {
			shopService.createProduct(product);
    		return "redirect:/products/new";
		}
	}
	
	@RequestMapping("/products/{index}")
	public String findProductByIndex(Model model, @PathVariable("index") Long index) {
		// make sure index or product id is valid
		if(shopService.getOneProduct(index) == null) {
			return "redirect:/products/new";
		}
		Product showProduct = shopService.getOneProduct(index);
		List<Category> showCategory = shopService.categoriesNotInProduct(showProduct);
		model.addAttribute("product", showProduct);
		model.addAttribute("categories", showCategory);
		return "/showproduct.jsp";
	}
	
	@PostMapping("/products/{index}")
	public String addCategoryToProd(@PathVariable("index") Long productId,
			@RequestParam(value="category") String categoryIdString) {
		shopService.addCategoryToProduct(Long.valueOf(categoryIdString), productId);
		return "redirect:/products/{index}";
	}
}