package com.epsilon.pokemongo.data;

import com.epsilon.pokemongo.model.Pokemon;

import java.util.List;

/**
 * Created by John on 8/18/2016.
 */
public interface PokemonDataSource {

    interface LoadPokemonsCallback {
        void onPokemonsLoaded(List<Pokemon> pokemons);
        void onDataNotAvailable();
    }

    interface GetPokemonCallback {
        void onPokemonLoaded(Pokemon pokemon);
        void onDataNotAvailable();
    }

    void getPokemons(LoadPokemonsCallback callback);
    void getPokemon(String id, GetPokemonCallback callback);
    void powerUp();
    void evolve();
    void markAsFavorite();
    void transfer();

}
