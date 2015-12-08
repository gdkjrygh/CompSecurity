// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.text.TextUtils;

class zzaq
{

    private final long zzOa;
    private final long zzaQf;
    private final long zzaQg;
    private String zzaQh;

    zzaq(long l, long l1, long l2)
    {
        zzaQf = l;
        zzOa = l1;
        zzaQg = l2;
    }

    long zzAe()
    {
        return zzaQf;
    }

    long zzAf()
    {
        return zzaQg;
    }

    String zzAg()
    {
        return zzaQh;
    }

    void zzeK(String s)
    {
        if (s == null || TextUtils.isEmpty(s.trim()))
        {
            return;
        } else
        {
            zzaQh = s;
            return;
        }
    }
}
