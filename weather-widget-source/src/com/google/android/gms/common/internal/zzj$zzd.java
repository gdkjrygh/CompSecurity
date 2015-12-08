// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;

// Referenced classes of package com.google.android.gms.common.internal:
//            zzj, zzx

public static final class zzadK extends zzadK
{

    private zzj zzadJ;
    private final int zzadK;

    private void zzoH()
    {
        zzadJ = null;
    }

    public void zza(int i, IBinder ibinder, Bundle bundle)
    {
        zzx.zzb(zzadJ, "onPostInitComplete can be called only once per call to getRemoteService");
        zzadJ.zza(i, ibinder, bundle, zzadK);
        zzoH();
    }

    public void zzb(int i, Bundle bundle)
    {
        zzx.zzb(zzadJ, "onAccountValidationComplete can be called only once per call to validateAccount");
        zzadJ.zza(i, bundle, zzadK);
        zzoH();
    }

    public (zzj zzj1, int i)
    {
        zzadJ = zzj1;
        zzadK = i;
    }
}
