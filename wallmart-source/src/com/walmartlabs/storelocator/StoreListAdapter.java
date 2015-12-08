// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.storelocator;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.google.android.gms.maps.model.LatLng;
import com.walmart.android.utils.ViewUtil;

// Referenced classes of package com.walmartlabs.storelocator:
//            StoreFinderConfigurator, LayoutConfig, StoreManager, StoreService, 
//            StoreLocationManager, StoreData

public class StoreListAdapter extends BaseAdapter
{
    public static interface OnFailedToLoadStoresListener
    {

        public abstract void onFailed(int i);
    }


    public static final String TAG = com/walmartlabs/storelocator/StoreListAdapter.getSimpleName();
    public static final String TAG_ENTRY_LOADING = "LOADING_ENTRY";
    public static final String TAG_ENTRY_STORE = "STORE_ENTRY";
    private final StoreFinderConfigurator mConfigurator;
    private Context mContext;
    private boolean mHideLoadingEntry;
    private LayoutInflater mInflater;
    private final String mItemRestrictions[];
    private View mLoadingEntry;
    private boolean mLoadingStoreItems;
    private LatLng mMapLocation;
    private OnFailedToLoadStoresListener mOnFailedToLoadStoresListener;
    private View mPleaseWaitView;
    private boolean mReachedEndOfStores;
    private StoreManager mStoreManager;

    public StoreListAdapter(Context context, StoreFinderConfigurator storefinderconfigurator, StoreManager storemanager, String as[])
    {
        mLoadingStoreItems = true;
        mItemRestrictions = as;
        mConfigurator = storefinderconfigurator;
        init(context, storemanager);
    }

    private void init(Context context, StoreManager storemanager)
    {
        mContext = context;
        mInflater = (LayoutInflater)mContext.getSystemService("layout_inflater");
        mLoadingEntry = mInflater.inflate(com.walmart.lib.R.layout.store_list_loading_item, null);
        ViewUtil.setText(com.walmart.lib.R.id.loading_entry_text, mLoadingEntry, mConfigurator.getLayoutConfig().getIdForStringEnum(LayoutConfig.StringEnum.LOADING_PROGRESS));
        mPleaseWaitView = new View(mContext);
        mStoreManager = storemanager;
    }

    private void loadStores()
    {
        StoreService.GetStoresCallback getstorescallback = new StoreService.GetStoresCallback() {

            final StoreListAdapter this$0;

            public void onFailure(int j)
            {
                Log.w(StoreListAdapter.TAG, (new StringBuilder()).append("onFailureSameThread: ").append(j).toString());
                mLoadingStoreItems = false;
                if (mOnFailedToLoadStoresListener != null)
                {
                    mOnFailedToLoadStoresListener.onFailed(j);
                }
            }

            public void onStoresReceived(StoreData astoredata[])
            {
                mStoreManager.addStores(astoredata);
                if (astoredata.length == 0 || mStoreManager.isFilterActive())
                {
                    mReachedEndOfStores = true;
                }
                notifyDataSetChanged();
                mLoadingStoreItems = false;
            }

            
            {
                this$0 = StoreListAdapter.this;
                super();
            }
        };
        int i = mStoreManager.size();
        if (mItemRestrictions != null && mItemRestrictions.length > 0)
        {
            StoreService.getStoreService().getStoresForItems(mMapLocation.longitude, mMapLocation.latitude, mItemRestrictions, i, 50, getstorescallback);
            return;
        } else
        {
            StoreLocationManager.getInstance(mContext).loadStores(mMapLocation, 0xf4240, i, 50, getstorescallback);
            return;
        }
    }

    private void populateFields(View view, StoreData storedata)
    {
        ViewGroup viewgroup = (ViewGroup)view;
        ((TextView)viewgroup.findViewById(com.walmart.lib.R.id.store_list_entry_address_1)).setText(storedata.getAddressStreetLine());
        ((TextView)viewgroup.findViewById(com.walmart.lib.R.id.store_list_entry_address_2)).setText(storedata.getCityStateZip());
        view = viewgroup.findViewById(com.walmart.lib.R.id.distance_text_container);
        if (storedata.distanceFromSource >= 0.0D)
        {
            view.setVisibility(0);
            ViewUtil.setText(com.walmart.lib.R.id.store_list_entry_distance, view, String.format("%.2f", new Object[] {
                Double.valueOf(storedata.distanceFromSource)
            }));
        } else
        {
            view.setVisibility(8);
        }
        storedata = storedata.getDescription();
        view = storedata;
        if (storedata != null)
        {
            view = storedata;
            if (storedata.trim().equals("Walmart"))
            {
                view = "Walmart Store";
            }
        }
        ((TextView)viewgroup.findViewById(com.walmart.lib.R.id.store_list_entry_title)).setText(view);
    }

    private void updateLoadingIndicator()
    {
        View view = ((ViewGroup)mLoadingEntry).findViewById(com.walmart.lib.R.id.progress);
        view.setVisibility(4);
        view.setVisibility(0);
    }

    public int getCount()
    {
        int j = mStoreManager.size();
        int i = j;
        if (!hasReachedEnd())
        {
            i = j;
            if (isLoadingItems())
            {
                i = j + 1;
            }
        }
        return i;
    }

    public Object getItem(int i)
    {
        return null;
    }

    public long getItemId(int i)
    {
        return 0L;
    }

    public StoreData getStoreAt(int i)
    {
        StoreData storedata = null;
        if (i < mStoreManager.size())
        {
            storedata = mStoreManager.getStore(i);
        }
        return storedata;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        if (i < mStoreManager.size())
        {
            StoreData storedata = mStoreManager.getStore(i);
            View view1 = view;
            if (view != null)
            {
                view1 = view;
                if (view.getTag() != "STORE_ENTRY")
                {
                    view1 = null;
                }
            }
            View view2 = mConfigurator.getStoreListItemView(mInflater, view1, storedata);
            view = view2;
            if (view2 == null)
            {
                if (view1 == null)
                {
                    view = mInflater.inflate(com.walmart.lib.R.layout.store_list_item, viewgroup, false);
                    view.setTag("STORE_ENTRY");
                } else
                {
                    view = view1;
                }
                populateFields(view, storedata);
            }
            return view;
        }
        if (mHideLoadingEntry)
        {
            return mPleaseWaitView;
        } else
        {
            return mLoadingEntry;
        }
    }

    public void handleOnScroll(AbsListView abslistview, int i, int j, int k)
    {
        k = getCount();
        if (!isLoadingItems() && !hasReachedEnd() && i + j >= k)
        {
            loadMoreItemsAsync();
        }
    }

    public boolean hasReachedEnd()
    {
        return mReachedEndOfStores;
    }

    public void hideLoadingEntry()
    {
        if (!mHideLoadingEntry)
        {
            mHideLoadingEntry = true;
            notifyDataSetChanged();
        }
    }

    public boolean isLoadingItems()
    {
        return mLoadingStoreItems;
    }

    public void loadMoreItemsAsync()
    {
        if (mMapLocation != null)
        {
            mLoadingStoreItems = true;
            updateLoadingIndicator();
            loadStores();
        }
    }

    public void onMapStoresLoaded()
    {
        mReachedEndOfStores = true;
        notifyDataSetChanged();
    }

    public void onMapStoresLoadingStart()
    {
        if (!mLoadingStoreItems && getCount() == 0)
        {
            mLoadingStoreItems = true;
            mHideLoadingEntry = false;
            notifyDataSetChanged();
        }
    }

    public void refreshLoadedStoreData()
    {
        notifyDataSetChanged();
    }

    public void reloadStoreData()
    {
        mReachedEndOfStores = false;
        mHideLoadingEntry = false;
        notifyDataSetChanged();
    }

    public void setMapLocation(LatLng latlng)
    {
        mMapLocation = latlng;
    }

    public void setOnFailedToLoadStoresListener(OnFailedToLoadStoresListener onfailedtoloadstoreslistener)
    {
        mOnFailedToLoadStoresListener = onfailedtoloadstoreslistener;
    }




/*
    static boolean access$102(StoreListAdapter storelistadapter, boolean flag)
    {
        storelistadapter.mReachedEndOfStores = flag;
        return flag;
    }

*/


/*
    static boolean access$202(StoreListAdapter storelistadapter, boolean flag)
    {
        storelistadapter.mLoadingStoreItems = flag;
        return flag;
    }

*/

}
