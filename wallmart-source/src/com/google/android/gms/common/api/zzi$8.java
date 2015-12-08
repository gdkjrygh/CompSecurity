// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;

// Referenced classes of package com.google.android.gms.common.api:
//            zzi, zzp

class zzaav
    implements Runnable
{

    final zzi zzaap;
    final FragmentActivity zzaav;

    public void run()
    {
        if (zzaav.isFinishing() || zzaav.getSupportFragmentManager().isDestroyed())
        {
            return;
        } else
        {
            zzp.zzb(zzaav).zzbi(zzi.zze(zzaap));
            return;
        }
    }

    (zzi zzi1, FragmentActivity fragmentactivity)
    {
        zzaap = zzi1;
        zzaav = fragmentactivity;
        super();
    }
}
