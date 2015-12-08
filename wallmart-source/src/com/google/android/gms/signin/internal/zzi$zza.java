// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.signin.internal;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.signin.zze;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.ExecutorService;

// Referenced classes of package com.google.android.gms.signin.internal:
//            zzi, zzf, CheckServerAuthResult

private static class zzaOo extends zzaOo
{

    private final ExecutorService zzaOo;
    private final zze zzade;

    static com.google.android.gms.common.api.iClient.ServerAuthCodeCallbacks zza(zzaOo zzaoo)
        throws RemoteException
    {
        return zzaoo.zzzq();
    }

    private com.google.android.gms.common.api.iClient.ServerAuthCodeCallbacks zzzq()
        throws RemoteException
    {
        return zzade.zzzq();
    }

    public void zza(String s, String s1, zzf zzf)
        throws RemoteException
    {
        zzaOo.submit(new Runnable(s, s1, zzf) {

            final String zzaOq;
            final zzf zzaOr;
            final zzi.zza zzaOs;
            final String zzaOt;

            public void run()
            {
                try
                {
                    boolean flag = zzi.zza.zza(zzaOs).onUploadServerAuthCode(zzaOq, zzaOt);
                    zzaOr.zzaq(flag);
                    return;
                }
                catch (RemoteException remoteexception)
                {
                    Log.e("SignInClientImpl", "RemoteException thrown when processing uploadServerAuthCode callback", remoteexception);
                }
            }

            
            {
                zzaOs = zzi.zza.this;
                zzaOq = s;
                zzaOt = s1;
                zzaOr = zzf1;
                super();
            }
        });
    }

    public void zza(String s, List list, zzf zzf)
        throws RemoteException
    {
        zzaOo.submit(new Runnable(list, s, zzf) {

            final List zzaOp;
            final String zzaOq;
            final zzf zzaOr;
            final zzi.zza zzaOs;

            public void run()
            {
                try
                {
                    Object obj = zzi.zza.zza(zzaOs);
                    java.util.Set set = Collections.unmodifiableSet(new HashSet(zzaOp));
                    obj = ((com.google.android.gms.common.api.GoogleApiClient.ServerAuthCodeCallbacks) (obj)).onCheckServerAuthorization(zzaOq, set);
                    obj = new CheckServerAuthResult(((com.google.android.gms.common.api.GoogleApiClient.ServerAuthCodeCallbacks.CheckResult) (obj)).zznl(), ((com.google.android.gms.common.api.GoogleApiClient.ServerAuthCodeCallbacks.CheckResult) (obj)).zznm());
                    zzaOr.zza(((CheckServerAuthResult) (obj)));
                    return;
                }
                catch (RemoteException remoteexception)
                {
                    Log.e("SignInClientImpl", "RemoteException thrown when processing checkServerAuthorization callback", remoteexception);
                }
            }

            
            {
                zzaOs = zzi.zza.this;
                zzaOp = list;
                zzaOq = s;
                zzaOr = zzf1;
                super();
            }
        });
    }

    public _cls2.zzaOr(zze zze1, ExecutorService executorservice)
    {
        zzade = zze1;
        zzaOo = executorservice;
    }
}
