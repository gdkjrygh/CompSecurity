// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            zzcd, zzgd

class zztW
    implements Runnable
{

    final String zztT;
    final File zztU;
    final int zztW;
    final zzcd zztX;

    public void run()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("event", "precacheComplete");
        hashmap.put("src", zztT);
        hashmap.put("cachedSrc", zztU.getAbsolutePath());
        hashmap.put("totalBytes", Integer.toString(zztW));
        zzcd.zza(zztX).zzb("onPrecacheEvent", hashmap);
    }

    (zzcd zzcd1, String s, File file, int i)
    {
        zztX = zzcd1;
        zztT = s;
        zztU = file;
        zztW = i;
        super();
    }
}
