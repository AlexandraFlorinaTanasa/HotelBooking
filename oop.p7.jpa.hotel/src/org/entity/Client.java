package org.entity;


import java.util.Objects;

public class Client {
private Integer id;
private String nume;
private Integer varsta;
private String oras;
private String adresa;
private String email;
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
public Integer getVarsta() {
	return varsta;
}
public void setVarsta(Integer varsta) {
	this.varsta = varsta;
}
public String getOras() {
	return oras;
}
public void setOras(String oras) {
	this.oras = oras;
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
public Client(Integer id, String nume, Integer varsta, String oras, String adresa, String email) {
	super();
	this.id = id;
	this.nume = nume;
	this.varsta = varsta;
	this.oras = oras;
	this.adresa = adresa;
	this.email = email;
}
public Client() {
	super();
}
@Override
public int hashCode() {
	return Objects.hash(adresa, email, id, nume, oras, varsta);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Client other = (Client) obj;
	return Objects.equals(adresa, other.adresa) && Objects.equals(email, other.email) && Objects.equals(id, other.id)
			&& Objects.equals(nume, other.nume) && Objects.equals(oras, other.oras)
			&& Objects.equals(varsta, other.varsta);
}
@Override
public String toString() {
	return "Client [id=" + id + ", nume=" + nume + ", varsta=" + varsta + ", oras=" + oras + ", adresa=" + adresa
			+ ", email=" + email + "]";
}



}