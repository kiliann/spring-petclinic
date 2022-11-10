package org.springframework.samples.petclinic.facturas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.samples.petclinic.facturas.DAO.Facturas;
import org.springframework.samples.petclinic.facturas.servicio.FacturasService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping(value = "veterinario")
public class FacturasController {

	@Autowired
	private final FacturasService facturasservicio;

	public FacturasController(FacturasService facturasservicio) {
		this.facturasservicio = facturasservicio;
	}


	@GetMapping("/facturas/pagadas")

	public List<Facturas> facturaPagada() {

		return facturasservicio.listFacturasPagadas();
	}

	@GetMapping("/facturas/test")
	public String facturatest() {

		return "todas estan pagadas";
	}
}
