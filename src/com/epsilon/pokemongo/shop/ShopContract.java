package com.epsilon.pokemongo.shop;

import com.epsilon.pokemongo.BasePresenter;
import com.epsilon.pokemongo.BaseView;
import com.epsilon.pokemongo.model.Item;

import java.util.List;

/**
 * Created by John on 8/18/2016.
 */
public interface ShopContract {

    interface View extends BaseView<Presenter> {
        void showItem(List<Item> items);
    }

    interface Presenter extends BasePresenter {

    }
}
