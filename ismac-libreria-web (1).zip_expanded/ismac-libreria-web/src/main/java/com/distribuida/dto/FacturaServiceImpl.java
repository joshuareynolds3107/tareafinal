package com.distribuida.dto;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.distribuida.dao.ClienteDAO;
import com.distribuida.dao.FacturaDAO;
import com.distribuida.entities.Cliente;
import com.distribuida.entities.Factura;

@Service
public class FacturaServiceImpl implements FacturaService {
	
	@Autowired
	
	private FacturaDAO facturaDAO;
	@Autowired
	private ClienteDAO clienteDAO;

	public List<Factura> findAll() {
		// TODO Auto-generated method stub
		return facturaDAO.findAll();
	}

	public Factura findOne(int id) {
		// TODO Auto-generated method stub
		return facturaDAO.findOne(id);
	}

	public void add(Factura factura) {
		// TODO Auto-generated method stub
		
		facturaDAO.add(factura);

	}

	public void up(Factura factura) {
		// TODO Auto-generated method stub
		
		facturaDAO.up(factura);

	}

	public void del(int id) {
		// TODO Auto-generated method stub
		
		facturaDAO.del(id);

	}

	public List<Factura> findAll(String busqueda) {
		// TODO Auto-generated method stub
		return facturaDAO.findAll(busqueda);
	}

	public void add(int idFactura, String numFactura, Date fecha, Double totalNeto, Double iva, Double total, int idCliente) {
		// TODO Auto-generated method stub
		
		Cliente cliente = clienteDAO.findOne(idCliente);
		Factura factura = new Factura( idFactura,  numFactura,  fecha,  totalNeto,  iva,  total);
		factura.setCliente(cliente);
		facturaDAO.add(factura);
		
	}

	public void up(int idFactura, String numFactura, Date fecha, Double totalNeto, Double iva, Double total, int idCliente) {
		// TODO Auto-generated method stub
		
		Cliente cliente = clienteDAO.findOne(idCliente);
		Factura factura = new Factura( idFactura,  numFactura,  fecha,  totalNeto,  iva,  total);
		factura.setCliente(cliente);
		facturaDAO.up(factura);
	}

	public void add(int idFactura, String numFactura, Date fecha, Double totalNeto, Double iva, Double total) {
		// TODO Auto-generated method stub
		
	}

	public void up(int idFactura, String numFactura, Date fecha, Double totalNeto, Double iva, Double total) {
		// TODO Auto-generated method stub
		
	}

}
