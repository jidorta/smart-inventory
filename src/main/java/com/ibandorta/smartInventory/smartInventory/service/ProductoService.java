package com.ibandorta.smartInventory.smartInventory.service;

import com.ibandorta.smartInventory.smartInventory.dto.ProductoDTO;

import java.util.List;

public interface ProductoService {

    List<ProductoDTO>listarProductos();
    ProductoDTO crearProducto(ProductoDTO productoDTO);
    ProductoDTO obtenerProductoPorId(Long id);
    ProductoDTO actualizarProducto(Long id, ProductoDTO productoDTO);
    void eliminarProducto(Long id);

}
