// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.api.data;

import com.contextlogic.wish.api.core.ApiMalformedDataException;
import java.io.Serializable;
import java.util.EnumMap;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.contextlogic.wish.api.data:
//            DealDashPageInfo

public class DealDashInfo
    implements Serializable
{

    private static final long serialVersionUID = 0x28498585500d66f4L;
    private long checkoutTime;
    private EnumMap pageMap;
    private long playTime;
    private long referenceTime;
    private long timeElapsed;
    private long waitTime;

    public DealDashInfo(JSONObject jsonobject)
        throws ApiMalformedDataException
    {
        pageMap = new EnumMap(com/contextlogic/wish/api/data/DealDashPageInfo$PAGE);
        if (!jsonobject.has("view_info") || jsonobject.isNull("view_info")) goto _L2; else goto _L1
_L1:
        JSONArray jsonarray;
        DealDashPageInfo.PAGE apage[];
        int l;
        jsonarray = jsonobject.getJSONArray("view_info");
        apage = DealDashPageInfo.PAGE.values();
        l = apage.length;
        int i;
        int j;
        j = 0;
        i = 0;
_L4:
        DealDashPageInfo.PAGE page;
        if (j < l)
        {
            page = apage[j];
            break MISSING_BLOCK_LABEL_69;
        }
_L2:
        if (jsonobject.has("constants") && !jsonobject.isNull("constants"))
        {
            JSONObject jsonobject1 = jsonobject.getJSONObject("constants");
            waitTime = jsonobject1.getLong("wait_time");
            playTime = jsonobject1.getLong("play_time");
            checkoutTime = jsonobject1.getLong("checkout_time");
        }
        if (jsonobject.has("time_elapsed") && !jsonobject.isNull("time_elapsed"))
        {
            timeElapsed = jsonobject.getLong("time_elapsed");
            referenceTime = System.nanoTime();
        }
        return;
        if (i < jsonarray.length())
        {
            int k = i + 1;
            try
            {
                DealDashPageInfo dealdashpageinfo = new DealDashPageInfo(jsonarray.getJSONObject(i));
                pageMap.put(page, dealdashpageinfo);
            }
            // Misplaced declaration of an exception variable
            catch (JSONObject jsonobject)
            {
                throw new ApiMalformedDataException(jsonobject.getMessage());
            }
            i = k;
        }
        j++;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public EnumMap getPageMap()
    {
        return pageMap;
    }

    public long getPlayTime()
    {
        return playTime;
    }

    public long getTimeElapsed()
    {
        return timeElapsed + TimeUnit.SECONDS.convert(System.nanoTime() - referenceTime, TimeUnit.NANOSECONDS);
    }

    public long getWaitTime()
    {
        return waitTime;
    }
}
