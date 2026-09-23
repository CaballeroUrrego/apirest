package com.caballerocode.apirest.apirest.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.caballerocode.apirest.apirest.Repositories.ProductoRepository;

import com.caballerocode.apirest.apirest.Entities.Producto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/Productos")
public class ProductoController {

  @Autowired
  private ProductoRepository repositorioProducto;

  // Obtener todos los productos.
  @GetMapping
  public List<Producto> obtenerTodosLosProductos() {
    return repositorioProducto.findAll();
  }

  // Obtener un producto por su identificador.
  @GetMapping("/{id}")
  public Producto obtenerProductoPorId(@PathVariable Long id) {
    return repositorioProducto.findById(id)
        .orElseThrow(() -> new RuntimeException("No se encontro el producto con el ID: " + id));
  }

  // Crear y guardar un producto nuevo.
  @PostMapping
  public Producto crearProducto(@RequestBody Producto producto) {
    return repositorioProducto.save(producto);
  }

  // Actualizar el nombre y el precio de un producto existente.
  @PutMapping("/{id}")
  public Producto actualizarProducto(
      @PathVariable Long id,
      @RequestBody Producto detallesProducto) {
    Producto producto = repositorioProducto.findById(id)
        .orElseThrow();

    producto.setNombre(detallesProducto.getNombre());
    producto.setPrecio(detallesProducto.getPrecio());

    return repositorioProducto.save(producto);
  }

  // Eliminar un producto por su identificador.
  @DeleteMapping("/{id}")
  public String borrarProducto(@PathVariable Long id) {
    Producto producto = repositorioProducto.findById(id)
        .orElseThrow(() -> new RuntimeException("No se encontro el producto con el ID: " + id));

    repositorioProducto.delete(producto);
    return "El producto con el ID: " + id + " fue eliminado correctamente";
  }

}
