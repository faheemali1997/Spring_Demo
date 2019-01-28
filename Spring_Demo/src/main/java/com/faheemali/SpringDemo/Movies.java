package com.faheemali.SpringDemo;

public class Movies {
	
	private String movie_name;
	
	Movies()
	{
		System.out.println("From Constructor");
	}

	public String getMovie_name() {
		return movie_name;
	}

	public void setMovie_name(String movie_name) {
		this.movie_name = movie_name;
	}
	
	
}
