package org.entity;

import java.util.Objects;

public class Piscina extends Serviciu {
	private Integer codPiscina;
 private String tipPiscina; //acoperita, decoperita 
 
public Integer getCodPiscina() {
	return codPiscina;
}
public void setCodPiscina(Integer codPiscina) {
	this.codPiscina = codPiscina;
}
public String getTipPiscina() {
	return tipPiscina;
}
public void setTipPiscina(String tipPiscina) {
	this.tipPiscina = tipPiscina;
}
public Piscina(Integer idServiciu, String tipServiciu, String denServiciu, Double pretServiciu, Integer codPiscina,
		String tipPiscina) {
	super(idServiciu, tipServiciu, denServiciu, pretServiciu);
	this.codPiscina = codPiscina;
	this.tipPiscina = tipPiscina;
}
public Piscina(Integer codPiscina, String tipPiscina) {
	super();
	this.codPiscina = codPiscina;
	this.tipPiscina = tipPiscina;
}
public Piscina(Integer idServiciu, String tipServiciu, String denServiciu, Double pretServiciu) {
	super(idServiciu, tipServiciu, denServiciu, pretServiciu);
}
public Piscina() {
	super();
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = super.hashCode();
	result = prime * result + Objects.hash(codPiscina, tipPiscina);
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (!super.equals(obj))
		return false;
	if (getClass() != obj.getClass())
		return false;
	Piscina other = (Piscina) obj;
	return Objects.equals(codPiscina, other.codPiscina) && Objects.equals(tipPiscina, other.tipPiscina);
}
@Override
public String toString() {
	return "Piscina [codPiscina=" + codPiscina + ", tipPiscina=" + tipPiscina + "]";
}
 
 
}
