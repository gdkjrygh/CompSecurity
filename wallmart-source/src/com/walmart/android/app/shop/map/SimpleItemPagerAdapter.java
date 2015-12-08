// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.shop.map;

import android.text.Spanned;
import java.util.List;

// Referenced classes of package com.walmart.android.app.shop.map:
//            AbstractItemPagerAdapter, MapCardView, MappedData

public class SimpleItemPagerAdapter extends AbstractItemPagerAdapter
{

    private String mImageUrl;
    private boolean mIsSubPrice;
    private Spanned mItemName;
    private String mPrefix;
    private String mPrice;
    private String mPricePerUnit;
    private String mPriceUnit;
    private String mStockStatus;

    public SimpleItemPagerAdapter()
    {
    }

    public int getCount()
    {
        if (mItemName != null)
        {
            return mMappedData.size();
        } else
        {
            return 0;
        }
    }

    public String getImageUrl(int i)
    {
        return mImageUrl;
    }

    protected void populateView(MapCardView mapcardview, MappedData mappeddata)
    {
        mapcardview.setTitle(mItemName);
        mapcardview.setPrice(mPrice, mIsSubPrice, mPriceUnit, mPricePerUnit);
        mapcardview.setPrefix(mPrefix);
        mapcardview.setThumbNailUrl(mImageUrl);
        mapcardview.setStockStatus(mStockStatus);
    }

    public void setItemData(Spanned spanned, String s, String s1, String s2, boolean flag, String s3, String s4, 
            String s5)
    {
        mItemName = spanned;
        mImageUrl = s;
        mPrefix = s1;
        mPrice = s2;
        mIsSubPrice = flag;
        mPriceUnit = s3;
        mPricePerUnit = s4;
        mStockStatus = s5;
        notifyDataSetChanged();
    }
}
