// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzb;

// Referenced classes of package com.google.android.gms.internal:
//            zzdy, zzee, zzei

class zzyi
    implements Runnable
{

    final zzee zzyi;
    final zzdy zzyj;

    public void run()
    {
        try
        {
            zzyi.zzyR.destroy();
            return;
        }
        catch (RemoteException remoteexception)
        {
            zzb.zzd("Could not destroy mediation adapter.", remoteexception);
        }
    }

    l.client.zzb(zzdy zzdy1, zzee zzee1)
    {
        zzyj = zzdy1;
        zzyi = zzee1;
        super();
    }
}
