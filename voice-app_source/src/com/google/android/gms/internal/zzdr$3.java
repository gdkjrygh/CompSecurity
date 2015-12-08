// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            zzdr, zzid

class zzwK
    implements Runnable
{

    final String zzwJ;
    final File zzwK;
    final zzdr zzwN;

    public void run()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("event", "precacheCanceled");
        hashmap.put("src", zzwJ);
        if (zzwK != null)
        {
            hashmap.put("cachedSrc", zzwK.getAbsolutePath());
        }
        zzdr.zza(zzwN).zzc("onPrecacheEvent", hashmap);
    }

    (zzdr zzdr1, String s, File file)
    {
        zzwN = zzdr1;
        zzwJ = s;
        zzwK = file;
        super();
    }
}
