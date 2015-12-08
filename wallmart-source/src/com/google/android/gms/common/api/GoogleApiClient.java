// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.view.View;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.internal.zzf;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.internal.zzld;
import com.google.android.gms.signin.zzb;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.common.api:
//            PendingResult, Api, Scope, zzl, 
//            zzp, zzi, zzq

public interface GoogleApiClient
{
    public static final class Builder
    {

        private final Context mContext;
        private Account zzOY;
        private String zzQl;
        private Looper zzYV;
        private final Set zzYY;
        private int zzYZ;
        private View zzZa;
        private String zzZb;
        private final Map zzZc;
        private final Map zzZd;
        private FragmentActivity zzZe;
        private int zzZf;
        private int zzZg;
        private OnConnectionFailedListener zzZh;
        private GoogleApiAvailability zzZi;
        private Api.zza zzZj;
        private final ArrayList zzZk;
        private final ArrayList zzZl;
        private com.google.android.gms.signin.zze.zza zzZm;

        static FragmentActivity zza(Builder builder)
        {
            return builder.zzZe;
        }

        private transient void zza(Api api, Api.ApiOptions apioptions, int i, Scope ascope[])
        {
            boolean flag1 = true;
            boolean flag = false;
            int j;
            if (i != 1)
            {
                if (i == 2)
                {
                    flag1 = false;
                } else
                {
                    throw new IllegalArgumentException((new StringBuilder()).append("Invalid resolution mode: '").append(i).append("', use a constant from GoogleApiClient.ResolutionMode").toString());
                }
            }
            apioptions = new HashSet(api.zznb().zzl(apioptions));
            j = ascope.length;
            for (i = ((flag) ? 1 : 0); i < j; i++)
            {
                apioptions.add(ascope[i]);
            }

            zzZc.put(api, new com.google.android.gms.common.internal.zzf.zza(apioptions, flag1));
        }

        static void zza(Builder builder, zzp zzp1, GoogleApiClient googleapiclient)
        {
            builder.zza(zzp1, googleapiclient);
        }

        private void zza(zzp zzp1, GoogleApiClient googleapiclient)
        {
            zzp1.zza(zzZf, googleapiclient, zzZh);
        }

        private GoogleApiClient zznj()
        {
            zzi zzi1 = new zzi(mContext.getApplicationContext(), zzYV, zzni(), zzZi, zzZj, zzZd, zzZk, zzZl, zzZf, -1);
            zzp zzp1 = com.google.android.gms.common.api.zzp.zza(zzZe);
            if (zzp1 == null)
            {
                (new Handler(mContext.getMainLooper())).post(new Runnable(this, zzi1) {

                    final GoogleApiClient zzVc;
                    final Builder zzZn;

                    public void run()
                    {
                        if (Builder.zza(zzZn).isFinishing() || Builder.zza(zzZn).getSupportFragmentManager().isDestroyed())
                        {
                            return;
                        } else
                        {
                            Builder.zza(zzZn, com.google.android.gms.common.api.zzp.zzb(Builder.zza(zzZn)), zzVc);
                            return;
                        }
                    }

            
            {
                zzZn = builder;
                zzVc = googleapiclient;
                super();
            }
                });
                return zzi1;
            } else
            {
                zza(zzp1, zzi1);
                return zzi1;
            }
        }

        private GoogleApiClient zznk()
        {
            zzq zzq1 = zzq.zzc(zzZe);
            GoogleApiClient googleapiclient = zzq1.zzbj(zzZg);
            Object obj = googleapiclient;
            if (googleapiclient == null)
            {
                obj = new zzi(mContext.getApplicationContext(), zzYV, zzni(), zzZi, zzZj, zzZd, zzZk, zzZl, -1, zzZg);
            }
            zzq1.zza(zzZg, ((GoogleApiClient) (obj)), zzZh);
            return ((GoogleApiClient) (obj));
        }

        public Builder addApi(Api api)
        {
            zzZd.put(api, null);
            zzYY.addAll(api.zznb().zzl(null));
            return this;
        }

        public Builder addApi(Api api, Api.ApiOptions.HasOptions hasoptions)
        {
            zzx.zzb(hasoptions, "Null options are not permitted for this Api");
            zzZd.put(api, hasoptions);
            zzYY.addAll(api.zznb().zzl(hasoptions));
            return this;
        }

        public transient Builder addApiIfAvailable(Api api, Api.ApiOptions.HasOptions hasoptions, Scope ascope[])
        {
            zzx.zzb(hasoptions, "Null options are not permitted for this Api");
            zzZd.put(api, hasoptions);
            zza(api, hasoptions, 1, ascope);
            return this;
        }

        public transient Builder addApiIfAvailable(Api api, Scope ascope[])
        {
            zzZd.put(api, null);
            zza(api, null, 1, ascope);
            return this;
        }

        public Builder addConnectionCallbacks(ConnectionCallbacks connectioncallbacks)
        {
            zzZk.add(connectioncallbacks);
            return this;
        }

        public Builder addOnConnectionFailedListener(OnConnectionFailedListener onconnectionfailedlistener)
        {
            zzZl.add(onconnectionfailedlistener);
            return this;
        }

        public Builder addScope(Scope scope)
        {
            zzYY.add(scope);
            return this;
        }

        public GoogleApiClient build()
        {
            boolean flag;
            if (!zzZd.isEmpty())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            zzx.zzb(flag, "must call addApi() to add at least one API");
            if (zzZf >= 0)
            {
                return zznj();
            }
            if (zzZg >= 0)
            {
                return zznk();
            } else
            {
                return new zzi(mContext, zzYV, zzni(), zzZi, zzZj, zzZd, zzZk, zzZl, -1, -1);
            }
        }

        public Builder enableAutoManage(FragmentActivity fragmentactivity, int i, OnConnectionFailedListener onconnectionfailedlistener)
        {
            boolean flag;
            if (i >= 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            zzx.zzb(flag, "clientId must be non-negative");
            zzZf = i;
            zzZe = (FragmentActivity)zzx.zzb(fragmentactivity, "Null activity is not permitted.");
            zzZh = onconnectionfailedlistener;
            return this;
        }

        public Builder requestServerAuthCode(String s, ServerAuthCodeCallbacks serverauthcodecallbacks)
        {
            zzZm.zza(s, serverauthcodecallbacks);
            return this;
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
            zzOY = s;
            return this;
        }

        public Builder setGravityForPopups(int i)
        {
            zzYZ = i;
            return this;
        }

        public Builder setHandler(Handler handler)
        {
            zzx.zzb(handler, "Handler must not be null");
            zzYV = handler.getLooper();
            return this;
        }

        public Builder setViewForPopups(View view)
        {
            zzZa = view;
            return this;
        }

        public Builder useDefaultAccount()
        {
            return setAccountName("<<default account>>");
        }

        public zzf zzni()
        {
            return new zzf(zzOY, zzYY, zzZc, zzYZ, zzZa, zzQl, zzZb, zzZm.zzzr());
        }

        public Builder(Context context)
        {
            zzYY = new HashSet();
            zzZc = new zzld();
            zzZd = new zzld();
            zzZf = -1;
            zzZg = -1;
            zzZi = GoogleApiAvailability.getInstance();
            zzZj = zzb.zzQg;
            zzZk = new ArrayList();
            zzZl = new ArrayList();
            zzZm = new com.google.android.gms.signin.zze.zza();
            mContext = context;
            zzYV = context.getMainLooper();
            zzQl = context.getPackageName();
            zzZb = context.getClass().getName();
        }

        public Builder(Context context, ConnectionCallbacks connectioncallbacks, OnConnectionFailedListener onconnectionfailedlistener)
        {
            this(context);
            zzx.zzb(connectioncallbacks, "Must provide a connected listener");
            zzZk.add(connectioncallbacks);
            zzx.zzb(onconnectionfailedlistener, "Must provide a connection failed listener");
            zzZl.add(onconnectionfailedlistener);
        }
    }

    public static interface ConnectionCallbacks
    {

        public static final int CAUSE_NETWORK_LOST = 2;
        public static final int CAUSE_SERVICE_DISCONNECTED = 1;

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

        private boolean zzZo;
        private Set zzZp;

        public static ServerAuthCodeCallbacks.CheckResult newAuthNotRequiredResult()
        {
            return new ServerAuthCodeCallbacks.CheckResult(false, null);
        }

        public static ServerAuthCodeCallbacks.CheckResult newAuthRequiredResult(Set set)
        {
            boolean flag;
            if (set != null && !set.isEmpty())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            zzx.zzb(flag, "A non-empty scope set is required if further auth is needed.");
            return new ServerAuthCodeCallbacks.CheckResult(true, set);
        }

        public boolean zznl()
        {
            return zzZo;
        }

        public Set zznm()
        {
            return zzZp;
        }

        private ServerAuthCodeCallbacks.CheckResult(boolean flag, Set set)
        {
            zzZo = flag;
            zzZp = set;
        }
    }

    public static interface zza
    {

        public abstract void zza(ConnectionResult connectionresult);

        public abstract void zzb(ConnectionResult connectionresult);
    }


    public abstract ConnectionResult blockingConnect();

    public abstract ConnectionResult blockingConnect(long l, TimeUnit timeunit);

    public abstract PendingResult clearDefaultAccountAndReconnect();

    public abstract void connect();

    public abstract void disconnect();

    public abstract void dump(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[]);

    public abstract ConnectionResult getConnectionResult(Api api);

    public abstract Context getContext();

    public abstract Looper getLooper();

    public abstract int getSessionId();

    public abstract boolean hasConnectedApi(Api api);

    public abstract boolean isConnected();

    public abstract boolean isConnecting();

    public abstract boolean isConnectionCallbacksRegistered(ConnectionCallbacks connectioncallbacks);

    public abstract boolean isConnectionFailedListenerRegistered(OnConnectionFailedListener onconnectionfailedlistener);

    public abstract void reconnect();

    public abstract void registerConnectionCallbacks(ConnectionCallbacks connectioncallbacks);

    public abstract void registerConnectionFailedListener(OnConnectionFailedListener onconnectionfailedlistener);

    public abstract void stopAutoManage(FragmentActivity fragmentactivity);

    public abstract void unregisterConnectionCallbacks(ConnectionCallbacks connectioncallbacks);

    public abstract void unregisterConnectionFailedListener(OnConnectionFailedListener onconnectionfailedlistener);

    public abstract Api.zzb zza(Api.zzc zzc);

    public abstract zzc.zza zza(zzc.zza zza1);

    public abstract boolean zza(Api api);

    public abstract boolean zza(Scope scope);

    public abstract zzc.zza zzb(zzc.zza zza1);

    public abstract zzl zzp(Object obj);
}
