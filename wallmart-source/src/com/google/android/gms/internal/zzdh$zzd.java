// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            zzdh

static class zzvM
{

    private final String zzvM;
    private final String zzwY;
    private final int zzxf;
    private final List zzxg;

    public String getBody()
    {
        return zzvM;
    }

    public int getResponseCode()
    {
        return zzxf;
    }

    public String zzdA()
    {
        return zzwY;
    }

    public Iterable zzdF()
    {
        return zzxg;
    }

    public (String s, int i, List list, String s1)
    {
        zzwY = s;
        zzxf = i;
        if (list == null)
        {
            zzxg = new ArrayList();
        } else
        {
            zzxg = list;
        }
        zzvM = s1;
    }
}
