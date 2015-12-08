// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.legacy.model;

import android.net.Uri;
import com.google.android.apps.youtube.datalib.legacy.a.a;
import com.google.android.apps.youtube.datalib.legacy.a.b;
import org.json.JSONException;
import org.json.JSONObject;

public final class m extends b
{

    private InfoCard.InfoCardApp a;

    public m()
    {
    }

    public m(InfoCard.InfoCardApp infocardapp)
    {
        a = infocardapp;
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
            return new InfoCard.InfoCardApp(jsonobject.getString("name"), c(jsonobject, "icon"), jsonobject.getString("price"), jsonobject.getBoolean("rating"), (float)jsonobject.getDouble("rating"), c(jsonobject, "ratingImage"), jsonobject.getInt("reviews"));
        }
    }

    protected final void a(JSONObject jsonobject)
    {
        jsonobject.put("name", a.getAppName());
        jsonobject.put("icon", a.getIcon());
        jsonobject.put("price", a.getPrice());
        jsonobject.put("hasRating", a.hasRating());
        jsonobject.put("rating", a.getRating());
        jsonobject.put("ratingImage", a.getRatingImageUri().toString());
        jsonobject.put("reviews", a.getReviewCount());
    }
}
