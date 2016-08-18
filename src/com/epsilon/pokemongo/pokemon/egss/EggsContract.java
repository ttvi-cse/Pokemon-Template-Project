package com.epsilon.pokemongo.pokemon.egss;

import com.epsilon.pokemongo.BasePresenter;
import com.epsilon.pokemongo.BaseView;
import com.epsilon.pokemongo.main.MainContract;
import com.epsilon.pokemongo.model.Egg;

import java.util.List;

/**
 * Created by John on 8/18/2016.
 */
public interface EggsContract {

    interface  View extends BaseView<Presenter> {
        void showEggs(List<Egg> eggs);
        void showEggDetail(Egg egg);
    }

    interface Presenter extends BasePresenter {
        void loadEggs();
        void getEggDetail(String id);
    }
}
