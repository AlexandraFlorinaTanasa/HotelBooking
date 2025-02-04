package org.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class Factura {

	
private Integer nrFactura;
	
	private Date dataFactura=new Date();
	
	private List<LinieFactura> linieFactura=new ArrayList<LinieFactura>();
	
	private Client client;
	
	
	
	private Double totalFactura;
	private Double totalTVA;
	
	//Proprietati
	public Integer getNrFactura() {
		return nrFactura;
	}
	public void setNrFactura(Integer nrFactura) {
		this.nrFactura = nrFactura;
	}
	public Date getDataFactura() {
		return dataFactura;
	}
	public void setDataFactura(Date dataFactura) {
		this.dataFactura = dataFactura;
	}
	public List<LinieFactura> getLinieFactura() {
		return linieFactura;
	}
	public void setLinieFactura(List<LinieFactura> linieFactura) {
		this.linieFactura = linieFactura;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public Double getTotalFactura() {
		if(linieFactura.isEmpty()) return null;
		//return totalFactura;
		Double totalFactura=0.0;
		for(LinieFactura lf:linieFactura)
			totalFactura+=lf.getValoareLinie();
		return totalFactura;
	}
	Double calcValFactura() {
		Double totalFactura=.0;
		for(LinieFactura lf:linieFactura) totalFactura +=lf.getValoareLinie();
		return totalFactura;
	}
	public Double getTotalTVA() {
		if(linieFactura.isEmpty())return null;
		Double totalFactura=calcValFactura();
		return 0.19/1.19*totalFactura;
	}
	
	//Constructori
	public Factura() {}
	public Factura(Integer nrFactura, Date dataFactura) {
		super();
		this.nrFactura = nrFactura;
		this.dataFactura = dataFactura;
	}
	
	
	
	public Factura(Integer nrFactura, Date dataFactura, Client client) {
		super();
		this.nrFactura = nrFactura;
		this.dataFactura = dataFactura;
		this.client = client;
	}
	public Factura(Integer nrFactura, Date dataFactura, List<LinieFactura> linieFactura, Client client) {
		super();
		this.nrFactura = nrFactura;
		this.dataFactura = dataFactura;
		this.linieFactura = linieFactura;
		this.client = client;
	}
	
	
	public Factura(Integer nrFactura, Date dataFactura, List<LinieFactura> linieFactura, Client client,
			Double totalFactura, Double totalTVA) {
		super();
		this.nrFactura = nrFactura;
		this.dataFactura = dataFactura;
		this.linieFactura = linieFactura;
		this.client = client;
		this.totalFactura = totalFactura;
		this.totalTVA = totalTVA;
	}
	//Criteriu de egalitate
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Factura other = (Factura) obj;
		if (nrFactura == null) {
			if (other.nrFactura != null)
				return false;
		} else if (!nrFactura.equals(other.nrFactura))
			return false;
		return true;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nrFactura == null) ? 0 : nrFactura.hashCode());
		return result;
	}
	
	//Operatii specifice logicii modelului afacerii
	public void adaugaLinie (LinieFactura linieFactura) {
		linieFactura.add(linieFactura);
	}
	public void adauga(Serviciu serviciu, Double perSedere) {
		LinieFactura lf=new LinieFactura();
		lf.setFactura(this);
		lf.setServiciu(serviciu);
		lf.setPerSedere(perSedere);
		this.linieFactura.add(lf);
	}
	
	public Boolean verificaServiciu (Serviciu serviciu) {
		return null;
	}
	@Override
	public String toString() {
		return "Factura [Numar Factura=" + nrFactura + ", dataFactura=" + dataFactura + ", client=" + client
				+ ", valoare totala=" + getTotalFactura() + ", valoare TVA totala=" + getTotalTVA() + "]";
	}
	
	
	
	
	
}