// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.zze;
import com.google.android.gms.common.internal.zzv;
import com.google.android.gms.internal.zzmb;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.common.api:
//            Api, zzl, zzg, zzm, 
//            Scope

public interface GoogleApiClient
{
    public static final class Builder
    {

        private final Context mContext;
        private Account zzJc;
        private int zzPA;
        private View zzPB;
        private String zzPC;
        private String zzPD;
        private final Map zzPE = new HashMap();
        private final Map zzPF = new HashMap();
        private FragmentActivity zzPG;
        private int zzPH;
        private int zzPI;
        private OnConnectionFailedListener zzPJ;
        private Api.zzb zzPK;
        private final Set zzPL = new HashSet();
        private final Set zzPM = new HashSet();
        private com.google.android.gms.internal.zzme.zza zzPN;
        private Looper zzPx;
        private final Set zzPz = new HashSet();

        private GoogleApiClient zzkK()
        {
            zzl zzl1 = zzl.zza(zzPG);
            zzg zzg1 = new zzg(mContext.getApplicationContext(), zzPx, zzkJ(), zzPK, zzPF, zzPL, zzPM, zzPH, -1);
            zzl1.zza(zzPH, zzg1, zzPJ);
            return zzg1;
        }

        private GoogleApiClient zzkL()
        {
            zzm zzm1 = zzm.zzb(zzPG);
            GoogleApiClient googleapiclient = zzm1.zzay(zzPI);
            Object obj = googleapiclient;
            if (googleapiclient == null)
            {
                obj = new zzg(mContext.getApplicationContext(), zzPx, zzkJ(), zzPK, zzPF, zzPL, zzPM, -1, zzPI);
            }
            zzm1.zza(zzPI, ((GoogleApiClient) (obj)), zzPJ);
            return ((GoogleApiClient) (obj));
        }

        public Builder addApi(Api api)
        {
            zzPF.put(api, null);
            zzPz.addAll(api.zzkD());
            return this;
        }

        public Builder addApi(Api api, Api.ApiOptions.HasOptions hasoptions)
        {
            zzv.zzb(hasoptions, "Null options are not permitted for this Api");
            zzPF.put(api, hasoptions);
            zzPz.addAll(api.zzkD());
            return this;
        }

        public Builder addConnectionCallbacks(ConnectionCallbacks connectioncallbacks)
        {
            zzPL.add(connectioncallbacks);
            return this;
        }

        public Builder addOnConnectionFailedListener(OnConnectionFailedListener onconnectionfailedlistener)
        {
            zzPM.add(onconnectionfailedlistener);
            return this;
        }

        public Builder addScope(Scope scope)
        {
            zzPz.add(scope);
            return this;
        }

        public GoogleApiClient build()
        {
            boolean flag;
            if (!zzPF.isEmpty())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            zzv.zzb(flag, "must call addApi() to add at least one API");
            if (zzPH >= 0)
            {
                return zzkK();
            }
            if (zzPI >= 0)
            {
                return zzkL();
            } else
            {
                return new zzg(mContext, zzPx, zzkJ(), zzPK, zzPF, zzPL, zzPM, -1, -1);
            }
        }

        public Builder setAccountName(String s)
        {
            if (s == null)
            {
                s = null;
            } else
            {
                s = new Account(s, "com.google");
            }
            zzJc = s;
            return this;
        }

        public zze zzkJ()
        {
            return new zze(zzJc, zzPz, zzPE, zzPA, zzPB, zzPC, zzPD, zzPN.zzwg());
        }

        public Builder(Context context)
        {
            zzPH = -1;
            zzPI = -1;
            zzPN = new com.google.android.gms.internal.zzme.zza();
            mContext = context;
            zzPx = context.getMainLooper();
            zzPC = context.getPackageName();
            zzPD = context.getClass().getName();
            zzPK = zzmb.zzKi;
        }
    }

    public static interface ConnectionCallbacks
    {

        public abstract void onConnected(Bundle bundle);

        public abstract void onConnectionSuspended(int i);
    }

    public static interface OnConnectionFailedListener
    {

        public abstract void onConnectionFailed(ConnectionResult connectionresult);
    }

    public static interface ServerAuthCodeCallbacks
    {

        public abstract CheckResult onCheckServerAuthorization(String s, Set set);

        public abstract boolean onUploadServerAuthCode(String s, String s1);
    }

    public static class ServerAuthCodeCallbacks.CheckResult
    {

        private boolean zzPO;
        private Set zzPP;

        public boolean zzkM()
        {
            return zzPO;
        }

        public Set zzkN()
        {
            return zzPP;
        }
    }

    public static interface zza
    {

        public abstract void zza(ConnectionResult connectionresult);

        public abstract void zzb(ConnectionResult connectionresult);
    }


    public abstract ConnectionResult blockingConnect();

    public abstract void connect();

    public abstract void disconnect();

    public abstract void dump(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[]);

    public abstract Context getContext();

    public abstract Looper getLooper();

    public abstract boolean hasConnectedApi(Api api);

    public abstract boolean isConnected();

    public abstract boolean isConnecting();

    public abstract void registerConnectionCallbacks(ConnectionCallbacks connectioncallbacks);

    public abstract void registerConnectionFailedListener(OnConnectionFailedListener onconnectionfailedlistener);

    public abstract void unregisterConnectionCallbacks(ConnectionCallbacks connectioncallbacks);

    public abstract void unregisterConnectionFailedListener(OnConnectionFailedListener onconnectionfailedlistener);

    public abstract Api.zza zza(Api.zzc zzc);

    public abstract zza.zza zza(zza.zza zza1);

    public abstract boolean zza(Api api);

    public abstract zza.zza zzb(zza.zza zza1);
}
