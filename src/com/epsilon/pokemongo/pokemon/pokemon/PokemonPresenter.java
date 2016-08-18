package com.epsilon.pokemongo.pokemon.pokemon;

import com.epsilon.pokemongo.data.PokemonDataSource;
import com.epsilon.pokemongo.data.local.PokemonRepository;
import com.epsilon.pokemongo.model.Pokemon;

import java.util.List;

/**
 * Created by John on 8/18/2016.
 */
public class PokemonPresenter implements PokemonContract.Presenter {

    private final PokemonContract.View mView;
    private final PokemonRepository mRepository;

    public PokemonPresenter(PokemonContract.View mView, PokemonRepository mRepository) {
        this.mView = mView;
        this.mRepository = mRepository;
    }

    @Override
    public void start() {
        getPokemons();
    }

    @Override
    public void getPokemons() {
        mRepository.getPokemons(new PokemonDataSource.LoadPokemonsCallback() {
            @Override
            public void onPokemonsLoaded(List<Pokemon> pokemons) {
                mView.showPokemons(pokemons);
            }

            @Override
            public void onDataNotAvailable() {

            }
        });
    }
}
