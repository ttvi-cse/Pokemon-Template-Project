package com.epsilon.pokemongo.data;

import com.epsilon.pokemongo.model.Customize;
import com.epsilon.pokemongo.model.Pokemon;
import com.epsilon.pokemongo.model.Profile;
import com.epsilon.pokemongo.model.Team;

import java.util.Map;

/**
 * Created by John on 8/18/2016.
 */
public interface ProfileDataSource {

    interface GetProfileCallback {
        void onProfileLoaded(Profile profile);
        void onDataNotAvalable();
    }

    void addXp(long xp);
    void addPokemonCoins(long coins);
    void joinTeam(Team team);
    void updateAchivement(String achivement, int count);
    void updateCustomize(Customize custom);
    void addJournal(Map<String, Pokemon> journal);
    void getProfile(GetProfileCallback callback);
}
