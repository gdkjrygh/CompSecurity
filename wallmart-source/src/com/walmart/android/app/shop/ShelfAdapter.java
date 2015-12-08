// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.shop;

import android.content.Context;
import android.view.View;
import com.walmart.android.wmservice.Authentication;
import com.walmart.android.wmservice.Services;
import com.walmartlabs.ui.recycler.BasicViewHolder;
import com.walmartlabs.ui.recycler.PagingAdapter;

public abstract class ShelfAdapter extends PagingAdapter
{
    public static class ShelfItemViewHolder extends BasicViewHolder
    {

        public ShelfItemViewHolder(View view)
        {
            super(view);
        }
    }


    private Context mContext;
    private boolean mItemsWithoutIdEnabled;
    private boolean mShippingPassEligible;
    private boolean mShowSoldOutBanner;

    public ShelfAdapter(Context context)
    {
        mShowSoldOutBanner = false;
        mContext = context;
        mShippingPassEligible = Services.get().getAuthentication().isShippingPassEligibleOrMember();
    }

    public void cleanup()
    {
        reset(false);
    }

    protected Context getContext()
    {
        return mContext;
    }

    public long getItemId(int i)
    {
        return -1L;
    }

    protected boolean isShippingPassEligible()
    {
        return mShippingPassEligible;
    }

    public boolean itemsWithoutIdEnabled()
    {
        return mItemsWithoutIdEnabled;
    }

    public void setItemsWithoutIdEnabled(boolean flag)
    {
        mItemsWithoutIdEnabled = flag;
    }

    public void setShouldShowSoldOut(boolean flag)
    {
        mShowSoldOutBanner = flag;
    }

    public boolean shouldShowSoldOut()
    {
        return mShowSoldOutBanner;
    }
}
