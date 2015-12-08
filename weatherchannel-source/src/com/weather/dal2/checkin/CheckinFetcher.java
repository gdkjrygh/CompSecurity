// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.dal2.checkin;

import com.google.common.base.Preconditions;
import com.google.common.base.Ticker;
import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import com.weather.dal2.cache.AbstractFetcher;
import com.weather.dal2.eventlog.logs.EventLog;
import com.weather.dal2.exceptions.DalException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.weather.dal2.checkin:
//            CheckinRequester, GetCheckinResponse

public class CheckinFetcher extends AbstractFetcher
{

    private static final String TAG = "CheckinNearMeCache";
    private final CheckinRequester checkinRequester;
    private final Cache failureCache;
    private final Cache successCache;

    public CheckinFetcher(CheckinRequester checkinrequester, int i, long l, long l1)
    {
        this(checkinrequester, i, Ticker.systemTicker(), l, l1);
    }

    public CheckinFetcher(CheckinRequester checkinrequester, int i, Ticker ticker, long l, long l1)
    {
        checkinRequester = (CheckinRequester)Preconditions.checkNotNull(checkinrequester);
        successCache = createCache(ticker, i, l);
        failureCache = createCache(ticker, i, l1);
    }

    private static Cache createCache(Ticker ticker, int i, long l)
    {
        CacheBuilder cachebuilder = CacheBuilder.newBuilder().maximumSize(i).expireAfterWrite(l, TimeUnit.MINUTES);
        if (ticker != null)
        {
            cachebuilder.ticker(ticker);
        }
        return cachebuilder.build();
    }

    protected volatile Object fetch(Object obj)
        throws Exception
    {
        return fetch((Collection)obj);
    }

    protected Map fetch(Collection collection)
    {
        HashMap hashmap;
        ArrayList arraylist;
        boolean flag;
        boolean flag1;
        Preconditions.checkNotNull(collection);
        arraylist = new ArrayList();
        hashmap = new HashMap(collection.size());
        flag1 = false;
        for (Iterator iterator = collection.iterator(); iterator.hasNext();)
        {
            String s1 = (String)iterator.next();
            GetCheckinResponse getcheckinresponse = (GetCheckinResponse)successCache.getIfPresent(s1);
            collection = getcheckinresponse;
            if (getcheckinresponse == null)
            {
                collection = (GetCheckinResponse)failureCache.getIfPresent(s1);
            }
            if (collection == null)
            {
                arraylist.add(s1);
            } else
            {
                hashmap.put(s1, collection);
            }
        }

        flag = flag1;
        if (arraylist.isEmpty()) goto _L2; else goto _L1
_L1:
        collection = checkinRequester.getCheckinNear(arraylist).entrySet().iterator();
_L6:
        flag = flag1;
        if (!collection.hasNext()) goto _L2; else goto _L3
_L3:
        String s;
        Object obj;
        obj = (java.util.Map.Entry)collection.next();
        s = (String)((java.util.Map.Entry) (obj)).getKey();
        obj = (GetCheckinResponse)((java.util.Map.Entry) (obj)).getValue();
        if (((GetCheckinResponse) (obj)).status != GetCheckinResponse.Status.OK) goto _L5; else goto _L4
_L4:
        successCache.put(s, obj);
_L7:
        hashmap.put(s, obj);
          goto _L6
        collection;
        flag = true;
        EventLog.w("CheckinNearMeCache", "Unable to retrieve checkin data", collection);
_L2:
        if (flag)
        {
            for (collection = arraylist.iterator(); collection.hasNext(); hashmap.put((String)collection.next(), GetCheckinResponse.forMissing())) { }
        }
        break MISSING_BLOCK_LABEL_330;
_L5:
        failureCache.put(s, obj);
          goto _L7
        collection;
        flag = true;
        EventLog.w("CheckinNearMeCache", "Unable to retrieve checkin data", collection);
          goto _L2
        return hashmap;
          goto _L7
    }
}
