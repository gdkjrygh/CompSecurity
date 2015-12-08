// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.dynamic;

import java.util.Iterator;
import java.util.LinkedList;

// Referenced classes of package com.google.android.gms.dynamic:
//            zzf, zza, LifecycleDelegate

class zzamR
    implements zzf
{

    final zza zzamR;

    public void zza(LifecycleDelegate lifecycledelegate)
    {
        com.google.android.gms.dynamic.zza.zza(zzamR, lifecycledelegate);
        for (lifecycledelegate = com.google.android.gms.dynamic.zza.zza(zzamR).iterator(); lifecycledelegate.hasNext(); ((a)lifecycledelegate.next()).zzb(com.google.android.gms.dynamic.zza.zzb(zzamR))) { }
        com.google.android.gms.dynamic.zza.zza(zzamR).clear();
        com.google.android.gms.dynamic.zza.zza(zzamR, null);
    }

    cleDelegate(zza zza1)
    {
        zzamR = zza1;
        super();
    }
}
