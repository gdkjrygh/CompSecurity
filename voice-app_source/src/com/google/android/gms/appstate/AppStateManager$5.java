// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.appstate;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.zzjb;

// Referenced classes of package com.google.android.gms.appstate:
//            AppStateManager

static final class b extends b
{

    final int zzOm;

    public Result createFailedResult(Status status)
    {
        return zzf(status);
    }

    protected volatile void zza(com.google.android.gms.common.api.f f)
        throws RemoteException
    {
        zza((zzjb)f);
    }

    protected void zza(zzjb zzjb1)
        throws RemoteException
    {
        zzjb1.zza(this, zzOm);
    }

    public ateDeletedResult zzf(Status status)
    {
        return new AppStateManager.StateDeletedResult(status) {

            final Status zzOl;
            final AppStateManager._cls5 zzOo;

            public int getStateKey()
            {
                return zzOo.zzOm;
            }

            public Status getStatus()
            {
                return zzOl;
            }

            
            {
                zzOo = AppStateManager._cls5.this;
                zzOl = status;
                super();
            }
        };
    }

    _cls1.zzOl(GoogleApiClient googleapiclient, int i)
    {
        zzOm = i;
        super(googleapiclient);
    }
}
