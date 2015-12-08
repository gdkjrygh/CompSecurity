// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzb;

// Referenced classes of package com.google.android.gms.internal:
//            zzem, zzen, zzeh

class zzyk
    implements Runnable
{

    final zzem zzyj;
    final com.google.ads.t.ErrorCode zzyk;

    public void run()
    {
        try
        {
            zzem.zza(zzyj).onAdFailedToLoad(zzen.zza(zzyk));
            return;
        }
        catch (RemoteException remoteexception)
        {
            zzb.zzd("Could not call onAdFailedToLoad.", remoteexception);
        }
    }

    .client.zzb(zzem zzem1, com.google.ads.t.ErrorCode errorcode)
    {
        zzyj = zzem1;
        zzyk = errorcode;
        super();
    }
}
