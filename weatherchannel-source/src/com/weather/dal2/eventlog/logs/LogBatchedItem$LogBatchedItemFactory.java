// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.dal2.eventlog.logs;

import com.weather.dal2.eventlog.batch.Batchable;
import com.weather.dal2.eventlog.batch.BatchedItemFactory;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.weather.dal2.eventlog.logs:
//            LogBatchedItem

static class I
    implements BatchedItemFactory
{

    public volatile Batchable create(JSONObject jsonobject)
        throws JSONException
    {
        return create(jsonobject);
    }

    public LogBatchedItem create(JSONObject jsonobject)
        throws JSONException
    {
        return new LogBatchedItem(jsonobject);
    }

    I()
    {
    }
}
