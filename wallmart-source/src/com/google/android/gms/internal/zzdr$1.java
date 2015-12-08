// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            zzdr, zzip

class zzxz
    implements Runnable
{

    final zzdr zzxA;
    final String zzxv;
    final String zzxw;
    final int zzxx;
    final int zzxy;
    final boolean zzxz;

    public void run()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("event", "precacheProgress");
        hashmap.put("src", zzxv);
        hashmap.put("cachedSrc", zzxw);
        hashmap.put("bytesLoaded", Integer.toString(zzxx));
        hashmap.put("totalBytes", Integer.toString(zzxy));
        String s;
        if (zzxz)
        {
            s = "1";
        } else
        {
            s = "0";
        }
        hashmap.put("cacheReady", s);
        zzxA.zzoL.zzc("onPrecacheEvent", hashmap);
    }

    (zzdr zzdr1, String s, String s1, int i, int j, boolean flag)
    {
        zzxA = zzdr1;
        zzxv = s;
        zzxw = s1;
        zzxx = i;
        zzxy = j;
        zzxz = flag;
        super();
    }
}
