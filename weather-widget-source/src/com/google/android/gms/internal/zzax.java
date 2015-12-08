// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import org.json.JSONObject;

public final class zzax
{

    private final String zzqH;
    private final JSONObject zzqI;
    private final String zzqJ;
    private final String zzqK;
    private final boolean zzqL;

    public zzax(String s, VersionInfoParcel versioninfoparcel, String s1, JSONObject jsonobject, boolean flag)
    {
        zzqK = versioninfoparcel.zzIz;
        zzqI = jsonobject;
        zzqJ = s;
        zzqH = s1;
        zzqL = flag;
    }

    public String zzbU()
    {
        return zzqH;
    }

    public String zzbV()
    {
        return zzqK;
    }

    public JSONObject zzbW()
    {
        return zzqI;
    }

    public String zzbX()
    {
        return zzqJ;
    }

    public boolean zzbY()
    {
        return zzqL;
    }
}
