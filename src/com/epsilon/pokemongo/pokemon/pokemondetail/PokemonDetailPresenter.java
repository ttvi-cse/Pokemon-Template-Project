package com.epsilon.pokemongo.pokemon.pokemondetail;

import com.epsilon.pokemongo.data.PokemonDataSource;
import com.epsilon.pokemongo.data.local.PokemonRepository;
import com.epsilon.pokemongo.model.Pokemon;
import com.epsilon.pokemongo.pokemon.pokemon.PokemonContract;

/**
 * Created by John on 8/18/2016.
 */
public class PokemonDetailPresenter implements PokeMonDetailContract.Presenter {

    private final PokeMonDetailContract.View mView;
    private final PokemonRepository mRepository;

    public PokemonDetailPresenter(PokeMonDetailContract.View mView, PokemonRepository mRepository) {
        this.mView = mView;
        this.mRepository = mRepository;
    }

    @Override
    public void start() {
        getPokemonDetail("pokemon_id");
    }

    @Override
    public void getPokemonDetail(String id) {
        mRepository.getPokemon(id, new PokemonDataSource.GetPokemonCallback() {
            @Override
            public void onPokemonLoaded(Pokemon pokemon) {
                mView.showPokemonDetail(pokemon);
            }

            @Override
            public void onDataNotAvailable() {

            }
        });
    }
}
