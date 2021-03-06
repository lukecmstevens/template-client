package uk.co.lukestevens.api.models;

/**
 * The model for the api client and service
 * 
 * @author Luke Stevens
 */
public class Example {

	private int id;
	private String value;
	private boolean enabled;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public boolean isEnabled() {
		return enabled;
	}
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
	
	
}
