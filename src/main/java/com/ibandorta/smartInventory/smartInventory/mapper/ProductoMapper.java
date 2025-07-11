package com.ibandorta.smartInventory.smartInventory.mapper;

import com.ibandorta.smartInventory.smartInventory.dto.ProductoDTO;
import com.ibandorta.smartInventory.smartInventory.entity.Producto;

public class ProductoMapper {

    public static ProductoDTO toDTO(Producto producto){
        ProductoDTO dto = new ProductoDTO();
        dto.setId(producto.getId());
        dto.setNombre(producto.getNombre());
        dto.setDescripcion(producto.getDescripcion());
        dto.setCantidad(producto.getCantidad());
        dto.setPrecio(producto.getPrecio());
        dto.setCategoria(producto.getCategoria());
        return dto;
    }

    public static Producto toEntity(ProductoDTO dto){
        Producto producto = new Producto();
        producto.setId(dto.getId());
        producto.setNombre(dto.getNombre());
        producto.setDescripcion(dto.getDescripcion());
        producto.setCantidad(dto.getCantidad());
        producto.setCantidad(dto.getCantidad());
        producto.setCategoria(dto.getCategoria());
        return producto;
    }
}
