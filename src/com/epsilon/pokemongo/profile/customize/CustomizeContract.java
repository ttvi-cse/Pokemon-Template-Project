package com.epsilon.pokemongo.profile.customize;

import com.epsilon.pokemongo.BasePresenter;
import com.epsilon.pokemongo.BaseView;
import com.epsilon.pokemongo.model.Customize;

/**
 * Created by John on 8/18/2016.
 */
public interface CustomizeContract {

    interface View extends BaseView<Presenter> {
        void showCharacter(Customize customize);
        void setupSkin();
        void setupHair();
        void setupEye();
        void setupHat();
        void setupShirt();
        void setupPant();
        void setupShoes();
        void setupBag();
        void setupGender();
        void sumit();
    }

    interface Presenter extends BasePresenter {
        void getCustomize();
    }
}
