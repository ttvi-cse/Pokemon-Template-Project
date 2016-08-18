package com.epsilon.pokemongo.data;

import com.epsilon.pokemongo.model.Pokedex;

/**
 * Created by John on 8/18/2016.
 */
public interface PokedexDataSrouce {

    interface LoadPokedexCallback {
        void onPokedexLoaded(Pokedex pokedex);
        void onDataNotAvailable();
    }

    void loadPokedex(LoadPokedexCallback callback);
}
