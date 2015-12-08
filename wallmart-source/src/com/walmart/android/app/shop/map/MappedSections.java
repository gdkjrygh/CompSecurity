// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.shop.map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.walmart.android.app.shop.map:
//            AisleSection, MappedData

public class MappedSections
{
    public static class Builder
    {

        private final Map mAisleToData = new HashMap();
        private final List mAnalyticsMappedAisles = new ArrayList();
        private final List mAnalyticsMissingAisles = new ArrayList();
        private final List mMappedData = new ArrayList();

        public void addMappedAisle(String s)
        {
            mAnalyticsMappedAisles.add(s);
        }

        public void addMappedData(MappedData mappeddata)
        {
            mMappedData.add(mappeddata);
            List list = (List)mAisleToData.get(mappeddata.getAisleSection());
            Object obj = list;
            if (list == null)
            {
                obj = new ArrayList();
                mAisleToData.put(mappeddata.getAisleSection(), obj);
            }
            ((List) (obj)).add(mappeddata);
        }

        public void addMissingAisle(String s)
        {
            mAnalyticsMissingAisles.add(s);
        }

        public MappedSections build()
        {
            return new MappedSections(this);
        }





        public Builder()
        {
        }
    }


    private final Map mAisleToData;
    private final List mAnalyticsMappedAisles;
    private final List mAnalyticsMissingAisles;
    private final List mMappedData;

    private MappedSections(Builder builder)
    {
        mMappedData = Collections.unmodifiableList(builder.mMappedData);
        mAisleToData = Collections.unmodifiableMap(builder.mAisleToData);
        mAnalyticsMappedAisles = Collections.unmodifiableList(builder.mAnalyticsMappedAisles);
        mAnalyticsMissingAisles = Collections.unmodifiableList(builder.mAnalyticsMissingAisles);
    }


    public int getAisleCount()
    {
        return mAisleToData.size();
    }

    public List getAisles()
    {
        return new ArrayList(mAisleToData.keySet());
    }

    public List getAnalyticsMappedLocations()
    {
        return mAnalyticsMappedAisles;
    }

    public List getAnalyticsMissingLocations()
    {
        return mAnalyticsMissingAisles;
    }

    public List getData()
    {
        return Collections.unmodifiableList(mMappedData);
    }

    public List getData(AisleSection aislesection)
    {
        return Collections.unmodifiableList((List)mAisleToData.get(aislesection));
    }

    public int getDataCount()
    {
        return mMappedData.size();
    }
}
