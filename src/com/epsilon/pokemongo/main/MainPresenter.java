package com.epsilon.pokemongo.main;

/**
 * Created by John on 8/18/2016.
 */
public class MainPresenter implements MainContract.Presenter {

    private final MainContract.View mMainView;

    public MainPresenter(MainContract.View mainView) {
        this.mMainView = mainView;
    }

    @Override
    public void start() {
        mMainView.showMap();
        mMainView.showCharacter();
    }
}
