package com.epsilon.pokemongo.pokemon.egss;

import com.epsilon.pokemongo.data.EggDataSource;
import com.epsilon.pokemongo.data.local.EggRepository;
import com.epsilon.pokemongo.model.Egg;

import java.util.List;

/**
 * Created by John on 8/18/2016.
 */
public class EggPresenter implements EggsContract.Presenter {

    private final EggsContract.View mView;
    private final EggRepository mRepository;

    public EggPresenter(EggsContract.View mView, EggRepository mRepository) {
        this.mView = mView;
        this.mRepository = mRepository;
    }

    @Override
    public void loadEggs() {
        mRepository.loadEggs(new EggDataSource.LoadEggsCallback() {
            @Override
            public void onEggsLoaded(List<Egg> eggs) {
                mView.showEggs(eggs);
            }

            @Override
            public void onDataNotAvailable() {

            }
        });
    }

    @Override
    public void getEggDetail(String id) {
        mRepository.getEgg(id, new EggDataSource.GetEggCallback() {
            @Override
            public void onEggLoaded(Egg egg) {
                mView.showEggDetail(egg);
            }

            @Override
            public void onDataNotAvailable() {

            }
        });
    }

    @Override
    public void start() {
        loadEggs();
    }
}
