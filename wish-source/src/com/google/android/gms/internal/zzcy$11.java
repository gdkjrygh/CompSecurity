// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzb;

// Referenced classes of package com.google.android.gms.internal:
//            zzcy, zzct

class zzve
    implements Runnable
{

    final zzcy zzve;

    public void run()
    {
        try
        {
            zzcy.zza(zzve).onAdLeftApplication();
            return;
        }
        catch (RemoteException remoteexception)
        {
            zzb.zzd("Could not call onAdLeftApplication.", remoteexception);
        }
    }

    .client.zzb(zzcy zzcy1)
    {
        zzve = zzcy1;
        super();
    }
}
