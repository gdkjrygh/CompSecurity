// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.dynamic;

import android.app.Activity;
import android.os.Bundle;

// Referenced classes of package com.google.android.gms.dynamic:
//            zza, LifecycleDelegate

class zzajo
    implements a
{

    final zza zzajl;
    final Activity zzajm;
    final Bundle zzajn;
    final Bundle zzajo;

    public int getState()
    {
        return 0;
    }

    public void zzb(LifecycleDelegate lifecycledelegate)
    {
        zza.zzb(zzajl).onInflate(zzajm, zzajn, zzajo);
    }

    cleDelegate(zza zza1, Activity activity, Bundle bundle, Bundle bundle1)
    {
        zzajl = zza1;
        zzajm = activity;
        zzajn = bundle;
        zzajo = bundle1;
        super();
    }
}
