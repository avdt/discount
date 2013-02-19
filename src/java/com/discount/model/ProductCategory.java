package java.com.discount.model;

import java.util.List;

public class ProductCategory {

	private Integer id;
	private Integer parrentId;
	private String name;
	private List<String> settings;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getParrentId() {
		return parrentId;
	}

	public void setParrentId(Integer parrentId) {
		this.parrentId = parrentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getSettings() {
		return settings;
	}

	public void setSettings(List<String> settings) {
		this.settings = settings;
	}

}
