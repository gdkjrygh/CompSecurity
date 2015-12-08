// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wsi.android.framework.wxdata.geodata.items;

import com.wsi.android.framework.wxdata.controller.helpers.GeoDataUpdateListener;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.wsi.android.framework.wxdata.geodata.items:
//            GeoObject

public abstract class GeoDataCollection
{

    protected String categoryFeatureId;
    private ArrayList data;
    private long lastPollingTime;

    protected GeoDataCollection()
    {
        this(new ArrayList(), System.currentTimeMillis());
    }

    protected GeoDataCollection(ArrayList arraylist, long l)
    {
        data = arraylist;
        lastPollingTime = l;
    }

    public void add(GeoObject geoobject)
    {
        data.add(geoobject);
    }

    public String getCategoryFeatureId()
    {
        return categoryFeatureId;
    }

    public List getData()
    {
        return data;
    }

    public long getLastPollingTime()
    {
        return lastPollingTime;
    }

    public abstract void notifyGeoDataUpdated(GeoDataUpdateListener geodataupdatelistener);

    public void setCategoryFeatureId(String s)
    {
        categoryFeatureId = s;
    }

    protected void setLastPollingTime(long l)
    {
        lastPollingTime = l;
    }
}
