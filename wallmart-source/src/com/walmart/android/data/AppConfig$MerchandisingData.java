// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.data;

import com.walmart.android.util.WalmartUri;
import com.walmartlabs.ui.merchandising.BannerData;
import java.util.ArrayList;
import java.util.HashMap;

// Referenced classes of package com.walmart.android.data:
//            AppConfig

public static class mHomescreenMerchandising
{

    public boolean autoMerchandisingModuleProgression;
    public String clearClientCache;
    private  featuredCategories;
    public boolean force;
    public boolean guestCheckoutEnabled;
    private BannerData mHomescreenMerchandising[];
    private HashMap mShelfData;
    public boolean rxRefillByScanEnabled;
    public String saverUrl;
    public String url;
    public String version;

    public String[] getFeaturedCategories()
    {
        return featuredCategories.shelves;
    }

    public BannerData[] getHomescreenMerchandising()
    {
        return mHomescreenMerchandising;
    }

    public HashMap getShelfData()
    {
        return mShelfData;
    }

    public void setHomescreenMerchandising(BannerData abannerdata[])
    {
        if (abannerdata != null)
        {
            ArrayList arraylist = new ArrayList();
            int j = abannerdata.length;
            for (int i = 0; i < j; i++)
            {
                BannerData bannerdata = abannerdata[i];
                if ("votd".equals(bannerdata.type))
                {
                    continue;
                }
                arraylist.add(bannerdata);
                bannerdata.data = new Object();
                WalmartUri walmarturi = WalmartUri.parse(bannerdata.action);
                if (walmarturi != null && walmarturi.getType() == 6)
                {
                    mShelfData mshelfdata = new mShelfData();
                    mshelfdata.mShelfData = bannerdata.text;
                    mShelfData.put(walmarturi.getParam(0), mshelfdata);
                }
            }

            mHomescreenMerchandising = (BannerData[])arraylist.toArray(new BannerData[arraylist.size()]);
        }
    }

    public void setMerchandising(BannerData abannerdata[])
    {
        mHomescreenMerchandising = abannerdata;
    }

    public void setShelfData(HashMap hashmap)
    {
        mShelfData.putAll(hashmap);
    }

    public ()
    {
        featuredCategories = new (null);
        mShelfData = new HashMap();
        mHomescreenMerchandising = new BannerData[0];
    }
}
