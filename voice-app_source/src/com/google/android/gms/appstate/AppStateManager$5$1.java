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

class zzOl
    implements eDeletedResult
{

    final Status zzOl;
    final zzOl zzOo;

    public int getStateKey()
    {
        return zzOo.Om;
    }

    public Status getStatus()
    {
        return zzOl;
    }

    <init>(<init> <init>1, Status status)
    {
        zzOo = <init>1;
        zzOl = status;
        super();
    }

    // Unreferenced inner class com/google/android/gms/appstate/AppStateManager$5

/* anonymous class */
    static final class AppStateManager._cls5 extends AppStateManager.zzb
    {

        final int zzOm;

        public Result createFailedResult(Status status)
        {
            return zzf(status);
        }

        protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
            throws RemoteException
        {
            zza((zzjb)client);
        }

        protected void zza(zzjb zzjb1)
            throws RemoteException
        {
            zzjb1.zza(this, zzOm);
        }

        public AppStateManager.StateDeletedResult zzf(Status status)
        {
            return new AppStateManager._cls5._cls1(this, status);
        }

            
            {
                zzOm = i;
                super(googleapiclient);
            }
    }

}
