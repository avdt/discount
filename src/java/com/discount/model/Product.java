package java.com.discount.model;

import java.util.Date;

public class Product {

	private Integer id;
	private Integer clientId;
	private String name;
	private String longDescription;
	private String shortDescription;
	private Integer initialPrice;
	private Integer discountPrice;
	private Integer discount;
	private Date beginShowDate;
	private Date endShowDate;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getClientId() {
		return clientId;
	}

	public void setClientId(Integer clientId) {
		this.clientId = clientId;
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

}
