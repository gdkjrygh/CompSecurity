// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.net.URL;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.internal:
//            zzbt

static class zztz
{

    private final String zztw;
    private final URL zztx;
    private final ArrayList zzty;
    private final String zztz;

    public String zzcR()
    {
        return zztw;
    }

    public URL zzcS()
    {
        return zztx;
    }

    public ArrayList zzcT()
    {
        return zzty;
    }

    public String zzcU()
    {
        return zztz;
    }

    public (String s, URL url, ArrayList arraylist, String s1)
    {
        zztw = s;
        zztx = url;
        if (arraylist == null)
        {
            zzty = new ArrayList();
        } else
        {
            zzty = arraylist;
        }
        zztz = s1;
    }
}
