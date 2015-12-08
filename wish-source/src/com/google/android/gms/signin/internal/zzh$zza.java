// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.signin.internal;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.internal.zzme;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.ExecutorService;

// Referenced classes of package com.google.android.gms.signin.internal:
//            zzh, zzf, CheckServerAuthResult

private static class zzaBN extends zzaBN
{

    private final zzme zzSY;
    private final ExecutorService zzaBN;

    static com.google.android.gms.common.api.iClient.ServerAuthCodeCallbacks zza(zzaBN zzabn)
        throws RemoteException
    {
        return zzabn.zzwf();
    }

    private com.google.android.gms.common.api.iClient.ServerAuthCodeCallbacks zzwf()
        throws RemoteException
    {
        return zzSY.zzwf();
    }

    public void zza(String s, String s1, zzf zzf)
        throws RemoteException
    {
        zzaBN.submit(new Runnable(s, s1, zzf) {

            final String zzaBP;
            final zzf zzaBQ;
            final zzh.zza zzaBR;
            final String zzaBS;

            public void run()
            {
                try
                {
                    boolean flag = zzh.zza.zza(zzaBR).onUploadServerAuthCode(zzaBP, zzaBS);
                    zzaBQ.zzag(flag);
                    return;
                }
                catch (RemoteException remoteexception)
                {
                    Log.e("SignInClientImpl", "RemoteException thrown when processing uploadServerAuthCode callback", remoteexception);
                }
            }

            
            {
                zzaBR = zzh.zza.this;
                zzaBP = s;
                zzaBS = s1;
                zzaBQ = zzf1;
                super();
            }
        });
    }

    public void zza(String s, List list, zzf zzf)
        throws RemoteException
    {
        zzaBN.submit(new Runnable(list, s, zzf) {

            final List zzaBO;
            final String zzaBP;
            final zzf zzaBQ;
            final zzh.zza zzaBR;

            public void run()
            {
                try
                {
                    Object obj = zzh.zza.zza(zzaBR);
                    java.util.Set set = Collections.unmodifiableSet(new HashSet(zzaBO));
                    obj = ((com.google.android.gms.common.api.GoogleApiClient.ServerAuthCodeCallbacks) (obj)).onCheckServerAuthorization(zzaBP, set);
                    obj = new CheckServerAuthResult(((com.google.android.gms.common.api.GoogleApiClient.ServerAuthCodeCallbacks.CheckResult) (obj)).zzkM(), ((com.google.android.gms.common.api.GoogleApiClient.ServerAuthCodeCallbacks.CheckResult) (obj)).zzkN());
                    zzaBQ.zza(((CheckServerAuthResult) (obj)));
                    return;
                }
                catch (RemoteException remoteexception)
                {
                    Log.e("SignInClientImpl", "RemoteException thrown when processing checkServerAuthorization callback", remoteexception);
                }
            }

            
            {
                zzaBR = zzh.zza.this;
                zzaBO = list;
                zzaBP = s;
                zzaBQ = zzf1;
                super();
            }
        });
    }

    public _cls2.zzaBQ(zzme zzme1, ExecutorService executorservice)
    {
        zzSY = zzme1;
        zzaBN = executorservice;
    }
}
