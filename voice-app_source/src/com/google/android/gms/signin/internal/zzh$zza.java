// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.signin.internal;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.internal.zzpt;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.ExecutorService;

// Referenced classes of package com.google.android.gms.signin.internal:
//            zzh, zzf, CheckServerAuthResult

private static class zzaKb extends zzaKb
{

    private final zzpt zzZU;
    private final ExecutorService zzaKb;

    static com.google.android.gms.common.api.iClient.ServerAuthCodeCallbacks zza(zzaKb zzakb)
        throws RemoteException
    {
        return zzakb.zzyb();
    }

    private com.google.android.gms.common.api.iClient.ServerAuthCodeCallbacks zzyb()
        throws RemoteException
    {
        return zzZU.zzyb();
    }

    public void zza(String s, String s1, zzf zzf)
        throws RemoteException
    {
        zzaKb.submit(new Runnable(s, s1, zzf) {

            final String zzaKd;
            final zzf zzaKe;
            final zzh.zza zzaKf;
            final String zzaKg;

            public void run()
            {
                try
                {
                    boolean flag = zzh.zza.zza(zzaKf).onUploadServerAuthCode(zzaKd, zzaKg);
                    zzaKe.zzal(flag);
                    return;
                }
                catch (RemoteException remoteexception)
                {
                    Log.e("SignInClientImpl", "RemoteException thrown when processing uploadServerAuthCode callback", remoteexception);
                }
            }

            
            {
                zzaKf = zzh.zza.this;
                zzaKd = s;
                zzaKg = s1;
                zzaKe = zzf1;
                super();
            }
        });
    }

    public void zza(String s, List list, zzf zzf)
        throws RemoteException
    {
        zzaKb.submit(new Runnable(list, s, zzf) {

            final List zzaKc;
            final String zzaKd;
            final zzf zzaKe;
            final zzh.zza zzaKf;

            public void run()
            {
                try
                {
                    Object obj = zzh.zza.zza(zzaKf);
                    java.util.Set set = Collections.unmodifiableSet(new HashSet(zzaKc));
                    obj = ((com.google.android.gms.common.api.GoogleApiClient.ServerAuthCodeCallbacks) (obj)).onCheckServerAuthorization(zzaKd, set);
                    obj = new CheckServerAuthResult(((com.google.android.gms.common.api.GoogleApiClient.ServerAuthCodeCallbacks.CheckResult) (obj)).zzmA(), ((com.google.android.gms.common.api.GoogleApiClient.ServerAuthCodeCallbacks.CheckResult) (obj)).zzmB());
                    zzaKe.zza(((CheckServerAuthResult) (obj)));
                    return;
                }
                catch (RemoteException remoteexception)
                {
                    Log.e("SignInClientImpl", "RemoteException thrown when processing checkServerAuthorization callback", remoteexception);
                }
            }

            
            {
                zzaKf = zzh.zza.this;
                zzaKc = list;
                zzaKd = s;
                zzaKe = zzf1;
                super();
            }
        });
    }

    public _cls2.zzaKe(zzpt zzpt1, ExecutorService executorservice)
    {
        zzZU = zzpt1;
        zzaKb = executorservice;
    }
}
