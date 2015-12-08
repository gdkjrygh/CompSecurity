// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.cast.internal.zzb;
import com.google.android.gms.cast.internal.zze;
import com.google.android.gms.cast.internal.zzo;

// Referenced classes of package com.google.android.gms.internal:
//            zzjs

public abstract class piClient extends zzb
{

    final zzjs zzTB;
    protected zzo zzTa;

    public abstract void execute();

    protected void zza(zze zze1)
    {
        execute();
    }

    protected volatile void zza(com.google.android.gms.common.api.t t)
        throws RemoteException
    {
        zza((zze)t);
    }

    public zzo zzlA()
    {
        return zzTa;
    }

    public piClient(zzjs zzjs1)
    {
        zzTB = zzjs1;
        super(com.google.android.gms.internal.zzjs.zzb(zzjs1));
    }
}
