package com.epsilon.pokemongo.sighting;

import com.epsilon.pokemongo.data.SightingDataSource;
import com.epsilon.pokemongo.data.local.SightingRepository;
import com.epsilon.pokemongo.model.Pokemon;

import java.util.List;

/**
 * Created by John on 8/18/2016.
 */
public class SigtingPresenter implements SightingContract.Presenter{

    private final SightingContract.View mView;
    private final SightingRepository mRepository;

    public SigtingPresenter(SightingContract.View mView, SightingRepository mRepository) {
        this.mView = mView;
        this.mRepository = mRepository;
    }

    @Override
    public void loadSighting() {
        mRepository.loadSighting(new SightingDataSource.LoadSightingCallback() {
            @Override
            public void onSightingLoaded(List<Pokemon> pokemons) {
                mView.showSightingPokemon(pokemons);
            }

            @Override
            public void onDataNotAvailable() {

            }
        });
    }

    @Override
    public void start() {
        loadSighting();
    }
}
