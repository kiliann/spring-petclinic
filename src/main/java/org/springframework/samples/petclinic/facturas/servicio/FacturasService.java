package org.springframework.samples.petclinic.facturas.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.samples.petclinic.facturas.DAO.Facturas;
import org.springframework.samples.petclinic.facturas.DTO.FacturasRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FacturasService {

	@Autowired
	private FacturasRepository facturasRepository;

	public void save(Facturas facturas) {
		this.facturasRepository.save(facturas);
	}

	public List<Facturas> listFacturasPagadas(){
		List<Facturas> listFacturasPagadas = facturasRepository.listFacturasPagadas();
		return listFacturasPagadas;
	}
}
