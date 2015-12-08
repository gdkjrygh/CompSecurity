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
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.ResolveAccountRequest;
import com.google.android.gms.common.internal.ResolveAccountResponse;
import com.google.android.gms.common.internal.zze;
import com.google.android.gms.common.internal.zzi;
import com.google.android.gms.common.internal.zzq;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.internal.zzps;
import com.google.android.gms.internal.zzpt;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;

// Referenced classes of package com.google.android.gms.signin.internal:
//            zzf, AuthAccountResult, zze, CheckServerAuthResult

public class zzh extends zzi
    implements zzps
{
    private static class zza extends zzd.zza
    {

        private final zzpt zzZU;
        private final ExecutorService zzaKb;

        static com.google.android.gms.common.api.GoogleApiClient.ServerAuthCodeCallbacks zza(zza zza1)
            throws RemoteException
        {
            return zza1.zzyb();
        }

        private com.google.android.gms.common.api.GoogleApiClient.ServerAuthCodeCallbacks zzyb()
            throws RemoteException
        {
            return zzZU.zzyb();
        }

        public void zza(String s, String s1, zzf zzf1)
            throws RemoteException
        {
            zzaKb.submit(new Runnable(this, s, s1, zzf1) {

                final String zzaKd;
                final zzf zzaKe;
                final zza zzaKf;
                final String zzaKg;

                public void run()
                {
                    try
                    {
                        boolean flag = zza.zza(zzaKf).onUploadServerAuthCode(zzaKd, zzaKg);
                        zzaKe.zzal(flag);
                        return;
                    }
                    catch (RemoteException remoteexception)
                    {
                        Log.e("SignInClientImpl", "RemoteException thrown when processing uploadServerAuthCode callback", remoteexception);
                    }
                }

            
            {
                zzaKf = zza1;
                zzaKd = s;
                zzaKg = s1;
                zzaKe = zzf1;
                super();
            }
            });
        }

        public void zza(String s, List list, zzf zzf1)
            throws RemoteException
        {
            zzaKb.submit(new Runnable(this, list, s, zzf1) {

                final List zzaKc;
                final String zzaKd;
                final zzf zzaKe;
                final zza zzaKf;

                public void run()
                {
                    try
                    {
                        Object obj = zza.zza(zzaKf);
                        Set set = Collections.unmodifiableSet(new HashSet(zzaKc));
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
                zzaKf = zza1;
                zzaKc = list;
                zzaKd = s;
                zzaKe = zzf1;
                super();
            }
            });
        }

        public zza(zzpt zzpt1, ExecutorService executorservice)
        {
            zzZU = zzpt1;
            zzaKb = executorservice;
        }
    }


    private final zze zzXa;
    private final zzpt zzZU;
    private Integer zzZV;
    private final boolean zzaKa;
    private final ExecutorService zzaKb;

    public zzh(Context context, Looper looper, boolean flag, zze zze1, zzpt zzpt1, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener, 
            ExecutorService executorservice)
    {
        super(context, looper, 44, connectioncallbacks, onconnectionfailedlistener, zze1);
        zzaKa = flag;
        zzXa = zze1;
        zzZU = zzpt1;
        zzZV = zze1.zznC();
        zzaKb = executorservice;
    }

    public static Bundle zza(zzpt zzpt1, Integer integer, ExecutorService executorservice)
    {
        Bundle bundle = new Bundle();
        bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", zzpt1.zzxZ());
        bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", zzpt1.zzya());
        bundle.putString("com.google.android.gms.signin.internal.serverClientId", zzpt1.zzxt());
        if (zzpt1.zzyb() != null)
        {
            bundle.putParcelable("com.google.android.gms.signin.internal.signInCallbacks", new BinderWrapper((new zza(zzpt1, executorservice)).asBinder()));
        }
        if (integer != null)
        {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", integer.intValue());
        }
        return bundle;
    }

    public void connect()
    {
        connect(((com.google.android.gms.common.api.GoogleApiClient.ConnectionProgressReportCallbacks) (new com.google.android.gms.common.internal.zzi.zzf(this))));
    }

    protected String getServiceDescriptor()
    {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    protected String getStartServiceAction()
    {
        return "com.google.android.gms.signin.service.START";
    }

    public boolean requiresSignIn()
    {
        return zzaKa;
    }

    protected IInterface zzT(IBinder ibinder)
    {
        return zzdE(ibinder);
    }

    public void zza(IAccountAccessor iaccountaccessor, Set set, com.google.android.gms.signin.internal.zze zze1)
    {
        zzu.zzb(zze1, "Expecting a valid ISignInCallbacks");
        try
        {
            ((zzf)zznM()).zza(new AuthAccountRequest(iaccountaccessor, set), zze1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (IAccountAccessor iaccountaccessor)
        {
            Log.w("SignInClientImpl", "Remote service probably died when authAccount is called");
        }
        try
        {
            zze1.zza(new ConnectionResult(8, null), new AuthAccountResult());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (IAccountAccessor iaccountaccessor)
        {
            Log.wtf("SignInClientImpl", "ISignInCallbacks#onAuthAccount should be executed from the same process, unexpected RemoteException.");
        }
    }

    public void zza(IAccountAccessor iaccountaccessor, boolean flag)
    {
        try
        {
            ((zzf)zznM()).zza(iaccountaccessor, zzZV.intValue(), flag);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (IAccountAccessor iaccountaccessor)
        {
            Log.w("SignInClientImpl", "Remote service probably died when saveDefaultAccount is called");
        }
    }

    public void zza(zzq zzq1)
    {
        zzu.zzb(zzq1, "Expecting a valid IResolveAccountCallbacks");
        try
        {
            android.accounts.Account account = zzXa.zznt();
            ((zzf)zznM()).zza(new ResolveAccountRequest(account, zzZV.intValue()), zzq1);
            return;
        }
        catch (RemoteException remoteexception)
        {
            Log.w("SignInClientImpl", "Remote service probably died when resolveAccount is called");
        }
        try
        {
            zzq1.zzb(new ResolveAccountResponse(8));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (zzq zzq1)
        {
            Log.wtf("SignInClientImpl", "IResolveAccountCallbacks#onAccountResolutionComplete should be executed from the same process, unexpected RemoteException.");
        }
    }

    protected zzf zzdE(IBinder ibinder)
    {
        return zzf.zza.zzdD(ibinder);
    }

    protected Bundle zzkR()
    {
        Bundle bundle = zza(zzZU, zzXa.zznC(), zzaKb);
        String s = zzXa.zzny();
        if (!getContext().getPackageName().equals(s))
        {
            bundle.putString("com.google.android.gms.signin.internal.realClientPackageName", zzXa.zzny());
        }
        return bundle;
    }

    public void zzxY()
    {
        try
        {
            ((zzf)zznM()).zziQ(zzZV.intValue());
            return;
        }
        catch (RemoteException remoteexception)
        {
            Log.w("SignInClientImpl", "Remote service probably died when clearAccountFromSessionStore is called");
        }
    }
}
