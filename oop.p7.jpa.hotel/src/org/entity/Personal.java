package org.entity;

import java.util.Date;
import java.util.Objects;

public class Personal {
 private Integer id;
 private String nume;
 private Date dataNasterii;
 private Integer cnp;
 private String adresa;
 private String email;
 private Integer telefon;
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getNume() {
	return nume;
}
public void setNume(String nume) {
	this.nume = nume;
}
public Date getDataNasterii() {
	return dataNasterii;
}
public void setDataNasterii(Date dataNasterii) {
	this.dataNasterii = dataNasterii;
}
public Integer getCnp() {
	return cnp;
}
public void setCnp(Integer cnp) {
	this.cnp = cnp;
}

public String getAdresa() {
	return adresa;
}
public void setAdresa(String adresa) {
	this.adresa = adresa;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public Integer getTelefon() {
	return telefon;
}
public void setTelefon(Integer telefon) {
	this.telefon = telefon;
}
public Personal(Integer id, String nume, Date dataNasterii, Integer cnp, String adresa,
		String email, Integer telefon) {
	super();
	this.id = id;
	this.nume = nume;
	this.dataNasterii = dataNasterii;
	this.cnp = cnp;
	this.adresa = adresa;
	this.email = email;
	this.telefon = telefon;
}
public Personal() {
	super();
}
@Override
public int hashCode() {
	return Objects.hash(adresa, cnp, dataNasterii, email, id, nume, telefon);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Personal other = (Personal) obj;
	return Objects.equals(adresa, other.adresa) && Objects.equals(cnp, other.cnp)
			&& Objects.equals(dataNasterii, other.dataNasterii) && Objects.equals(email, other.email)
			&& Objects.equals(id, other.id) && Objects.equals(nume, other.nume)
			&& Objects.equals(telefon, other.telefon);
}
@Override
public String toString() {
	return "Personal [id=" + id + ", nume=" + nume + ", dataNasterii=" + dataNasterii + ", cnp=" + cnp + ", adresa="
			+ adresa + ", email=" + email + ", telefon=" + telefon + "]";
}



}
