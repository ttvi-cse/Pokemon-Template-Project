package com.epsilon.pokemongo.main;

import com.epsilon.pokemongo.BasePresenter;
import com.epsilon.pokemongo.BaseView;

/**
 * Created by John on 8/18/2016.
 */
public interface MainContract {

    interface View extends BaseView<Presenter> {
        void showProfile();
        void showPokemon();
        void showPokedex();
        void showShop();
        void showItem();
        void showMap();
        void showCharacter();
        void catchPokemon();
    }

    interface Presenter extends BasePresenter {

    }
}
