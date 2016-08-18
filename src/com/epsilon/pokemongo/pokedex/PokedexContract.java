package com.epsilon.pokemongo.pokedex;

import com.epsilon.pokemongo.BasePresenter;
import com.epsilon.pokemongo.BaseView;
import com.epsilon.pokemongo.model.Pokedex;

/**
 * Created by John on 8/18/2016.
 */
public interface PokedexContract {
    interface View extends BaseView<Presenter> {
        void showPokedex(Pokedex pokedex);
    }

    interface Presenter extends BasePresenter {
        void loadPokeDex();
    }
}
