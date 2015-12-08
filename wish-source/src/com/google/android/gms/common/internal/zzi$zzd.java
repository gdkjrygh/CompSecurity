// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;

// Referenced classes of package com.google.android.gms.common.internal:
//            zzi, zzv

public static final class zzTB extends zzTB
{

    private zzi zzTB;

    private void zzmd()
    {
        zzTB = null;
    }

    public void zzb(int i, IBinder ibinder, Bundle bundle)
    {
        zzv.zzb(zzTB, "onPostInitComplete can be called only once per call to getRemoteService");
        zzTB.zza(i, ibinder, bundle);
        zzmd();
    }

    public void zzc(int i, Bundle bundle)
    {
        zzv.zzb(zzTB, "onAccountValidationComplete can be called only once per call to validateAccount");
        zzTB.zzb(i, bundle);
        zzmd();
    }

    public (zzi zzi1)
    {
        zzTB = zzi1;
    }
}
