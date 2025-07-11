package com.ibandorta.smartInventory.smartInventory.repository;

import com.ibandorta.smartInventory.smartInventory.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
}
