// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.internal.zzx;
import java.util.concurrent.atomic.AtomicReference;

// Referenced classes of package com.google.android.gms.common.api:
//            zza, zzc, GoogleApiClient, Status, 
//            Result

public static abstract class .zzv extends zza
    implements .zzv, .zzv
{

    private final zzb zzXW;
    private AtomicReference zzYO;

    private void zza(RemoteException remoteexception)
    {
        zzx(new Status(8, remoteexception.getLocalizedMessage(), null));
    }

    protected abstract void zza(sage sage)
        throws RemoteException;

    public void zza(sage sage)
    {
        zzYO.set(sage);
    }

    public final void zzb(e.set set)
        throws DeadObjectException
    {
        try
        {
            zza(set);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (e.set set)
        {
            zza(set);
            throw set;
        }
        // Misplaced declaration of an exception variable
        catch (e.set set)
        {
            zza(set);
        }
    }

    protected void zzmZ()
    {
        zza zza1 = (zza)zzYO.getAndSet(null);
        if (zza1 != null)
        {
            zza1.zzc(this);
        }
    }

    public void zzn(Object obj)
    {
        super.zza((Result)obj);
    }

    public final zzc zznd()
    {
        return zzXW;
    }

    public int zzng()
    {
        return 0;
    }

    public final void zzx(Status status)
    {
        boolean flag;
        if (!status.isSuccess())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.google.android.gms.common.internal.zzx.zzb(flag, "Failed result must not be success");
        zza(zzb(status));
    }

    protected iClient(iClient iclient, GoogleApiClient googleapiclient)
    {
        super(((GoogleApiClient)com.google.android.gms.common.internal.zzx.zzb(googleapiclient, "GoogleApiClient must not be null")).getLooper());
        zzYO = new AtomicReference();
        zzXW = (zzXW)com.google.android.gms.common.internal.zzx.zzv(iclient);
    }
}
