// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;

// Referenced classes of package com.google.android.gms.common.internal:
//            zzi, zzu

public static final class zzaaA extends zzaaA
{

    private final int zzaaA;
    private zzi zzaaz;

    private void zznS()
    {
        zzaaz = null;
    }

    public void zza(int i, IBinder ibinder, Bundle bundle)
    {
        zzu.zzb(zzaaz, "onPostInitComplete can be called only once per call to getRemoteService");
        zzaaz.zza(i, ibinder, bundle, zzaaA);
        zznS();
    }

    public void zzb(int i, Bundle bundle)
    {
        zzu.zzb(zzaaz, "onAccountValidationComplete can be called only once per call to validateAccount");
        zzaaz.zza(i, bundle, zzaaA);
        zznS();
    }

    public (zzi zzi1, int i)
    {
        zzaaz = zzi1;
        zzaaA = i;
    }
}
