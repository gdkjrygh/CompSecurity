// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.overlay;

import android.os.Handler;
import com.google.android.gms.internal.zzhu;

// Referenced classes of package com.google.android.gms.ads.internal.overlay:
//            zzk

class zzq
    implements Runnable
{

    private boolean mCancelled;
    private zzk zzAy;

    zzq(zzk zzk1)
    {
        mCancelled = false;
        zzAy = zzk1;
    }

    public void cancel()
    {
        mCancelled = true;
        zzhu.zzHK.removeCallbacks(this);
    }

    public void run()
    {
        if (!mCancelled)
        {
            zzAy.zzeR();
            zzfa();
        }
    }

    public void zzfa()
    {
        zzhu.zzHK.postDelayed(this, 250L);
    }
}
