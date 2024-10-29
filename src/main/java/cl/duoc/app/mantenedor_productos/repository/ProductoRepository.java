package cl.duoc.app.mantenedor_productos.repository;

import cl.duoc.app.mantenedor_productos.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
}
