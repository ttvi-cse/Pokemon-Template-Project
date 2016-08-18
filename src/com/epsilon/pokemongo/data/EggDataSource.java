package com.epsilon.pokemongo.data;

import com.epsilon.pokemongo.model.Egg;

import java.util.List;

/**
 * Created by John on 8/18/2016.
 */
public interface EggDataSource {

    interface LoadEggsCallback {
        void onEggsLoaded(List<Egg> eggs);
        void onDataNotAvailable();
    }

    interface GetEggCallback {
        void onEggLoaded(Egg egg);
        void onDataNotAvailable();
    }

    void loadEggs(LoadEggsCallback callback);
    void getEgg(String id, GetEggCallback callback);
}
