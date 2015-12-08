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

public class InStoreSearchPagerAdapter extends PagerAdapter
    implements InStoreMapFullScreenPresenter.SourceDataAdapter
{

    private final List mMappedData = new ArrayList();

    public InStoreSearchPagerAdapter()
    {
    }

    public void destroyItem(ViewGroup viewgroup, int i, Object obj)
    {
        viewgroup.removeView((View)obj);
    }

    public int getCount()
    {
        return mMappedData.size();
    }

    public MappedData getData(int i)
    {
        if (i >= 0 && i < getCount())
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

    public String getImageUrl(int i)
    {
        MappedData mappeddata = getData(i);
        if (mappeddata != null)
        {
            return ((com.walmart.android.data.InStoreSearchResult.Result)mappeddata.getSourceData()).getThumbNailUrl();
        } else
        {
            return null;
        }
    }

    public Object instantiateItem(ViewGroup viewgroup, int i)
    {
        MapCardView mapcardview = (MapCardView)ViewUtil.inflate(viewgroup.getContext(), 0x7f04006c, viewgroup);
        mapcardview.setBackgroundDrawable(null);
        MappedData mappeddata = (MappedData)mMappedData.get(i);
        mapcardview.setInStoreItem((com.walmart.android.data.InStoreSearchResult.Result)mappeddata.getSourceData());
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
}
