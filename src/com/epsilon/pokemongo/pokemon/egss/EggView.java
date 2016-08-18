package com.epsilon.pokemongo.pokemon.egss;

import com.epsilon.pokemongo.model.Egg;

import java.util.List;

/**
 * Created by John on 8/18/2016.
 */
public class EggView implements EggsContract.View{

    private EggsContract.Presenter mPresenter;

    public void setmPresenter(EggsContract.Presenter mPresenter) {
        this.mPresenter = mPresenter;
    }

    @Override
    public void showEggs(List<Egg> eggs) {

    }

    @Override
    public void showEggDetail(Egg egg) {

    }

    @Override
    public void setPresenter(EggsContract.Presenter presenter) {

    }
}
