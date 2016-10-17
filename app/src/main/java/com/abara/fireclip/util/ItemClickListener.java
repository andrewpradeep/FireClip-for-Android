package com.abara.fireclip.util;

/**
 * Created by abara on 11/09/16.
 */

public interface ItemClickListener {

    void onItemClick(int position);

    void onLongClick(int position);

    void onFavouriteClick(String content, String from, long timestamp);

}
