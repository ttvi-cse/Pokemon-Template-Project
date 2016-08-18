package com.epsilon.pokemongo.main;

/**
 * Created by John on 8/18/2016.
 */
public class MainView implements MainContract.View {

    MainContract.Presenter mPresenter;

    @Override
    public void showProfile() {

    }

    @Override
    public void showPokemon() {

    }

    @Override
    public void showPokedex() {

    }

    @Override
    public void showShop() {

    }

    @Override
    public void showItem() {

    }

    @Override
    public void showMap() {

    }

    @Override
    public void showCharacter() {

    }

    @Override
    public void catchPokemon() {

    }

    @Override
    public void setPresenter(MainContract.Presenter presenter) {
        this.mPresenter = presenter;
    }
}
