// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import org.json.JSONObject;

public final class zzu
{

    private final String zznZ;
    private final JSONObject zzoa;
    private final String zzob;
    private final String zzoc;
    private final boolean zzod;

    public zzu(String s, VersionInfoParcel versioninfoparcel, String s1, JSONObject jsonobject, boolean flag)
    {
        zzoc = versioninfoparcel.zzCI;
        zzoa = jsonobject;
        zzob = s;
        zznZ = s1;
        zzod = flag;
    }

    public String zzbc()
    {
        return zznZ;
    }

    public String zzbd()
    {
        return zzoc;
    }

    public JSONObject zzbe()
    {
        return zzoa;
    }

    public String zzbf()
    {
        return zzob;
    }

    public boolean zzbg()
    {
        return zzod;
    }
}
