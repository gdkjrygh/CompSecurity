// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzb;

// Referenced classes of package com.google.android.gms.internal:
//            zzet, zzeu, zzej

class zzzf
    implements Runnable
{

    final zzet zzze;
    final com.google.ads.st.ErrorCode zzzf;

    public void run()
    {
        try
        {
            zzet.zza(zzze).onAdFailedToLoad(zzeu.zza(zzzf));
            return;
        }
        catch (RemoteException remoteexception)
        {
            zzb.zzd("Could not call onAdFailedToLoad.", remoteexception);
        }
    }

    l.client.zzb(zzet zzet1, com.google.ads.st.ErrorCode errorcode)
    {
        zzze = zzet1;
        zzzf = errorcode;
        super();
    }
}
