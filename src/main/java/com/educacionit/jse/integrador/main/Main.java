package com.educacionit.jse.integrador.main;

import com.educacionit.jse.integrador.entidades.Cliente;
import com.educacionit.jse.integrador.entidades.Domicilio;
import com.educacionit.jse.integrador.entidades.Producto;
import com.educacionit.jse.integrador.entidades.Telefono;
import com.educacionit.jse.integrador.baseDeDatos.ProductoDAO;
import com.educacionit.jse.integrador.excepciones.CafeStoreException;
import com.educacionit.jse.integrador.excepciones.NegocioException;

public class Main {

	public static void main(String[] args) throws NegocioException, CafeStoreException {
		
		
//		Producto producto = new Producto(5.00,"Donas");
//		ProductoDAO.inserta(producto);
//		System.out.println(producto);
//		
                Producto torta= new Producto();
                torta = ProductoDAO.getProducto("Torta");
                ProductoDAO.elimina(torta.getId());
                

	}

}
