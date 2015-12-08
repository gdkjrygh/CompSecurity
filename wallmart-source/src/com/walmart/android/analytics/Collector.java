// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.analytics;

import com.squareup.otto.Bus;
import com.walmart.android.service.MessageBus;
import com.walmartlabs.anivia.BulkParams;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Collector
{

    private static final HashMap sEventCodeMap;
    private static final ArrayList sEventsToCollect;
    private static final Collector sInstance = new Collector();
    private BulkParams mBulkParams;
    private final Map mEventMap = new ConcurrentHashMap();

    private Collector()
    {
    }

    public static Collector getInstance()
    {
        return sInstance;
    }

    public static void init()
    {
        MessageBus.getBus().register(sInstance);
    }

    public Map getEventMap()
    {
        return mEventMap;
    }

    public void onAniviaEventJsonBuilder(com.walmartlabs.anivia.AniviaEventAsJson.Builder builder)
    {
        Iterator iterator = sEventsToCollect.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            String s = (String)iterator.next();
            if (builder.isEvent(s))
            {
                s = (String)sEventCodeMap.get(s);
                HashMap hashmap = builder.getObjectMapCopy();
                if (mBulkParams != null)
                {
                    hashmap.put("pid", "android");
                    hashmap.put("tpid", "android");
                    hashmap.put("aid", mBulkParams.getApplicationId());
                    hashmap.put("vid", mBulkParams.getVisitorId());
                    hashmap.put("sid", mBulkParams.getSessionId());
                    hashmap.put("aVer", mBulkParams.getApplicationVersion());
                    hashmap.put("mts", Long.valueOf(System.currentTimeMillis()));
                }
                mEventMap.put(s, hashmap);
            }
        } while (true);
    }

    public void setBulkParams(BulkParams bulkparams)
    {
        mBulkParams = bulkparams;
    }

    static 
    {
        sEventsToCollect = new ArrayList();
        sEventCodeMap = new HashMap();
        sEventsToCollect.add("launch");
        sEventsToCollect.add("instoreId");
        sEventCodeMap.put("launch", "USWMSM17");
        sEventCodeMap.put("instoreId", "USWMSM77");
    }
}
