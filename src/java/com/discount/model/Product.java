package com.discount.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "product", uniqueConstraints = {
		@UniqueConstraint(columnNames = "id"),
		@UniqueConstraint(columnNames = "name") })
public class Product {

	@Id
	@SequenceGenerator(name = "id_seq", sequenceName = "product_id_seq")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_seq")
	@Column(name = "id", unique = true, nullable = false)
	private Integer id;

	@ManyToOne
	@JoinColumn(name = "clientId")
	private Client client;

	@ManyToOne
	@JoinColumn(name = "productCategoryId")
	private ProductCategory productCategory;

	@Column(name = "name", unique = true, nullable = false, length = 100)
	private String name;

	@Column(name = "longDescription", unique = false, nullable = true, length = 1000)
	private String longDescription;

	@Column(name = "shortDescription", unique = false, nullable = true, length = 100)
	private String shortDescription;

	@Column(name = "initialPrice", unique = false, nullable = true, length = 100)
	private Integer initialPrice;

	@Column(name = "discountPrice", unique = false, nullable = false, length = 100)
	private Integer discountPrice;

	@Column(name = "discount", unique = false, nullable = true, length = 100)
	private Integer discount;

	@Column(name = "beginShowDate", unique = false, nullable = true, length = 100)
	private Date beginShowDate;

	@Column(name = "endShowDate", unique = false, nullable = true, length = 100)
	private Date endShowDate;

	@OneToMany(mappedBy = "product")
	private List<ProductSettings> settings;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLongDescription() {
		return longDescription;
	}

	public void setLongDescription(String longDescription) {
		this.longDescription = longDescription;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	public Integer getInitialPrice() {
		return initialPrice;
	}

	public void setInitialPrice(Integer initialPrice) {
		this.initialPrice = initialPrice;
	}

	public Integer getDiscountPrice() {
		return discountPrice;
	}

	public void setDiscountPrice(Integer discountPrice) {
		this.discountPrice = discountPrice;
	}

	public Integer getDiscount() {
		return discount;
	}

	public void setDiscount(Integer discount) {
		this.discount = discount;
	}

	public Date getBeginShowDate() {
		return beginShowDate;
	}

	public void setBeginShowDate(Date beginShowDate) {
		this.beginShowDate = beginShowDate;
	}

	public Date getEndShowDate() {
		return endShowDate;
	}

	public void setEndShowDate(Date endShowDate) {
		this.endShowDate = endShowDate;
	}

	public List<ProductSettings> getSettings() {
		return settings;
	}

	public void setSettings(List<ProductSettings> settings) {
		this.settings = settings;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public ProductCategory getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(ProductCategory productCategory) {
		this.productCategory = productCategory;
	}

}
