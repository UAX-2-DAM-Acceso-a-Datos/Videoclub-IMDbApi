package com.uax.accesodatos.Interface;

import java.util.List;

import com.uax.accesodatos.dto.FavoritosDto;

public interface FavoritoInterface {
	public List<FavoritosDto> getFavoritos(String user);//obbtener favoritos
	public boolean addFavorito(FavoritosDto a);//añadir a favoritos
	public boolean deleteFavorito(FavoritosDto a);//borrar de favoritos

}
