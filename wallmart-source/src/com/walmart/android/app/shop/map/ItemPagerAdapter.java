// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.shop.map;

import com.walmart.android.app.item.ItemLogic;
import com.walmart.android.data.StoreAvailabilityData;
import com.walmart.android.service.item.ItemModel;
import java.util.List;

// Referenced classes of package com.walmart.android.app.shop.map:
//            AbstractItemPagerAdapter, MappedData, MapCardView

public class ItemPagerAdapter extends AbstractItemPagerAdapter
{

    private ItemModel mItemData;
    private ItemLogic mItemLogic;

    public ItemPagerAdapter()
    {
    }

    public int getCount()
    {
        if (mItemData != null && mItemLogic != null)
        {
            return mMappedData.size();
        } else
        {
            return 0;
        }
    }

    public String getImageUrl(int i)
    {
        String s = null;
        if (mItemData != null)
        {
            s = mItemData.getThumbnailImage();
        }
        return s;
    }

    protected void populateView(MapCardView mapcardview, MappedData mappeddata)
    {
        mapcardview.setItem(mItemData, mItemLogic, (StoreAvailabilityData)mappeddata.getSourceData());
    }

    public void setItemData(ItemModel itemmodel, ItemLogic itemlogic)
    {
        mItemData = itemmodel;
        mItemLogic = itemlogic;
        notifyDataSetChanged();
    }
}
