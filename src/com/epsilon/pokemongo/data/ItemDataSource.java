package com.epsilon.pokemongo.data;

import com.epsilon.pokemongo.model.Item;

import java.util.List;

/**
 * Created by John on 8/18/2016.
 */
public interface ItemDataSource {
    interface LoadItemsCallback {
        void onItemLoaded(List<Item> item);
        void onDataNotAvailable();
    }

    void loadItems(LoadItemsCallback callback);
}
