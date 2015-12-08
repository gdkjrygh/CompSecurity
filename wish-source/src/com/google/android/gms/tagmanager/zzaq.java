// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.text.TextUtils;

class zzaq
{

    private final long zzIf;
    private final long zzaDx;
    private final long zzaDy;
    private String zzaDz;

    zzaq(long l, long l1, long l2)
    {
        zzaDx = l;
        zzIf = l1;
        zzaDy = l2;
    }

    void zzdN(String s)
    {
        if (s == null || TextUtils.isEmpty(s.trim()))
        {
            return;
        } else
        {
            zzaDz = s;
            return;
        }
    }

    long zzwS()
    {
        return zzaDx;
    }

    long zzwT()
    {
        return zzaDy;
    }

    String zzwU()
    {
        return zzaDz;
    }
}
