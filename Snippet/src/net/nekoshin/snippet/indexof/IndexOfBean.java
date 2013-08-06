package net.nekoshin.snippet.indexof;

import java.io.Serializable;

public class IndexOfBean implements Serializable{
	
	/** serialVersionUID. */
	private static final long serialVersionUID = 1L;
	
	private String key;
	private String value1;
	private String value2;
	
	@Override
	public boolean equals(Object o) {
		
		IndexOfBean bean = (IndexOfBean)o;
		String key = bean.key;
		
		if (key == null) {
			return false;
		} else {
			return key.equals(this.key);
		}
		
	}

	@Override
	public int hashCode() {
		return this.key.hashCode();
	}
	
	
	/**
	 * @return the key
	 */
	public String getKey() {
		return key;
	}
	/**
	 * @param key the key to set
	 */
	public void setKey(String key) {
		this.key = key;
	}
	/**
	 * @return the value1
	 */
	public String getValue1() {
		return value1;
	}
	/**
	 * @param value1 the value1 to set
	 */
	public void setValue1(String value1) {
		this.value1 = value1;
	}
	/**
	 * @return the value2
	 */
	public String getValue2() {
		return value2;
	}
	/**
	 * @param value2 the value2 to set
	 */
	public void setValue2(String value2) {
		this.value2 = value2;
	}
}
