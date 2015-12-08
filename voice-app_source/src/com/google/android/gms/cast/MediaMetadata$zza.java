// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast;

import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.gms.cast:
//            MediaMetadata

private static class 
{

    private final Map zzRP = new HashMap();
    private final Map zzRQ = new HashMap();
    private final Map zzRR = new HashMap();

    public  zzb(String s, String s1, int i)
    {
        zzRP.put(s, s1);
        zzRQ.put(s1, s);
        zzRR.put(s, Integer.valueOf(i));
        return this;
    }

    public String zzbw(String s)
    {
        return (String)zzRP.get(s);
    }

    public String zzbx(String s)
    {
        return (String)zzRQ.get(s);
    }

    public int zzby(String s)
    {
        s = (Integer)zzRR.get(s);
        if (s != null)
        {
            return s.intValue();
        } else
        {
            return 0;
        }
    }

    public ()
    {
    }
}
