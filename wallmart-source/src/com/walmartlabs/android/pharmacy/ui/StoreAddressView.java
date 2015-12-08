// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.pharmacy.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.walmart.android.utils.ViewUtil;
import com.walmartlabs.android.pharmacy.PlaceHolderStoreData;
import com.walmartlabs.storelocator.StoreData;

public class StoreAddressView extends LinearLayout
    implements android.view.View.OnClickListener
{
    public static interface OnShowStoreDetailsListener
    {

        public abstract void onShowStoreDetails(StoreData storedata);
    }


    private TextView addressLine1;
    private TextView addressLine2;
    private boolean mIsPlaceHolder;
    private OnShowStoreDetailsListener mShowDetailsListener;
    private StoreData mStore;
    private TextView storeName;

    public StoreAddressView(Context context)
    {
        this(context, null);
    }

    public StoreAddressView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        setOrientation(1);
        setClickable(true);
        setOnClickListener(this);
        ((LayoutInflater)context.getSystemService("layout_inflater")).inflate(com.walmartlabs.android.pharmacy.R.layout.pharmacy_store_address, this, true);
        storeName = (TextView)ViewUtil.findViewById(this, com.walmartlabs.android.pharmacy.R.id.store_name);
        addressLine1 = (TextView)ViewUtil.findViewById(this, com.walmartlabs.android.pharmacy.R.id.store_address_1);
        addressLine2 = (TextView)ViewUtil.findViewById(this, com.walmartlabs.android.pharmacy.R.id.store_address_2);
    }

    public void onClick(View view)
    {
        if (!mIsPlaceHolder && mStore != null && mShowDetailsListener != null)
        {
            mShowDetailsListener.onShowStoreDetails(mStore);
        }
    }

    public void setOnShowStoreDetailsListener(OnShowStoreDetailsListener onshowstoredetailslistener)
    {
        mShowDetailsListener = onshowstoredetailslistener;
    }

    public void setStore(StoreData storedata)
    {
        mStore = storedata;
        mIsPlaceHolder = storedata instanceof PlaceHolderStoreData;
        TextView textview = storeName;
        boolean flag;
        if (!mIsPlaceHolder)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        textview.setEnabled(flag);
        storeName.setText(storedata.getDescription());
        addressLine1.setText(storedata.getAddressStreetLine());
        addressLine2.setText(storedata.getCityStateZip());
    }
}
