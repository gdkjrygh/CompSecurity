// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.dal2.eventlog.batch;

import org.json.JSONException;
import org.json.JSONObject;

public interface Batchable
{

    public abstract JSONObject toJson()
        throws JSONException;
}
