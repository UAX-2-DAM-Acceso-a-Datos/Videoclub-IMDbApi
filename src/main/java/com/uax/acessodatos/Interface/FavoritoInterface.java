package com.uax.acessodatos.Interface;

import java.util.List;

import com.uax.accesodatos.dto.FavoritosDto;

public interface FavoritoInterface {
	public List<FavoritosDto> getFavoritos(String user);
	public boolean addFavorito(FavoritosDto a);
	public boolean deleteFavorito(FavoritosDto a);

}
