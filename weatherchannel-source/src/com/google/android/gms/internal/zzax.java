// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import org.json.JSONObject;

public final class zzax
{

    private final String zzqo;
    private final JSONObject zzqp;
    private final String zzqq;
    private final String zzqr;
    private final boolean zzqs;

    public zzax(String s, VersionInfoParcel versioninfoparcel, String s1, JSONObject jsonobject, boolean flag)
    {
        zzqr = versioninfoparcel.zzGG;
        zzqp = jsonobject;
        zzqq = s;
        zzqo = s1;
        zzqs = flag;
    }

    public String zzbQ()
    {
        return zzqo;
    }

    public String zzbR()
    {
        return zzqr;
    }

    public JSONObject zzbS()
    {
        return zzqp;
    }

    public String zzbT()
    {
        return zzqq;
    }

    public boolean zzbU()
    {
        return zzqs;
    }
}
