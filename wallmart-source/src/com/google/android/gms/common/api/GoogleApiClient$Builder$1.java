// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;

// Referenced classes of package com.google.android.gms.common.api:
//            GoogleApiClient, zzp

class zzVc
    implements Runnable
{

    final GoogleApiClient zzVc;
    final zzVc zzZn;

    public void run()
    {
        if (a(zzZn).isFinishing() || a(zzZn).getSupportFragmentManager().isDestroyed())
        {
            return;
        } else
        {
            a(zzZn, zzp.zzb(a(zzZn)), zzVc);
            return;
        }
    }

    A(A a, GoogleApiClient googleapiclient)
    {
        zzZn = a;
        zzVc = googleapiclient;
        super();
    }
}
