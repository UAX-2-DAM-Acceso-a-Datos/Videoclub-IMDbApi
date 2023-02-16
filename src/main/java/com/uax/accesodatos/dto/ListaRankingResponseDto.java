package com.uax.accesodatos.dto;

import java.util.ArrayList;

public class ListaRankingResponseDto{
    public ArrayList<RankingResponseDto> items;
    public String errorMessage;
	public ArrayList<RankingResponseDto> getItems() {
		return items;
	}
	public void setItems(ArrayList<RankingResponseDto> items) {
		this.items = items;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
    
}

