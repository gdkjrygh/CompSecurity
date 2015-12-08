// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.dynamic;

import android.os.Bundle;

// Referenced classes of package com.google.android.gms.dynamic:
//            zza, LifecycleDelegate

class zzamU
    implements a
{

    final zza zzamR;
    final Bundle zzamU;

    public int getState()
    {
        return 1;
    }

    public void zzb(LifecycleDelegate lifecycledelegate)
    {
        zza.zzb(zzamR).onCreate(zzamU);
    }

    cleDelegate(zza zza1, Bundle bundle)
    {
        zzamR = zza1;
        zzamU = bundle;
        super();
    }
}
