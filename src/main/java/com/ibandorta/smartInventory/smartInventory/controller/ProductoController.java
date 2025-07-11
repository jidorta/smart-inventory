package com.ibandorta.smartInventory.smartInventory.controller;

import com.ibandorta.smartInventory.smartInventory.dto.ProductoDTO;
import com.ibandorta.smartInventory.smartInventory.entity.Producto;
import com.ibandorta.smartInventory.smartInventory.mapper.ProductoMapper;
import com.ibandorta.smartInventory.smartInventory.repository.ProductoRepository;
import com.ibandorta.smartInventory.smartInventory.service.ProductoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/productos")
public class ProductoController {

    private final ProductoService productoService;

    public ProductoController(ProductoService productoService) {
        this.productoService = productoService;
    }


    @GetMapping
    public List<ProductoDTO> listarProductos(){
        return productoService.listarProductos();

    }

    @PostMapping
    public ProductoDTO crearProducto(@RequestBody ProductoDTO productoDTO){
       return productoService.crearProducto(productoDTO);
    }

    @GetMapping("/{id}")
    public ProductoDTO obtenerProductoPorId(@PathVariable Long id){
        return productoService.obtenerProductoPorId(id);
    }

    @PutMapping("/{id}")
    public ProductoDTO actualizarProducto(@PathVariable Long id, @RequestBody ProductoDTO productoDTO) {
        return productoService.actualizarProducto(id,productoDTO);
    }

    @DeleteMapping("/{id}")
    public void eliminarProducto(@PathVariable Long id){
            productoService.eliminarProducto(id);
        }
}

