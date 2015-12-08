// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.text.TextUtils;

class zzaq
{

    private final long zzMb;
    private final long zzaLL;
    private final long zzaLM;
    private String zzaLN;

    zzaq(long l, long l1, long l2)
    {
        zzaLL = l;
        zzMb = l1;
        zzaLM = l2;
    }

    void zzev(String s)
    {
        if (s == null || TextUtils.isEmpty(s.trim()))
        {
            return;
        } else
        {
            zzaLN = s;
            return;
        }
    }

    long zzyO()
    {
        return zzaLL;
    }

    long zzyP()
    {
        return zzaLM;
    }

    String zzyQ()
    {
        return zzaLN;
    }
}
