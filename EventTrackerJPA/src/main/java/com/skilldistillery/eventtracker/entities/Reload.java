package com.skilldistillery.eventtracker.entities;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="reload")
public class Reload {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column()
	private String caliber;
	private String bulletBrand;
	private String bulletType;
	private int bulletWeight;
	private String powderBrand;
	private String powderType;
	private int powderWeight;
	private String primerBrand;
	private String primerType;
	private boolean favoriteLoad;
	
	
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
	public String getBulletBrand() {
		return bulletBrand;
	}
	public void setBulletBrand(String bulletBrand) {
		this.bulletBrand = bulletBrand;
	}
	public String getBulletType() {
		return bulletType;
	}
	public void setBulletType(String bulletType) {
		this.bulletType = bulletType;
	}
	public int getBulletWeight() {
		return bulletWeight;
	}
	public void setBulletWeight(int bulletWeight) {
		this.bulletWeight = bulletWeight;
	}
	public String getPowderBrand() {
		return powderBrand;
	}
	public void setPowderBrand(String powderBrand) {
		this.powderBrand = powderBrand;
	}
	public String getPowderType() {
		return powderType;
	}
	public void setPowderType(String powderType) {
		this.powderType = powderType;
	}
	public int getPowderWeight() {
		return powderWeight;
	}
	public void setPowderWeight(int powderWeight) {
		this.powderWeight = powderWeight;
	}
	public String getPrimerBrand() {
		return primerBrand;
	}
	public void setPrimerBrand(String primerBrand) {
		this.primerBrand = primerBrand;
	}
	public String getPrimerType() {
		return primerType;
	}
	public void setPrimerType(String primerType) {
		this.primerType = primerType;
	}
	public boolean isFavoriteLoad() {
		return favoriteLoad;
	}
	public void setFavoriteLoad(boolean favoriteLoad) {
		this.favoriteLoad = favoriteLoad;
	}
	@Override
	public int hashCode() {
		return Objects.hash(bulletBrand, bulletType, bulletWeight, caliber, favoriteLoad, id, powderBrand, powderType,
				powderWeight, primerBrand, primerType);
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
		return Objects.equals(bulletBrand, other.bulletBrand) && Objects.equals(bulletType, other.bulletType)
				&& bulletWeight == other.bulletWeight && Objects.equals(caliber, other.caliber)
				&& favoriteLoad == other.favoriteLoad && id == other.id
				&& Objects.equals(powderBrand, other.powderBrand) && Objects.equals(powderType, other.powderType)
				&& powderWeight == other.powderWeight && Objects.equals(primerBrand, other.primerBrand)
				&& Objects.equals(primerType, other.primerType);
	}
	@Override
	public String toString() {
		return "Reload [id=" + id + ", caliber=" + caliber + ", bulletBrand=" + bulletBrand + ", bulletType="
				+ bulletType + ", bulletWeight=" + bulletWeight + ", powderBrand=" + powderBrand + ", powderType="
				+ powderType + ", powderWeight=" + powderWeight + ", primerBrand=" + primerBrand + ", primerType="
				+ primerType + ", favoriteLoad=" + favoriteLoad + "]";
	}
	public Reload() {
		super();
	
	}
	public Reload(int id, String caliber, String bulletBrand, String bulletType, int bulletWeight, String powderBrand,
			String powderType, int powderWeight, String primerBrand, String primerType, boolean favoriteLoad) {
		super();
		this.id = id;
		this.caliber = caliber;
		this.bulletBrand = bulletBrand;
		this.bulletType = bulletType;
		this.bulletWeight = bulletWeight;
		this.powderBrand = powderBrand;
		this.powderType = powderType;
		this.powderWeight = powderWeight;
		this.primerBrand = primerBrand;
		this.primerType = primerType;
		this.favoriteLoad = favoriteLoad;
	}
	
}
	