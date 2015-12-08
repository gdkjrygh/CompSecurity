// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.legacy.model;

import com.google.android.apps.youtube.datalib.legacy.a.a;
import com.google.android.apps.youtube.datalib.legacy.a.b;
import org.json.JSONException;
import org.json.JSONObject;

public final class bd extends b
{

    private VastAd.ProgressPing a;

    public bd()
    {
    }

    public bd(VastAd.ProgressPing progressping)
    {
        a = progressping;
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
            return new VastAd.ProgressPing(jsonobject.getInt("offset"), jsonobject.getBoolean("isPercentageOffset"), c(jsonobject, "pingUri"));
        }
    }

    protected final void a(JSONObject jsonobject)
    {
        jsonobject.put("offset", a.getOffset());
        jsonobject.put("isPercentageOffset", a.isPercentageOffset());
        a(jsonobject, "pingUri", a.getPingUri());
    }
}
