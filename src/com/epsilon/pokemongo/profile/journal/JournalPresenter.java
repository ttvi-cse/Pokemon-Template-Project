package com.epsilon.pokemongo.profile.journal;

import com.epsilon.pokemongo.data.ProfileDataSource;
import com.epsilon.pokemongo.data.local.ProfileRepository;
import com.epsilon.pokemongo.model.Journal;
import com.epsilon.pokemongo.model.Profile;

/**
 * Created by John on 8/18/2016.
 */
public class JournalPresenter implements JournalContract.Presenter {

    private final JournalContract.View mView;
    private final ProfileRepository mRepository;

    public JournalPresenter(JournalContract.View mView, ProfileRepository mRepository) {
        this.mView = mView;
        this.mRepository = mRepository;
    }

    @Override
    public void getJournalList() {
        mRepository.getProfile(new ProfileDataSource.GetProfileCallback() {
            @Override
            public void onProfileLoaded(Profile profile) {
                mView.showJournal(profile.journal);
            }

            @Override
            public void onDataNotAvalable() {

            }
        });
    }

    @Override
    public void start() {
        getJournalList();
    }
}
