// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.dynamic;

import android.app.Activity;
import android.os.Bundle;

// Referenced classes of package com.google.android.gms.dynamic:
//            zza, LifecycleDelegate

class zzamU
    implements a
{

    final zza zzamR;
    final Activity zzamS;
    final Bundle zzamT;
    final Bundle zzamU;

    public int getState()
    {
        return 0;
    }

    public void zzb(LifecycleDelegate lifecycledelegate)
    {
        zza.zzb(zzamR).onInflate(zzamS, zzamT, zzamU);
    }

    cleDelegate(zza zza1, Activity activity, Bundle bundle, Bundle bundle1)
    {
        zzamR = zza1;
        zzamS = activity;
        zzamT = bundle;
        zzamU = bundle1;
        super();
    }
}
