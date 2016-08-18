package com.epsilon.pokemongo.sighting;

import com.epsilon.pokemongo.model.Pokemon;

import java.util.List;

/**
 * Created by John on 8/18/2016.
 */
public class SightingView implements SightingContract.View {

    private SightingContract.Presenter mPresenter;

    public void setmPresenter(SightingContract.Presenter mPresenter) {
        this.mPresenter = mPresenter;
    }

    @Override
    public void showSightingPokemon(List<Pokemon> pokemons) {

    }

    @Override
    public void updateSigting(long interval) {
        mPresenter.loadSighting();
    }

    @Override
    public void setPresenter(SightingContract.Presenter presenter) {

    }
}
