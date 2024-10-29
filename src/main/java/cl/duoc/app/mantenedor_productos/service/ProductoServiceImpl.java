package cl.duoc.app.mantenedor_productos.service;

import cl.duoc.app.mantenedor_productos.model.Producto;
import cl.duoc.app.mantenedor_productos.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductoServiceImpl implements ProductoService {

    final ProductoRepository repository;

    @Autowired
    public ProductoServiceImpl(ProductoRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Producto> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<Producto> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public Producto save(Producto usuario) {
        return repository.save(usuario);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
