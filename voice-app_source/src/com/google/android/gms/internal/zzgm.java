// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


public class zzgm extends com.google.android.gms.ads.internal.reward.client.zza.zza
{

    private final int zzEL;
    private final String zzEl;

    public zzgm(String s, int i)
    {
        zzEl = s;
        zzEL = i;
    }

    public int getAmount()
    {
        return zzEL;
    }

    public String getType()
    {
        return zzEl;
    }
}
