package com.skilldistillery.eventtracker.entities;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Reload {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String caliber;
	private String bulletbrand;
	private String bullettype;
	private int bulletweight;
	private String brand;
	private int weight;
	private String primerbrand;
	private String primertype;
	private boolean favoriteload;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCaliber() {
		return caliber;
	}
	public void setCaliber(String caliber) {
		this.caliber = caliber;
	}
	public String getBulletbrand() {
		return bulletbrand;
	}
	public void setBulletbrand(String bulletbrand) {
		this.bulletbrand = bulletbrand;
	}
	public String getBullettype() {
		return bullettype;
	}
	public void setBullettype(String bullettype) {
		this.bullettype = bullettype;
	}
	public int getBulletweight() {
		return bulletweight;
	}
	public void setBulletweight(int bulletweight) {
		this.bulletweight = bulletweight;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public String getPrimerbrand() {
		return primerbrand;
	}
	public void setPrimerbrand(String primerbrand) {
		this.primerbrand = primerbrand;
	}
	public String getPrimertype() {
		return primertype;
	}
	public void setPrimertype(String primertype) {
		this.primertype = primertype;
	}
	public boolean isFavoriteload() {
		return favoriteload;
	}
	public void setFavoriteload(boolean favoriteload) {
		this.favoriteload = favoriteload;
	}
	
	public Reload() {
		super();
	
	}
	@Override
	public int hashCode() {
		return Objects.hash(brand, bulletbrand, bullettype, bulletweight, caliber, favoriteload, id, primerbrand,
				primertype, weight);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Reload other = (Reload) obj;
		return Objects.equals(brand, other.brand) && Objects.equals(bulletbrand, other.bulletbrand)
				&& Objects.equals(bullettype, other.bullettype) && bulletweight == other.bulletweight
				&& Objects.equals(caliber, other.caliber) && favoriteload == other.favoriteload && id == other.id
				&& Objects.equals(primerbrand, other.primerbrand) && Objects.equals(primertype, other.primertype)
				&& weight == other.weight;
	}
	@Override
	public String toString() {
		return "Reload [id=" + id + ", caliber=" + caliber + ", bulletbrand=" + bulletbrand + ", bullettype="
				+ bullettype + ", bulletweight=" + bulletweight + ", brand=" + brand + ", weight=" + weight
				+ ", primerbrand=" + primerbrand + ", primertype=" + primertype + ", favoriteload=" + favoriteload
				+ "]";
	}


}
