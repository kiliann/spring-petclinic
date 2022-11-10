package org.springframework.samples.petclinic.facturas.DTO;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;
import org.springframework.samples.petclinic.facturas.DAO.Facturas;
import org.springframework.samples.petclinic.owner.DAO.Owner;
import org.springframework.samples.petclinic.owner.DAO.PetType;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface FacturasRepository extends Repository<Facturas, Integer> {

	@Query(value = "SELECT * FROM petclinic2.facturas where payment_date IS NOT NULL", nativeQuery = true)
	@Transactional(readOnly = true)
	List<Facturas> listFacturasPagadas();

	void save(Facturas facturas);

}
