package com.epsilon.pokemongo.pokedex;

import com.epsilon.pokemongo.data.PokedexDataSrouce;
import com.epsilon.pokemongo.data.local.PokedexRepository;
import com.epsilon.pokemongo.model.Pokedex;

/**
 * Created by John on 8/18/2016.
 */
public class PokedexPresenter implements PokedexContract.Presenter{

    private final PokedexContract.View mView;
    private final PokedexRepository mRepository;

    public PokedexPresenter(PokedexContract.View mView, PokedexRepository mRepository) {
        this.mView = mView;
        this.mRepository = mRepository;
    }

    @Override
    public void loadPokeDex() {
        mRepository.loadPokedex(new PokedexDataSrouce.LoadPokedexCallback() {
            @Override
            public void onPokedexLoaded(Pokedex pokedex) {
                mView.showPokedex(pokedex);
            }

            @Override
            public void onDataNotAvailable() {

            }
        });
    }

    @Override
    public void start() {
        loadPokeDex();
    }
}
