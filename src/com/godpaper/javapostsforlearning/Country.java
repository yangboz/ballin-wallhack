package com.godpaper.javapostsforlearning;

public class Country {
	private String countryName;
	private Capital capital;
	
	public Country(String countryName,Capital capital)
	{
		super();
		this.countryName = countryName;
		this.capital = capital;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	/**
	 * @return the capital
	 */
	public Capital getCapital() {
		return capital;
	}

	/**
	 * @param capital the capital to set
	 */
	public void setCapital(Capital capital) {
		this.capital = capital;
	}
}
