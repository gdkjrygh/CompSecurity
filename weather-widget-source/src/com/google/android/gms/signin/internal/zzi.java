// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.signin.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.AuthAccountRequest;
import com.google.android.gms.common.internal.BinderWrapper;
import com.google.android.gms.common.internal.ResolveAccountRequest;
import com.google.android.gms.common.internal.ResolveAccountResponse;
import com.google.android.gms.common.internal.zzf;
import com.google.android.gms.common.internal.zzj;
import com.google.android.gms.common.internal.zzp;
import com.google.android.gms.common.internal.zzt;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.signin.zzd;
import com.google.android.gms.signin.zze;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;

// Referenced classes of package com.google.android.gms.signin.internal:
//            zzf, AuthAccountResult, zze, CheckServerAuthResult

public class zzi extends zzj
    implements zzd
{
    private static class zza extends zzd.zza
    {

        private final ExecutorService zzaOo;
        private final zze zzade;

        static com.google.android.gms.common.api.GoogleApiClient.ServerAuthCodeCallbacks zza(zza zza1)
            throws RemoteException
        {
            return zza1.zzzq();
        }

        private com.google.android.gms.common.api.GoogleApiClient.ServerAuthCodeCallbacks zzzq()
            throws RemoteException
        {
            return zzade.zzzq();
        }

        public void zza(String s, String s1, com.google.android.gms.signin.internal.zzf zzf1)
            throws RemoteException
        {
            zzaOo.submit(new Runnable(this, s, s1, zzf1) {

                final String zzaOq;
                final com.google.android.gms.signin.internal.zzf zzaOr;
                final zza zzaOs;
                final String zzaOt;

                public void run()
                {
                    try
                    {
                        boolean flag = zza.zza(zzaOs).onUploadServerAuthCode(zzaOq, zzaOt);
                        zzaOr.zzaq(flag);
                        return;
                    }
                    catch (RemoteException remoteexception)
                    {
                        Log.e("SignInClientImpl", "RemoteException thrown when processing uploadServerAuthCode callback", remoteexception);
                    }
                }

            
            {
                zzaOs = zza1;
                zzaOq = s;
                zzaOt = s1;
                zzaOr = zzf1;
                super();
            }
            });
        }

        public void zza(String s, List list, com.google.android.gms.signin.internal.zzf zzf1)
            throws RemoteException
        {
            zzaOo.submit(new Runnable(this, list, s, zzf1) {

                final List zzaOp;
                final String zzaOq;
                final com.google.android.gms.signin.internal.zzf zzaOr;
                final zza zzaOs;

                public void run()
                {
                    try
                    {
                        Object obj = zza.zza(zzaOs);
                        Set set = Collections.unmodifiableSet(new HashSet(zzaOp));
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
                zzaOs = zza1;
                zzaOp = list;
                zzaOq = s;
                zzaOr = zzf1;
                super();
            }
            });
        }

        public zza(zze zze1, ExecutorService executorservice)
        {
            zzade = zze1;
            zzaOo = executorservice;
        }
    }


    private final zzf zzZH;
    private final boolean zzaOn;
    private final ExecutorService zzaOo;
    private final zze zzade;
    private Integer zzadf;

    public zzi(Context context, Looper looper, boolean flag, zzf zzf1, zze zze1, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener, 
            ExecutorService executorservice)
    {
        super(context, looper, 44, zzf1, connectioncallbacks, onconnectionfailedlistener);
        zzaOn = flag;
        zzZH = zzf1;
        zzade = zzf1.zzoo();
        zzadf = zzf1.zzop();
        zzaOo = executorservice;
    }

    public static Bundle zza(zze zze1, Integer integer, ExecutorService executorservice)
    {
        Bundle bundle = new Bundle();
        bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", zze1.zzzo());
        bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", zze1.zzzp());
        bundle.putString("com.google.android.gms.signin.internal.serverClientId", zze1.zzlG());
        if (zze1.zzzq() != null)
        {
            bundle.putParcelable("com.google.android.gms.signin.internal.signInCallbacks", new BinderWrapper((new zza(zze1, executorservice)).asBinder()));
        }
        if (integer != null)
        {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", integer.intValue());
        }
        return bundle;
    }

    public void connect()
    {
        zza(new com.google.android.gms.common.internal.zzj.zzf(this));
    }

    protected IInterface zzV(IBinder ibinder)
    {
        return zzdI(ibinder);
    }

    public void zza(zzp zzp, Set set, com.google.android.gms.signin.internal.zze zze1)
    {
        zzx.zzb(zze1, "Expecting a valid ISignInCallbacks");
        try
        {
            ((com.google.android.gms.signin.internal.zzf)zzoA()).zza(new AuthAccountRequest(zzp, set), zze1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (zzp zzp)
        {
            Log.w("SignInClientImpl", "Remote service probably died when authAccount is called");
        }
        try
        {
            zze1.zza(new ConnectionResult(8, null), new AuthAccountResult());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (zzp zzp)
        {
            Log.wtf("SignInClientImpl", "ISignInCallbacks#onAuthAccount should be executed from the same process, unexpected RemoteException.");
        }
    }

    public void zza(zzp zzp, boolean flag)
    {
        try
        {
            ((com.google.android.gms.signin.internal.zzf)zzoA()).zza(zzp, zzadf.intValue(), flag);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (zzp zzp)
        {
            Log.w("SignInClientImpl", "Remote service probably died when saveDefaultAccount is called");
        }
    }

    public void zza(zzt zzt1)
    {
        zzx.zzb(zzt1, "Expecting a valid IResolveAccountCallbacks");
        try
        {
            android.accounts.Account account = zzZH.zzog();
            ((com.google.android.gms.signin.internal.zzf)zzoA()).zza(new ResolveAccountRequest(account, zzadf.intValue()), zzt1);
            return;
        }
        catch (RemoteException remoteexception)
        {
            Log.w("SignInClientImpl", "Remote service probably died when resolveAccount is called");
        }
        try
        {
            zzt1.zzb(new ResolveAccountResponse(8));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (zzt zzt1)
        {
            Log.wtf("SignInClientImpl", "IResolveAccountCallbacks#onAccountResolutionComplete should be executed from the same process, unexpected RemoteException.");
        }
    }

    protected com.google.android.gms.signin.internal.zzf zzdI(IBinder ibinder)
    {
        return zzf.zza.zzdH(ibinder);
    }

    protected String zzfA()
    {
        return "com.google.android.gms.signin.service.START";
    }

    protected String zzfB()
    {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    protected Bundle zzli()
    {
        Bundle bundle = zza(zzade, zzZH.zzop(), zzaOo);
        String s = zzZH.zzol();
        if (!getContext().getPackageName().equals(s))
        {
            bundle.putString("com.google.android.gms.signin.internal.realClientPackageName", zzZH.zzol());
        }
        return bundle;
    }

    public boolean zzlm()
    {
        return zzaOn;
    }

    public void zzzn()
    {
        try
        {
            ((com.google.android.gms.signin.internal.zzf)zzoA()).zzja(zzadf.intValue());
            return;
        }
        catch (RemoteException remoteexception)
        {
            Log.w("SignInClientImpl", "Remote service probably died when clearAccountFromSessionStore is called");
        }
    }
}
