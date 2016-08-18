package com.epsilon.pokemongo.item;

import com.epsilon.pokemongo.data.ItemDataSource;
import com.epsilon.pokemongo.data.local.ItemRepository;
import com.epsilon.pokemongo.model.Item;

import java.util.List;

/**
 * Created by John on 8/18/2016.
 */
public class ItemPresenter implements ItemContract.Presenter {

    private final ItemContract.View mView;
    private final ItemRepository mRepository;

    public ItemPresenter(ItemContract.View mView, ItemRepository mRepository) {
        this.mView = mView;
        this.mRepository = mRepository;
    }

    @Override
    public void start() {
        loadItems();
    }

    @Override
    public void loadItems() {
        mRepository.loadItems(new ItemDataSource.LoadItemsCallback() {
            @Override
            public void onItemLoaded(List<Item> items) {
                mView.showItem(items);
            }

            @Override
            public void onDataNotAvailable() {

            }
        });
    }
}
