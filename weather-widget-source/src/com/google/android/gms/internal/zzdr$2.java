// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            zzdr, zzip

class zzxy
    implements Runnable
{

    final zzdr zzxA;
    final String zzxv;
    final String zzxw;
    final int zzxy;

    public void run()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("event", "precacheComplete");
        hashmap.put("src", zzxv);
        hashmap.put("cachedSrc", zzxw);
        hashmap.put("totalBytes", Integer.toString(zzxy));
        zzxA.zzoL.zzc("onPrecacheEvent", hashmap);
    }

    (zzdr zzdr1, String s, String s1, int i)
    {
        zzxA = zzdr1;
        zzxv = s;
        zzxw = s1;
        zzxy = i;
        super();
    }
}
