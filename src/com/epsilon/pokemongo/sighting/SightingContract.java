package com.epsilon.pokemongo.sighting;

import com.epsilon.pokemongo.BasePresenter;
import com.epsilon.pokemongo.BaseView;
import com.epsilon.pokemongo.model.Pokemon;

import java.util.List;

/**
 * Created by John on 8/18/2016.
 */
public interface SightingContract {
    interface View extends BaseView<Presenter> {
        void showSightingPokemon(List<Pokemon> pokemons);
        void updateSigting(long interval);
    }
    interface Presenter extends BasePresenter {
        void loadSighting();
    }
}
