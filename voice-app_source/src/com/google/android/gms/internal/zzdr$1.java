// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            zzdr, zzid

class zzwM
    implements Runnable
{

    final String zzwJ;
    final File zzwK;
    final int zzwL;
    final int zzwM;
    final zzdr zzwN;

    public void run()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("event", "precacheProgress");
        hashmap.put("src", zzwJ);
        hashmap.put("cachedSrc", zzwK.getAbsolutePath());
        hashmap.put("bytesLoaded", Integer.toString(zzwL));
        hashmap.put("totalBytes", Integer.toString(zzwM));
        zzdr.zza(zzwN).zzc("onPrecacheEvent", hashmap);
    }

    (zzdr zzdr1, String s, File file, int i, int j)
    {
        zzwN = zzdr1;
        zzwJ = s;
        zzwK = file;
        zzwL = i;
        zzwM = j;
        super();
    }
}
