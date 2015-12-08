// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.legacy.model;

import com.google.android.apps.youtube.datalib.legacy.a.a;
import com.google.android.apps.youtube.datalib.legacy.a.b;
import org.json.JSONException;
import org.json.JSONObject;

public final class o extends b
{

    private InfoCard.InfoCardTrackingEvent a;

    public o()
    {
    }

    public o(InfoCard.InfoCardTrackingEvent infocardtrackingevent)
    {
        a = infocardtrackingevent;
    }

    public final int a()
    {
        return 1;
    }

    protected final a a(JSONObject jsonobject, int i)
    {
        if (i != 1)
        {
            throw new JSONException("Unsupported version");
        } else
        {
            return new InfoCard.InfoCardTrackingEvent(jsonobject.getInt("type"), c(jsonobject, "baseUri"));
        }
    }

    protected final void a(JSONObject jsonobject)
    {
        jsonobject.put("type", a.getType());
        jsonobject.put("baseUri", a.getBaseUrl());
    }
}
