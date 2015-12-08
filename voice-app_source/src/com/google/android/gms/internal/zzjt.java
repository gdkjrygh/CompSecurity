// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import org.json.JSONException;
import org.json.JSONObject;

public final class zzjt
{

    private final String zzTO;
    private final int zzTP;
    private final String zzTQ;

    public zzjt(String s, int i, String s1)
    {
        zzTO = s;
        zzTP = i;
        zzTQ = s1;
    }

    public zzjt(JSONObject jsonobject)
        throws JSONException
    {
        this(jsonobject.optString("applicationName"), jsonobject.optInt("maxPlayers"), jsonobject.optString("version"));
    }

    public final int getMaxPlayers()
    {
        return zzTP;
    }

    public final String getVersion()
    {
        return zzTQ;
    }

    public final String zzlB()
    {
        return zzTO;
    }
}
