package org.entity;

import java.util.Objects;

public class RoomService extends Serviciu {
	private Integer  codRoomService;
 private String tipRoomService;
public Integer getCodRoomService() {
	return codRoomService;
}
public void setCodRoomService(Integer codRoomService) {
	this.codRoomService = codRoomService;
}
public String getTipRoomService() {
	return tipRoomService;
}
public void setTipRoomService(String tipRoomService) {
	this.tipRoomService = tipRoomService;
}
public RoomService(Integer idServiciu, String tipServiciu, String denServiciu, Double pretServiciu,
		Integer codRoomService, String tipRoomService) {
	super(idServiciu, tipServiciu, denServiciu, pretServiciu);
	this.codRoomService = codRoomService;
	this.tipRoomService = tipRoomService;
}
public RoomService(Integer codRoomService, String tipRoomService) {
	super();
	this.codRoomService = codRoomService;
	this.tipRoomService = tipRoomService;
}
public RoomService(Integer idServiciu, String tipServiciu, String denServiciu, Double pretServiciu) {
	super(idServiciu, tipServiciu, denServiciu, pretServiciu);
}
public RoomService() {
	super();
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = super.hashCode();
	result = prime * result + Objects.hash(codRoomService, tipRoomService);
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
	RoomService other = (RoomService) obj;
	return Objects.equals(codRoomService, other.codRoomService) && Objects.equals(tipRoomService, other.tipRoomService);
}
@Override
public String toString() {
	return "RoomService [codRoomService=" + codRoomService + ", tipRoomService=" + tipRoomService + "]";
}
 
 
}
