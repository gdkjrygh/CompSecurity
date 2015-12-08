// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.appstate.AppState;
import com.google.android.gms.appstate.AppStateBuffer;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.zze;
import com.google.android.gms.common.internal.zzi;
import com.google.android.gms.common.internal.zzu;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal:
//            zzjd, zzja

public final class zzjb extends zzi
{
    private static final class zza extends zzja
    {

        private final com.google.android.gms.common.api.zza.zzb zzOs;

        public void zzg(int i, int j)
        {
            Status status = new Status(i);
            zzOs.zzm(new zzb(status, j));
        }

        public zza(com.google.android.gms.common.api.zza.zzb zzb1)
        {
            zzOs = (com.google.android.gms.common.api.zza.zzb)zzu.zzb(zzb1, "Result holder must not be null");
        }
    }

    private static final class zzb
        implements com.google.android.gms.appstate.AppStateManager.StateDeletedResult
    {

        private final Status zzOt;
        private final int zzOu;

        public int getStateKey()
        {
            return zzOu;
        }

        public Status getStatus()
        {
            return zzOt;
        }

        public zzb(Status status, int i)
        {
            zzOt = status;
            zzOu = i;
        }
    }

    private static final class zzc extends zzja
    {

        private final com.google.android.gms.common.api.zza.zzb zzOs;

        public void zza(DataHolder dataholder)
        {
            zzOs.zzm(new zzd(dataholder));
        }

        public zzc(com.google.android.gms.common.api.zza.zzb zzb1)
        {
            zzOs = (com.google.android.gms.common.api.zza.zzb)zzu.zzb(zzb1, "Result holder must not be null");
        }
    }

    private static final class zzd extends com.google.android.gms.common.api.zzc
        implements com.google.android.gms.appstate.AppStateManager.StateListResult
    {

        private final AppStateBuffer zzOv;

        public AppStateBuffer getStateBuffer()
        {
            return zzOv;
        }

        public zzd(DataHolder dataholder)
        {
            super(dataholder);
            zzOv = new AppStateBuffer(dataholder);
        }
    }

    private static final class zze extends zzja
    {

        private final com.google.android.gms.common.api.zza.zzb zzOs;

        public void zza(int i, DataHolder dataholder)
        {
            zzOs.zzm(new zzf(i, dataholder));
        }

        public zze(com.google.android.gms.common.api.zza.zzb zzb1)
        {
            zzOs = (com.google.android.gms.common.api.zza.zzb)zzu.zzb(zzb1, "Result holder must not be null");
        }
    }

    private static final class zzf extends com.google.android.gms.common.api.zzc
        implements com.google.android.gms.appstate.AppStateManager.StateConflictResult, com.google.android.gms.appstate.AppStateManager.StateLoadedResult, com.google.android.gms.appstate.AppStateManager.StateResult
    {

        private final int zzOu;
        private final AppStateBuffer zzOv;

        private boolean zzkX()
        {
            return zzOt.getStatusCode() == 2000;
        }

        public com.google.android.gms.appstate.AppStateManager.StateConflictResult getConflictResult()
        {
            if (zzkX())
            {
                return this;
            } else
            {
                return null;
            }
        }

        public com.google.android.gms.appstate.AppStateManager.StateLoadedResult getLoadedResult()
        {
            zzf zzf1 = this;
            if (zzkX())
            {
                zzf1 = null;
            }
            return zzf1;
        }

        public byte[] getLocalData()
        {
            if (zzOv.getCount() == 0)
            {
                return null;
            } else
            {
                return zzOv.get(0).getLocalData();
            }
        }

        public String getResolvedVersion()
        {
            if (zzOv.getCount() == 0)
            {
                return null;
            } else
            {
                return zzOv.get(0).getConflictVersion();
            }
        }

        public byte[] getServerData()
        {
            if (zzOv.getCount() == 0)
            {
                return null;
            } else
            {
                return zzOv.get(0).getConflictData();
            }
        }

        public int getStateKey()
        {
            return zzOu;
        }

        public void release()
        {
            zzOv.release();
        }

        public zzf(int i, DataHolder dataholder)
        {
            super(dataholder);
            zzOu = i;
            zzOv = new AppStateBuffer(dataholder);
        }
    }

    private static final class zzg extends zzja
    {

        private final com.google.android.gms.common.api.zza.zzb zzOs;

        public void zzkU()
        {
            Status status = new Status(0);
            zzOs.zzm(status);
        }

        public zzg(com.google.android.gms.common.api.zza.zzb zzb1)
        {
            zzOs = (com.google.android.gms.common.api.zza.zzb)zzu.zzb(zzb1, "Holder must not be null");
        }
    }


    public zzjb(Context context, Looper looper, com.google.android.gms.common.internal.zze zze1, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        super(context, looper, 7, connectioncallbacks, onconnectionfailedlistener, zze1);
    }

    protected String getServiceDescriptor()
    {
        return "com.google.android.gms.appstate.internal.IAppStateService";
    }

    protected String getStartServiceAction()
    {
        return "com.google.android.gms.appstate.service.START";
    }

    public boolean requiresSignIn()
    {
        return true;
    }

    protected IInterface zzT(IBinder ibinder)
    {
        return zzaj(ibinder);
    }

    protected Set zza(Set set)
    {
        zzu.zza(set.contains(new Scope("https://www.googleapis.com/auth/appstate")), String.format("App State APIs requires %s to function.", new Object[] {
            "https://www.googleapis.com/auth/appstate"
        }));
        return set;
    }

    public void zza(com.google.android.gms.common.api.zza.zzb zzb1)
        throws RemoteException
    {
        ((zzjd)zznM()).zza(new zzc(zzb1));
    }

    public void zza(com.google.android.gms.common.api.zza.zzb zzb1, int i)
        throws RemoteException
    {
        ((zzjd)zznM()).zzb(new zza(zzb1), i);
    }

    public void zza(com.google.android.gms.common.api.zza.zzb zzb1, int i, String s, byte abyte0[])
        throws RemoteException
    {
        ((zzjd)zznM()).zza(new zze(zzb1), i, s, abyte0);
    }

    public void zza(com.google.android.gms.common.api.zza.zzb zzb1, int i, byte abyte0[])
        throws RemoteException
    {
        if (zzb1 == null)
        {
            zzb1 = null;
        } else
        {
            zzb1 = new zze(zzb1);
        }
        ((zzjd)zznM()).zza(zzb1, i, abyte0);
    }

    protected zzjd zzaj(IBinder ibinder)
    {
        return zzjd.zza.zzal(ibinder);
    }

    public void zzb(com.google.android.gms.common.api.zza.zzb zzb1)
        throws RemoteException
    {
        ((zzjd)zznM()).zzb(new zzg(zzb1));
    }

    public void zzb(com.google.android.gms.common.api.zza.zzb zzb1, int i)
        throws RemoteException
    {
        ((zzjd)zznM()).zza(new zze(zzb1), i);
    }

    public int zzkV()
    {
        int i;
        try
        {
            i = ((zzjd)zznM()).zzkV();
        }
        catch (RemoteException remoteexception)
        {
            Log.w("AppStateClient", "service died");
            return 2;
        }
        return i;
    }

    public int zzkW()
    {
        int i;
        try
        {
            i = ((zzjd)zznM()).zzkW();
        }
        catch (RemoteException remoteexception)
        {
            Log.w("AppStateClient", "service died");
            return 2;
        }
        return i;
    }
}
