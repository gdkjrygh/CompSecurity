// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.net.URL;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.internal:
//            zzdh

static class zzxb
{

    private final String zzwY;
    private final URL zzwZ;
    private final ArrayList zzxa;
    private final String zzxb;

    public String zzdA()
    {
        return zzwY;
    }

    public URL zzdB()
    {
        return zzwZ;
    }

    public ArrayList zzdC()
    {
        return zzxa;
    }

    public String zzdD()
    {
        return zzxb;
    }

    public (String s, URL url, ArrayList arraylist, String s1)
    {
        zzwY = s;
        zzwZ = url;
        if (arraylist == null)
        {
            zzxa = new ArrayList();
        } else
        {
            zzxa = arraylist;
        }
        zzxb = s1;
    }
}
