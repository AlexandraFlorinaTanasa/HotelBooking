package org.entity;

import java.util.Objects;

public class LinieFactura {
private Integer idLinie;
	
	Serviciu serviciu;
	Double perSedere;// perioada de sedere   (in zile)
	
	Factura factura;
	private Double TVALinie;
	private Double valoareLinie;
	
	
	//Proprietati	
	public Integer getIdLinie() {
		return idLinie;
	}
	public void setIdLinie(Integer idLinie) {
		this.idLinie = idLinie;
	}
	public Serviciu getServiciu() {
		return serviciu;
	}
	public void setServiciu(Serviciu serviciu) {
		this.serviciu = serviciu;
		
	}
	public Double getPerSedere() {
		return perSedere;
	}
	public void setPerSedere(Double perSedere) {
		this.perSedere = perSedere;
	}
	public Factura getFactura() {
		return factura;
	}
	public void setFactura(Factura factura) {
		this.factura = factura;
	}
	
	public Double getTVALinie() {
		if(TVALinie==null || TVALinie==0) TVALinie=calcTVALinie();
		return TVALinie;
	}
	public Double getValoareLinie() {
		if(valoareLinie==null || valoareLinie==0.0) valoareLinie=calcValLinie();
		return valoareLinie;
	}
	Double calcValLinie() {
		Double val=null;
		if(serviciu!=null && perSedere!=null)
			val=serviciu.getPretServiciu()*perSedere;
		return val;
	}
	Double calcTVALinie() {
		Double valTVA=null;
		if(serviciu!=null && perSedere!=null)
			valTVA=0.19/1.19*(serviciu.getPretServiciu()*perSedere);
		return valTVA;
	}
	
	
	//Constructori
	
	public LinieFactura(Integer idLinie, Serviciu serviciu, Double perSedere, Factura factura, Double tVALinie,
			Double valoareLinie) {
		super();
		this.idLinie = idLinie;
		this.serviciu = serviciu;
		this.perSedere = perSedere;
		this.factura = factura;
		TVALinie = tVALinie;
		this.valoareLinie = valoareLinie;
	}
	
	
	public LinieFactura() {
		super();
	}
	@Override
	public int hashCode() {
		return Objects.hash(TVALinie, factura, idLinie, perSedere, serviciu, valoareLinie);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LinieFactura other = (LinieFactura) obj;
		return Objects.equals(TVALinie, other.TVALinie) && Objects.equals(factura, other.factura)
				&& Objects.equals(idLinie, other.idLinie) && Objects.equals(perSedere, other.perSedere)
				&& Objects.equals(serviciu, other.serviciu) && Objects.equals(valoareLinie, other.valoareLinie);
	}
	@Override
	public String toString() {
		return "LinieFactura [idLinie=" + idLinie + ", serviciu=" + serviciu + ", perSedere=" + perSedere + ", factura="
				+ factura + ", TVALinie=" + TVALinie + ", valoareLinie=" + valoareLinie + "]";
	}
	public void add(LinieFactura linieFactura) {
		// TODO Auto-generated method stub
		linieFactura.add(linieFactura);
	}
	
	
	
	
	

	
	
	
	
	
}


