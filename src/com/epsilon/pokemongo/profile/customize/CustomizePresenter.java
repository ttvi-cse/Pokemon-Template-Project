package com.epsilon.pokemongo.profile.customize;

import com.epsilon.pokemongo.data.ProfileDataSource;
import com.epsilon.pokemongo.data.local.ProfileRepository;
import com.epsilon.pokemongo.model.Profile;

/**
 * Created by John on 8/18/2016.
 */
public class CustomizePresenter implements CustomizeContract.Presenter {

    private final CustomizeContract.View mCustomizeView;
    private final ProfileRepository mProfileRepository;

    public CustomizePresenter(CustomizeContract.View customizeView, ProfileRepository profileRepository) {
        this.mCustomizeView = customizeView;
        this.mProfileRepository = profileRepository;
    }

    @Override
    public void start() {
        getCustomize();
    }

    @Override
    public void getCustomize() {
        mProfileRepository.getProfile(new ProfileDataSource.GetProfileCallback() {
            @Override
            public void onProfileLoaded(Profile profile) {
                mCustomizeView.showCharacter(profile.customize);
            }

            @Override
            public void onDataNotAvalable() {

            }
        });
    }
}
