package org.entity;

import java.util.Date;
import java.util.Objects;

public class Rezervari {
 private Integer codRezervare;
 private Date dataRezervare;
 private String tipRezervare;
public Integer getCodRezervare() {
	return codRezervare;
}
public void setCodRezervare(Integer codRezervare) {
	this.codRezervare = codRezervare;
}
public Date getDataRezervare() {
	return dataRezervare;
}
public void setDataRezervare(Date dataRezervare) {
	this.dataRezervare = dataRezervare;
}
public String getTipRezervare() {
	return tipRezervare;
}
public void setTipRezervare(String tipRezervare) {
	this.tipRezervare = tipRezervare;
}
public Rezervari(Integer codRezervare, Date dataRezervare, String tipRezervare) {
	super();
	this.codRezervare = codRezervare;
	this.dataRezervare = dataRezervare;
	this.tipRezervare = tipRezervare;
}
public Rezervari() {
	super();
}
@Override
public int hashCode() {
	return Objects.hash(codRezervare, dataRezervare, tipRezervare);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Rezervari other = (Rezervari) obj;
	return Objects.equals(codRezervare, other.codRezervare) && Objects.equals(dataRezervare, other.dataRezervare)
			&& Objects.equals(tipRezervare, other.tipRezervare);
}
@Override
public String toString() {
	return "Rezervari [codRezervare=" + codRezervare + ", dataRezervare=" + dataRezervare + ", tipRezervare="
			+ tipRezervare + "]";
}
 
 
}
