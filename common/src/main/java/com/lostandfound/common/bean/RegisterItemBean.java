package com.lostandfound.common.bean;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RegisterItemBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 163350592495047077L;
	private Long id;
	private String itemColor;
	private String publicDescription;
	private String secretDescription;
	private String foundDate;
	private List<ImageBean> images;
	private LocationBean location;
	private ReporterBean reporter;
	private String category;
	private String subCategory;

	

	public RegisterItemBean() {
		super();
		location = new LocationBean();
		setReporter(new ReporterBean());
	}

	public String getBeanString() {
		return this.toString();
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	
	
	/**
	 * @return the itemColor
	 */
	public String getItemColor() {
		return itemColor;
	}

	/**
	 * @param itemColor
	 *            the itemColor to set
	 */
	public void setItemColor(String itemColor) {
		this.itemColor = itemColor;
	}

	/**
	 * @return the secretDescription
	 */
	public String getSecretDescription() {
		return secretDescription;
	}

	/**
	 * @param secretDescription
	 *            the secretDescription to set
	 */
	public void setSecretDescription(String secretDescription) {
		this.secretDescription = secretDescription;
	}

	/**
	 * @return the foundDate
	 */
	public String getFoundDate() {
		return foundDate;
	}

	/**
	 * @param foundDate
	 *            the foundDate to set
	 */
	public void setFoundDate(String foundDate) {
		this.foundDate = foundDate;
	}

		
	/**
	 * @return the location
	 */
	public LocationBean getLocation() {
		return location;
	}

	/**
	 * @param location
	 *            the location to set
	 */
	public void setLocation(LocationBean location) {
		this.location = location;
	}

	/**
	 * @return the publicDescription
	 */
	public String getPublicDescription() {
		return publicDescription;
	}

	/**
	 * @param publicDescription
	 *            the publicDescription to set
	 */
	public void setPublicDescription(String publicDescription) {
		this.publicDescription = publicDescription;
	}

	
	public ReporterBean getReporter() {
		return reporter;
	}

	public void setReporter(ReporterBean reporter) {
		this.reporter = reporter;
	}

	/**
	 * @return the category
	 */
	public String getCategory() {
		return category;
	}

	/**
	 * @param category the category to set
	 */
	public void setCategory(String category) {
		this.category = category;
	}

	/**
	 * @return the subCategory
	 */
	public String getSubCategory() {
		return subCategory;
	}

	/**
	 * @param subCategory the subCategory to set
	 */
	public void setSubCategory(String subCategory) {
		this.subCategory = subCategory;
	}

	public List<ImageBean> getImages() {
		return images;
	}

	public void setImages(List<ImageBean> images) {
		this.images = images;
	}

	@Override
	public String toString() {
		return "RegisterItemBean ["
				+ (id != null ? "id=" + id + ", " : "")
				+ (itemColor != null ? "itemColor=" + itemColor + ", " : "")
				+ (publicDescription != null ? "publicDescription="
						+ publicDescription + ", " : "")
				+ (secretDescription != null ? "secretDescription="
						+ secretDescription + ", " : "")
				+ (foundDate != null ? "foundDate=" + foundDate + ", " : "")
				+ (images != null ? "images=" + images + ", " : "")
				+ (location != null ? "location=" + location + ", " : "")
				+ (reporter != null ? "reporter=" + reporter + ", " : "")
				+ (category != null ? "category=" + category + ", " : "")
				+ (subCategory != null ? "subCategory=" + subCategory : "")
				+ "]";
	}
	
	


}
