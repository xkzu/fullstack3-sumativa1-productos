package cl.duoc.app.mantenedor_productos.service;

import cl.duoc.app.mantenedor_productos.model.Producto;

import java.util.List;
import java.util.Optional;

public interface ProductoService {

    List<Producto> findAll();

    Optional<Producto> findById(Long id);

    Producto save(Producto usuario);

    void delete(Long id);
}
