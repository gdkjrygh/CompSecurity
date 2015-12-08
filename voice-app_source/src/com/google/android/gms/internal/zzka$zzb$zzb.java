// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.cast.internal.zzl;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.internal:
//            zzka

protected final class  extends 
{

    final  zzVA;

    public void onDisconnected()
        throws RemoteException
    {
        zzka.zzln().zzb("onDisconnected", new Object[0]);
        zzka.zza(zzVA.);
        zzVA.esult(new t>(Status.zzXP));
    }

    public void onError(int i)
        throws RemoteException
    {
        zzka.zzln().zzb("onError: %d", new Object[] {
            Integer.valueOf(i)
        });
        zzka.zza(zzVA.);
        zzVA.esult(new t>(Status.zzXR));
    }

    protected ( )
    {
        zzVA = ;
        super(., null);
    }
}
