// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.dal2.eventlog.batch;

import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.weather.dal2.eventlog.batch:
//            Batchable

public interface BatchedItemFactory
{

    public abstract Batchable create(JSONObject jsonobject)
        throws JSONException;
}
