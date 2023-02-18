package com.uax.accesodatos.dto;

import java.util.ArrayList;

public class ListaResponseBuscadorDto {
	public String searchType;
	public String expression;
	public String errorMessage;

	public ArrayList<ResponseBuscadorDto> listaBuscador;

	public ArrayList<ResponseBuscadorDto> getListaBuscador() {
		return listaBuscador;
	}

	public void setListaBuscador(ArrayList<ResponseBuscadorDto> listaBuscador) {
		this.listaBuscador = listaBuscador;
	}

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

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

}
