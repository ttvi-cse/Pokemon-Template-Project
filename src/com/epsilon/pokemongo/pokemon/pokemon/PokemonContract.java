package com.epsilon.pokemongo.pokemon.pokemon;

import com.epsilon.pokemongo.BasePresenter;
import com.epsilon.pokemongo.BaseView;
import com.epsilon.pokemongo.model.Pokemon;

import java.util.List;

/**
 * Created by John on 8/18/2016.
 */
public interface PokemonContract {

    interface View extends BaseView<Presenter> {
        void showPokemons(List<Pokemon> pokemons);
    }

    interface Presenter extends BasePresenter {
        void getPokemons();
    }
}
