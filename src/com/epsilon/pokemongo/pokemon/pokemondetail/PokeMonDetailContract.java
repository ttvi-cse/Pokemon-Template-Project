package com.epsilon.pokemongo.pokemon.pokemondetail;

import com.epsilon.pokemongo.BasePresenter;
import com.epsilon.pokemongo.BaseView;
import com.epsilon.pokemongo.model.Pokemon;

/**
 * Created by John on 8/18/2016.
 */
public interface PokeMonDetailContract {

    interface View extends BaseView<Presenter> {
        void showPokemonDetail(Pokemon pokemon);
        void powerUp();
        void evolve();
        void markAsFavorite();
        void transfer();
    }

    interface Presenter extends BasePresenter {
        void getPokemonDetail(String id);
    }
}
