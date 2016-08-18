package com.epsilon.pokemongo.profile.journal;

import com.epsilon.pokemongo.BasePresenter;
import com.epsilon.pokemongo.BaseView;
import com.epsilon.pokemongo.main.MainContract;
import com.epsilon.pokemongo.model.Journal;
import com.epsilon.pokemongo.model.Profile;

/**
 * Created by John on 8/18/2016.
 */
public interface JournalContract {
    interface View extends BaseView<MainContract.Presenter> {
        void showJournal(Journal journal);
    }

    interface Presenter extends BasePresenter {
        void getJournalList();
    }
}
