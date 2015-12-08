// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.legacy.model;

import com.google.android.apps.youtube.datalib.legacy.a.a;
import com.google.android.apps.youtube.datalib.legacy.a.b;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.apps.youtube.datalib.legacy.model:
//            InfoCard

public final class g extends b
{

    private InfoCard a;

    public g()
    {
    }

    public g(InfoCard infocard)
    {
        a = infocard;
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
            return new InfoCard(jsonobject.getInt("type"), a(jsonobject.getJSONArray("actions")), a(jsonobject.getJSONArray("events")), (InfoCard.InfoCardApp)jsonobject.get("app"), null);
        }
    }

    protected final void a(JSONObject jsonobject)
    {
        jsonobject.put("type", a.getType());
        jsonobject.put("actions", a(a.getActions()));
        jsonobject.put("events", a(a.getEvents()));
        jsonobject.put("app", a.getInfoCardApp());
    }
}
