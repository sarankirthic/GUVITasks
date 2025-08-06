package com.sarankirthic.task10.service;

import com.sarankirthic.task10.entity.Product;
import com.sarankirthic.task10.repository.ProductRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public void saveProduct(Product product) {
        this.productRepository.save(product);
    }

    public List<Product> getAllProducts() {
        return this.productRepository.findAll();
    }

    public List<Product> getProductsByCategory(String category) {
        return this.productRepository.findByCategory(category);
    }
}
