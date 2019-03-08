/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejempo.upeu.edu.pe.dao;

import ejempo.upeu.edu.pe.dto.Producto;
import java.util.List;

/**
 *
 * @author alum.fial1
 */
public interface ProductoDao {
    public void create(Producto p);
    public void update(int index, Producto p);
    public void delete(int index);
    public Producto read(int index);
    public List<Producto> readAll();    
}
