// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzb;

// Referenced classes of package com.google.android.gms.internal:
//            zzem, zzeh

class zzyj
    implements Runnable
{

    final zzem zzyj;

    public void run()
    {
        try
        {
            zzem.zza(zzyj).onAdClosed();
            return;
        }
        catch (RemoteException remoteexception)
        {
            zzb.zzd("Could not call onAdClosed.", remoteexception);
        }
    }

    l.client.zzb(zzem zzem1)
    {
        zzyj = zzem1;
        super();
    }
}
