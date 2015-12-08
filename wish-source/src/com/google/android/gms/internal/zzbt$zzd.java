// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            zzbt

static class zzsI
{

    private final String zzsI;
    private final int zztD;
    private final List zztE;
    private final String zztw;

    public String getBody()
    {
        return zzsI;
    }

    public int getResponseCode()
    {
        return zztD;
    }

    public String zzcR()
    {
        return zztw;
    }

    public Iterable zzcW()
    {
        return zztE;
    }

    public (String s, int i, List list, String s1)
    {
        zztw = s;
        zztD = i;
        if (list == null)
        {
            zztE = new ArrayList();
        } else
        {
            zztE = list;
        }
        zzsI = s1;
    }
}
