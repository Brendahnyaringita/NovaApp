package com.church.chrysostom.Interfaces;

import android.view.View;

/**
 * Created by heri on 11/6/16.
 */

public interface RecyclerOnItemClickListener {
    /**
     * Called when an item is clicked.
     *
     * @param childView View of the item that was clicked.
     * @param position  Position of the item that was clicked.
     */
    public void onItemClick(View childView, int position);
}