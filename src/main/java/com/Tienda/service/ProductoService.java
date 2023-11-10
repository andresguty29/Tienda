
package com.Tienda.service;

import com.Tienda.domain.Producto;
import java.util.List;


public interface ProductoService {
    
    // Retorna una lista de productos activas o todas
    public List<Producto> getProductos(boolean activos);
    // Retorna un producto por id
    public Producto getProducto(Producto producto);
    
    // Se inserta un nuevo registro si el ID de la producto esta vacio
    // Se actualiza el registro si el Id de la producto no esta vacio
    public void save (Producto producto);
    
    public void delete (Producto producto);
}
