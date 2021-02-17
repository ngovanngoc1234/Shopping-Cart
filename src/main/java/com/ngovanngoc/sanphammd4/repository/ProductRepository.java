package com.ngovanngoc.sanphammd4.repository;

import com.ngovanngoc.sanphammd4.enttity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
    Product findBySuk(String sku);

}
