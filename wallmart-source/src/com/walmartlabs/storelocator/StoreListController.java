// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.storelocator;

import android.util.Log;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListView;
import com.google.android.gms.maps.model.LatLng;

// Referenced classes of package com.walmartlabs.storelocator:
//            StoreListAdapter, StorePickerListener

public class StoreListController
{

    public static final String TAG = com/walmartlabs/storelocator/StoreListController.getSimpleName();
    private StoreListAdapter mStoreListAdapter;
    private final ListView mStoreListView;
    private StorePickerListener mStorePickerListener;

    public StoreListController(ListView listview, StoreListAdapter storelistadapter)
    {
        mStoreListView = listview;
        mStoreListAdapter = storelistadapter;
        wireListeners();
    }

    private void wireListeners()
    {
        mStoreListView.setOnScrollListener(new android.widget.AbsListView.OnScrollListener() {

            final StoreListController this$0;

            public void onScroll(AbsListView abslistview, int i, int j, int k)
            {
                mStoreListAdapter.handleOnScroll(abslistview, i, j, k);
            }

            public void onScrollStateChanged(AbsListView abslistview, int i)
            {
            }

            
            {
                this$0 = StoreListController.this;
                super();
            }
        });
        mStoreListView.setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() {

            final StoreListController this$0;

            public void onItemClick(AdapterView adapterview, View view, int i, long l)
            {
                adapterview = mStoreListAdapter.getStoreAt(i);
                if (adapterview != null)
                {
                    if (mStorePickerListener != null)
                    {
                        mStorePickerListener.onStoreClicked(adapterview);
                    }
                    return;
                } else
                {
                    Log.e(StoreListController.TAG, (new StringBuilder()).append("Error could not retrieve stor information at position: ").append(i).toString());
                    return;
                }
            }

            
            {
                this$0 = StoreListController.this;
                super();
            }
        });
    }

    public void cleanUp()
    {
        mStoreListView.setOnItemClickListener(null);
        mStoreListView.setOnScrollListener(null);
        mStoreListView.setAdapter(null);
        mStoreListAdapter = null;
    }

    public void hideLoadingIndicator()
    {
        if (mStoreListAdapter != null)
        {
            mStoreListAdapter.hideLoadingEntry();
        }
    }

    public void onMapStoresLoaded()
    {
        mStoreListAdapter.onMapStoresLoaded();
    }

    public void onMapStoresLoadingStart()
    {
        mStoreListAdapter.onMapStoresLoadingStart();
    }

    public void refreshLoadedStoreData()
    {
        mStoreListAdapter.refreshLoadedStoreData();
    }

    public void reloadStoreData()
    {
        mStoreListAdapter.reloadStoreData();
    }

    public void setLocation(LatLng latlng)
    {
        mStoreListAdapter.setMapLocation(latlng);
    }

    public void setStorePickerListener(StorePickerListener storepickerlistener)
    {
        mStorePickerListener = storepickerlistener;
    }



}
