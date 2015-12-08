// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.shop.map;

import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import com.walmart.android.utils.ViewUtil;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.walmart.android.app.shop.map:
//            MappedData, MapCardView, AisleSection, MappedSections

public abstract class AbstractItemPagerAdapter extends PagerAdapter
    implements InStoreMapFullScreenPresenter.SourceDataAdapter
{

    protected final List mMappedData = new ArrayList();

    public AbstractItemPagerAdapter()
    {
    }

    public void destroyItem(ViewGroup viewgroup, int i, Object obj)
    {
        viewgroup.removeView((View)obj);
    }

    public MappedData getData(int i)
    {
        if (i >= 0 && i < mMappedData.size())
        {
            return (MappedData)mMappedData.get(i);
        } else
        {
            return null;
        }
    }

    public int getDataPosition(MappedData mappeddata)
    {
        return mMappedData.indexOf(mappeddata);
    }

    public Object instantiateItem(ViewGroup viewgroup, int i)
    {
        MapCardView mapcardview = (MapCardView)ViewUtil.inflate(viewgroup.getContext(), 0x7f04006c, viewgroup);
        MappedData mappeddata = (MappedData)mMappedData.get(i);
        populateView(mapcardview, mappeddata);
        mapcardview.setAisle(null, mappeddata.getAisleSection().getDepartment());
        viewgroup.addView(mapcardview);
        return mapcardview;
    }

    public boolean isViewFromObject(View view, Object obj)
    {
        return view == obj;
    }

    public void onUpdate(MappedSections mappedsections)
    {
        mMappedData.clear();
        mMappedData.addAll(mappedsections.getData());
        notifyDataSetChanged();
    }

    protected abstract void populateView(MapCardView mapcardview, MappedData mappeddata);
}
