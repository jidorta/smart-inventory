package com.ibandorta.smartInventory.smartInventory.service;

import com.ibandorta.smartInventory.smartInventory.dto.ProductoDTO;
import com.ibandorta.smartInventory.smartInventory.entity.Producto;
import com.ibandorta.smartInventory.smartInventory.mapper.ProductoMapper;
import com.ibandorta.smartInventory.smartInventory.repository.ProductoRepository;

import java.util.List;

public class ProductoServiceImpl implements  ProductoService{

    private final ProductoRepository productoRepository;

    public ProductoServiceImpl(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }

    @Override
    public List<ProductoDTO> listarProductos() {
        return productoRepository.findAll()
                .stream()
                .map(ProductoMapper::toDTO)
                .toList();
    }

    @Override
    public ProductoDTO crearProducto(ProductoDTO productoDTO) {
        Producto producto = ProductoMapper.toEntity(productoDTO);
        Producto guardado = productoRepository.save(producto);
        return ProductoMapper.toDTO(guardado);
    }

    @Override
    public ProductoDTO obtenerProductoPorId(Long id) {
        Producto producto = productoRepository.findById(id)
                .orElseThrow(()-> new RuntimeException("Producto no encontrado con ID: " + id));
        return ProductoMapper.toDTO(producto);
    }

    @Override
    public ProductoDTO actualizarProducto(Long id, ProductoDTO productoDTO) {
        Producto producto = productoRepository.findById(id)
                .orElseThrow(()->new RuntimeException("Producto no encontrado con ID: " + id));

        producto.setNombre(productoDTO.getNombre());
        producto.setDescripcion(productoDTO.getDescripcion());
        producto.setCantidad(productoDTO.getCantidad());
        producto.setPrecio(productoDTO.getPrecio());
        producto.setCategoria(productoDTO.getCategoria());

        Producto actualizado = productoRepository.save(producto);

        return ProductoMapper.toDTO(actualizado);
    }



    @Override
    public void eliminarProducto(Long id) {
        productoRepository.deleteById(id);
    }
}
