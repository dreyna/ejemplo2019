/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejempo.upeu.edu.pe.daoImp;

import ejempo.upeu.edu.pe.dao.ProductoDao;
import ejempo.upeu.edu.pe.dto.Producto;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alum.fial1
 */
public class ProductoDaoImp implements ProductoDao{
    private List<Producto> lista = new ArrayList<>();
       
    @Override
    public void create(Producto p) {
        lista.add(p);        
    }

    @Override
    public void update(int index, Producto p) {
        lista.set(index, p);       
    }

    @Override
    public void delete(int index) {
        lista.remove(index);       
    }

    @Override
    public Producto read(int index) {
        Producto b = new Producto();
        for(int i=0;i<lista.size();i++){
            if(i==index){
                b= lista.get(i);
            }
        }
        return b;
    }

    @Override
    public List<Producto> readAll() {
        return lista;        
    }
    
}
