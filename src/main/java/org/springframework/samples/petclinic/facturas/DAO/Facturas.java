package org.springframework.samples.petclinic.facturas.DAO;

import com.sun.java_cup.internal.runtime.virtual_parse_stack;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.samples.petclinic.owner.DAO.Visit;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import java.time.LocalDate;

@Entity
@Table(name = "facturas")
public class Facturas  {

	public Facturas(Integer id_number, Double money, LocalDate date) {
		this.id_number = id_number;
		this.money = money;
		this.date = date;
	}
	public Facturas(){

	}

	@Column(name = "id")
	@Id
	@NotEmpty
	private Integer id;
	@Column(name = "id_number")
	@NotEmpty
	private Integer id_number;

	@Column(name = "money")
	@NotEmpty
	private Double money;

	@Column(name = "payment_date")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate date;

	public Integer getId_number() {
		return id_number;
	}

	public void setId_number(Integer id_number) {
		this.id_number = id_number;
	}

	public Double getMoney() {
		return money;
	}

	public void setMoney(Double money) {
		this.money = money;
	}
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

}
