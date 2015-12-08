// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.appstate;

import android.content.Context;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.internal.zzjb;

// Referenced classes of package com.google.android.gms.appstate:
//            AppStateBuffer

public final class AppStateManager
{
    public static interface StateConflictResult
        extends Releasable, Result
    {

        public abstract byte[] getLocalData();

        public abstract String getResolvedVersion();

        public abstract byte[] getServerData();

        public abstract int getStateKey();
    }

    public static interface StateDeletedResult
        extends Result
    {

        public abstract int getStateKey();
    }

    public static interface StateListResult
        extends Result
    {

        public abstract AppStateBuffer getStateBuffer();
    }

    public static interface StateLoadedResult
        extends Releasable, Result
    {

        public abstract byte[] getLocalData();

        public abstract int getStateKey();
    }

    public static interface StateResult
        extends Releasable, Result
    {

        public abstract StateConflictResult getConflictResult();

        public abstract StateLoadedResult getLoadedResult();
    }

    public static abstract class zza extends com.google.android.gms.common.api.zza.zza
    {

        public zza(GoogleApiClient googleapiclient)
        {
            super(AppStateManager.zzNX, googleapiclient);
        }
    }

    private static abstract class zzb extends zza
    {

        zzb(GoogleApiClient googleapiclient)
        {
            super(googleapiclient);
        }
    }

    private static abstract class zzc extends zza
    {

        public Result createFailedResult(Status status)
        {
            return zzg(status);
        }

        public StateListResult zzg(Status status)
        {
            return new StateListResult(this, status) {

                final Status zzOl;
                final zzc zzOr;

                public AppStateBuffer getStateBuffer()
                {
                    return new AppStateBuffer(null);
                }

                public Status getStatus()
                {
                    return zzOl;
                }

            
            {
                zzOr = zzc1;
                zzOl = status;
                super();
            }
            };
        }

        public zzc(GoogleApiClient googleapiclient)
        {
            super(googleapiclient);
        }
    }

    private static abstract class zzd extends zza
    {

        public Result createFailedResult(Status status)
        {
            return zzb(status);
        }

        public Status zzb(Status status)
        {
            return status;
        }

        public zzd(GoogleApiClient googleapiclient)
        {
            super(googleapiclient);
        }
    }

    private static abstract class zze extends zza
    {

        public Result createFailedResult(Status status)
        {
            return zzh(status);
        }

        public StateResult zzh(Status status)
        {
            return AppStateManager.zze(status);
        }

        public zze(GoogleApiClient googleapiclient)
        {
            super(googleapiclient);
        }
    }


    public static final Api API;
    public static final Scope SCOPE_APP_STATE;
    static final com.google.android.gms.common.api.Api.ClientKey zzNX;
    private static final com.google.android.gms.common.api.Api.zza zzNY;

    private AppStateManager()
    {
    }

    public static PendingResult delete(GoogleApiClient googleapiclient, int i)
    {
        return googleapiclient.zzb(new zzb(googleapiclient, i) {

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

            public StateDeletedResult zzf(Status status)
            {
                return new StateDeletedResult(this, status) {

                    final Status zzOl;
                    final _cls5 zzOo;

                    public int getStateKey()
                    {
                        return zzOo.zzOm;
                    }

                    public Status getStatus()
                    {
                        return zzOl;
                    }

            
            {
                zzOo = _pcls5;
                zzOl = status;
                super();
            }
                };
            }

            
            {
                zzOm = i;
                super(googleapiclient);
            }
        });
    }

    public static int getMaxNumKeys(GoogleApiClient googleapiclient)
    {
        return zza(googleapiclient).zzkW();
    }

    public static int getMaxStateSize(GoogleApiClient googleapiclient)
    {
        return zza(googleapiclient).zzkV();
    }

    public static PendingResult list(GoogleApiClient googleapiclient)
    {
        return googleapiclient.zza(new zzc(googleapiclient) {

            protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                zza((zzjb)client);
            }

            protected void zza(zzjb zzjb1)
                throws RemoteException
            {
                zzjb1.zza(this);
            }

        });
    }

    public static PendingResult load(GoogleApiClient googleapiclient, int i)
    {
        return googleapiclient.zza(new zze(googleapiclient, i) {

            final int zzOm;

            protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                zza((zzjb)client);
            }

            protected void zza(zzjb zzjb1)
                throws RemoteException
            {
                zzjb1.zzb(this, zzOm);
            }

            
            {
                zzOm = i;
                super(googleapiclient);
            }
        });
    }

    public static PendingResult resolve(GoogleApiClient googleapiclient, int i, String s, byte abyte0[])
    {
        return googleapiclient.zzb(new zze(googleapiclient, i, s, abyte0) {

            final int zzOm;
            final String zzOp;
            final byte zzOq[];

            protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                zza((zzjb)client);
            }

            protected void zza(zzjb zzjb1)
                throws RemoteException
            {
                zzjb1.zza(this, zzOm, zzOp, zzOq);
            }

            
            {
                zzOm = i;
                zzOp = s;
                zzOq = abyte0;
                super(googleapiclient);
            }
        });
    }

    public static PendingResult signOut(GoogleApiClient googleapiclient)
    {
        return googleapiclient.zzb(new zzd(googleapiclient) {

            protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                zza((zzjb)client);
            }

            protected void zza(zzjb zzjb1)
                throws RemoteException
            {
                zzjb1.zzb(this);
            }

        });
    }

    public static void update(GoogleApiClient googleapiclient, int i, byte abyte0[])
    {
        googleapiclient.zzb(new zze(googleapiclient, i, abyte0) {

            final int zzOm;
            final byte zzOn[];

            protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                zza((zzjb)client);
            }

            protected void zza(zzjb zzjb1)
                throws RemoteException
            {
                zzjb1.zza(null, zzOm, zzOn);
            }

            
            {
                zzOm = i;
                zzOn = abyte0;
                super(googleapiclient);
            }
        });
    }

    public static PendingResult updateImmediate(GoogleApiClient googleapiclient, int i, byte abyte0[])
    {
        return googleapiclient.zzb(new zze(googleapiclient, i, abyte0) {

            final int zzOm;
            final byte zzOn[];

            protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                zza((zzjb)client);
            }

            protected void zza(zzjb zzjb1)
                throws RemoteException
            {
                zzjb1.zza(this, zzOm, zzOn);
            }

            
            {
                zzOm = i;
                zzOn = abyte0;
                super(googleapiclient);
            }
        });
    }

    public static zzjb zza(GoogleApiClient googleapiclient)
    {
        boolean flag;
        if (googleapiclient != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzu.zzb(flag, "GoogleApiClient parameter is required.");
        zzu.zza(googleapiclient.isConnected(), "GoogleApiClient must be connected.");
        zzu.zza(googleapiclient.zza(API), "GoogleApiClient is not configured to use the AppState API. Pass AppStateManager.API into GoogleApiClient.Builder#addApi() to use this feature.");
        return (zzjb)googleapiclient.zza(zzNX);
    }

    private static StateResult zzd(Status status)
    {
        return new StateResult(status) {

            final Status zzOl;

            public StateConflictResult getConflictResult()
            {
                return null;
            }

            public StateLoadedResult getLoadedResult()
            {
                return null;
            }

            public Status getStatus()
            {
                return zzOl;
            }

            public void release()
            {
            }

            
            {
                zzOl = status;
                super();
            }
        };
    }

    static StateResult zze(Status status)
    {
        return zzd(status);
    }

    static 
    {
        zzNX = new com.google.android.gms.common.api.Api.ClientKey();
        zzNY = new com.google.android.gms.common.api.Api.zza() {

            public int getPriority()
            {
                return 0x7fffffff;
            }

            public com.google.android.gms.common.api.Api.Client zza(Context context, Looper looper, com.google.android.gms.common.internal.zze zze1, Object obj, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
            {
                return zzc(context, looper, zze1, (com.google.android.gms.common.api.Api.ApiOptions.NoOptions)obj, connectioncallbacks, onconnectionfailedlistener);
            }

            public zzjb zzc(Context context, Looper looper, com.google.android.gms.common.internal.zze zze1, com.google.android.gms.common.api.Api.ApiOptions.NoOptions nooptions, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
            {
                return new zzjb(context, looper, zze1, connectioncallbacks, onconnectionfailedlistener);
            }

        };
        SCOPE_APP_STATE = new Scope("https://www.googleapis.com/auth/appstate");
        API = new Api("AppStateManager.API", zzNY, zzNX, new Scope[] {
            SCOPE_APP_STATE
        });
    }
}
