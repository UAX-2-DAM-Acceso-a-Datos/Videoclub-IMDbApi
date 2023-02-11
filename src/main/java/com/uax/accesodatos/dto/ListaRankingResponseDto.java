package com.uax.accesodatos.dto;

import java.util.ArrayList;

public class ListaRankingResponseDto {
	public String searchType;
	public String expression;
	public ArrayList<RankingResponseDto> listaRanking;
	public String errorMessage;

	public String getSearchType() {
		return searchType;
	}

	public void setSearchType(String searchType) {
		this.searchType = searchType;
	}

	public String getExpression() {
		return expression;
	}

	public void setExpression(String expression) {
		this.expression = expression;
	}

	public ArrayList<RankingResponseDto> getListaRanking() {
		return listaRanking;
	}

	public void setListaRanking(ArrayList<RankingResponseDto> listaRanking) {
		this.listaRanking = listaRanking;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

}
