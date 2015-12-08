// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.legacy.model;

import com.google.android.apps.youtube.datalib.legacy.a.a;
import com.google.android.apps.youtube.datalib.legacy.a.b;
import org.json.JSONException;
import org.json.JSONObject;

public final class j extends b
{

    private InfoCard.InfoCardAction a;

    public j()
    {
    }

    public j(InfoCard.InfoCardAction infocardaction)
    {
        a = infocardaction;
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
            return new InfoCard.InfoCardAction(jsonobject.getInt("type"), c(jsonobject, "linkUrl"), jsonobject.getString("title"), d(jsonobject, "trackingUris"));
        }
    }

    protected final void a(JSONObject jsonobject)
    {
        jsonobject.put("type", a.getType());
        jsonobject.put("linkUrl", a.getLinkUrl());
        jsonobject.put("title", a.getTitle());
        b(jsonobject, "trackingUris", a.getActionTrackingUris());
    }
}
