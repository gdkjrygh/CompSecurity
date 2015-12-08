// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.shop.map;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.walmart.android.app.shop.map:
//            MappedData, AislePositions, MappedSections, AisleSection

public abstract class SourceDataMapper
{
    public static interface Listener
    {

        public abstract void onUpdate(MappedSections mappedsections);
    }


    private AislePositions mAislePositions;
    private Object mDataSource;
    private final List mListener = new ArrayList();
    private MappedSections mMappedSections;
    private MappedData mSelected;
    private String mStoreId;

    public SourceDataMapper()
    {
        mMappedSections = (new MappedSections.Builder()).build();
    }

    private void notifyUpdated()
    {
        for (Iterator iterator = mListener.iterator(); iterator.hasNext(); ((Listener)iterator.next()).onUpdate(mMappedSections)) { }
    }

    public void addListener(Listener listener)
    {
        mListener.add(listener);
        listener.onUpdate(mMappedSections);
    }

    protected final String getAisle(com.walmart.android.data.InStoreSearchResult.Detailed detailed)
    {
        return (new StringBuilder()).append(detailed.zone).append(detailed.aisle).toString();
    }

    public AislePositions getAislePositions()
    {
        return mAislePositions;
    }

    protected final String getAisleSection(com.walmart.android.data.InStoreSearchResult.Detailed detailed)
    {
        return (new StringBuilder()).append(detailed.zone).append(detailed.aisle).append(".").append(detailed.section).toString();
    }

    public Object getDataSource()
    {
        return mDataSource;
    }

    public MappedSections getMappedSections()
    {
        return mMappedSections;
    }

    public MappedData getSelected()
    {
        return mSelected;
    }

    public String getStoreId()
    {
        return mStoreId;
    }

    public boolean hasAllData()
    {
        return mDataSource != null && mAislePositions != null && mStoreId != null;
    }

    public void removeListener(Listener listener)
    {
        mListener.remove(listener);
    }

    public AisleSection select(MappedData mappeddata)
    {
        mSelected = mappeddata;
        return mappeddata.getAisleSection();
    }

    public void setAislePositions(AislePositions aislepositions)
    {
        mAislePositions = aislepositions;
        update();
    }

    public boolean setStoreDataSource(String s, Object obj)
    {
        boolean flag;
        if (!s.equals(mStoreId) || obj != mDataSource)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            mStoreId = s;
            mDataSource = obj;
            setAislePositions(null);
            update();
        }
        return flag;
    }

    protected void update()
    {
        MappedSections mappedsections = updateDetailedLocations(getAislePositions(), getDataSource());
        if (mMappedSections == null || !mMappedSections.equals(mappedsections))
        {
            mMappedSections = mappedsections;
            notifyUpdated();
        }
    }

    protected abstract MappedSections updateDetailedLocations(AislePositions aislepositions, Object obj);
}
