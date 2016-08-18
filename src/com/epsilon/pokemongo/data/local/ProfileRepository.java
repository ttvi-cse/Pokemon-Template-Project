package com.epsilon.pokemongo.data.local;

import com.epsilon.pokemongo.data.ProfileDataSource;
import com.epsilon.pokemongo.model.Customize;
import com.epsilon.pokemongo.model.Pokemon;
import com.epsilon.pokemongo.model.Profile;
import com.epsilon.pokemongo.model.Team;

import java.util.Map;

/**
 * Created by John on 8/18/2016.
 */
public class ProfileRepository implements ProfileDataSource {

    @Override
    public void addXp(long xp) {

    }

    @Override
    public void addPokemonCoins(long coins) {

    }

    @Override
    public void joinTeam(Team team) {

    }

    @Override
    public void updateAchivement(String achivement, int count) {

    }

    @Override
    public void updateCustomize(Customize custom) {

    }

    @Override
    public void addJournal(Map<String, Pokemon> journal) {

    }

    @Override
    public void getProfile(GetProfileCallback callback) {

    }
}
