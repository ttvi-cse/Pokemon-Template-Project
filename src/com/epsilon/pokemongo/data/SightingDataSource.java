package com.epsilon.pokemongo.data;

import com.epsilon.pokemongo.model.Pokemon;

import java.util.List;

/**
 * Created by John on 8/18/2016.
 */
public interface SightingDataSource {
    interface LoadSightingCallback {
        void onSightingLoaded(List<Pokemon> pokemons);
        void onDataNotAvailable();
    }

    void loadSighting(LoadSightingCallback callback);
}
