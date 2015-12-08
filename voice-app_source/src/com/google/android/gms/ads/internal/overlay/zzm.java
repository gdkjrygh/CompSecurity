// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.overlay;

import android.os.Handler;
import com.google.android.gms.internal.zzhl;

// Referenced classes of package com.google.android.gms.ads.internal.overlay:
//            zzh

class zzm
    implements Runnable
{

    private boolean zzAq;
    private zzh zzzl;

    zzm(zzh zzh1)
    {
        zzAq = false;
        zzzl = zzh1;
    }

    public void cancel()
    {
        zzAq = true;
        zzhl.zzGk.removeCallbacks(this);
    }

    public void run()
    {
        if (!zzAq)
        {
            zzzl.zzeL();
            zzeY();
        }
    }

    public void zzeY()
    {
        zzhl.zzGk.postDelayed(this, 250L);
    }
}
