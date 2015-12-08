// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.legacy.model;

import com.google.android.apps.youtube.datalib.legacy.a.a;
import com.google.android.apps.youtube.datalib.legacy.a.b;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.apps.youtube.datalib.legacy.model:
//            TrackingPingAuthenticationSettings

public final class ay extends b
{

    private TrackingPingAuthenticationSettings a;

    public ay()
    {
    }

    public ay(TrackingPingAuthenticationSettings trackingpingauthenticationsettings)
    {
        a = trackingpingauthenticationsettings;
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
            return new TrackingPingAuthenticationSettings(jsonobject.getString("urlMatchRegex"), jsonobject.getBoolean("shouldAddVisitorId"), jsonobject.getBoolean("shouldAddUserAuth"));
        }
    }

    protected final void a(JSONObject jsonobject)
    {
        jsonobject.put("urlMatchRegex", a.getUrlMatchPattern().pattern());
        jsonobject.put("shouldAddVisitorId", a.shouldAddVisitorId());
        jsonobject.put("shouldAddUserAuth", a.shouldAddUserAuth());
    }
}
