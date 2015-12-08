// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.zze;
import com.google.android.gms.common.internal.zzi;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.events.ChangeListener;
import com.google.android.gms.drive.events.ChangesAvailableOptions;
import com.google.android.gms.drive.events.zzg;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.drive.internal:
//            zzak, DisconnectRequest, zzac, AddEventListenerRequest, 
//            zzbq, RemoveEventListenerRequest, CancelPendingActionsRequest

public class zzs extends zzi
{

    private final String zzOe;
    final com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks zzaar;
    private final Bundle zzaeM;
    private final boolean zzaeN;
    private DriveId zzaeO;
    private DriveId zzaeP;
    final Map zzaeQ = new HashMap();
    final Map zzaeR = new HashMap();
    final Map zzaeS = new HashMap();
    final Map zzaeT = new HashMap();

    public zzs(Context context, Looper looper, zze zze1, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener, Bundle bundle)
    {
        super(context, looper, 11, connectioncallbacks, onconnectionfailedlistener, zze1);
        zzOe = zze1.zzny();
        zzaar = connectioncallbacks;
        zzaeM = bundle;
        looper = new Intent("com.google.android.gms.drive.events.HANDLE_EVENT");
        looper.setPackage(context.getPackageName());
        context = context.getPackageManager().queryIntentServices(looper, 0);
        switch (context.size())
        {
        default:
            throw new IllegalStateException((new StringBuilder()).append("AndroidManifest.xml can only define one service that handles the ").append(looper.getAction()).append(" action").toString());

        case 0: // '\0'
            zzaeN = false;
            return;

        case 1: // '\001'
            context = ((ResolveInfo)context.get(0)).serviceInfo;
            break;
        }
        if (!((ServiceInfo) (context)).exported)
        {
            throw new IllegalStateException((new StringBuilder()).append("Drive event service ").append(((ServiceInfo) (context)).name).append(" must be exported in AndroidManifest.xml").toString());
        } else
        {
            zzaeN = true;
            return;
        }
    }

    private PendingResult zza(GoogleApiClient googleapiclient, int i, DriveId driveid)
    {
        zzu.zzb(zzg.zza(i, driveid), "id");
        zzu.zza(isConnected(), "Client must be connected");
        return googleapiclient.zzb(new zzr.zza(googleapiclient, driveid, i) {

            final DriveId zzaeU;
            final int zzaeV;
            final zzs zzaeY;

            protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                zza((zzs)client);
            }

            protected void zza(zzs zzs1)
                throws RemoteException
            {
                zzs1.zzpB().zza(new RemoveEventListenerRequest(zzaeU, zzaeV), null, null, new zzbq(this));
            }

            
            {
                zzaeY = zzs.this;
                zzaeU = driveid;
                zzaeV = i;
                super(googleapiclient);
            }
        });
    }

    private PendingResult zza(GoogleApiClient googleapiclient, int i, DriveId driveid, ChangesAvailableOptions changesavailableoptions)
    {
        zzu.zzb(zzg.zza(i, driveid), "id");
        zzu.zza(isConnected(), "Client must be connected");
        if (!zzaeN)
        {
            throw new IllegalStateException("Application must define an exported DriveEventService subclass in AndroidManifest.xml to add event subscriptions");
        } else
        {
            return googleapiclient.zzb(new zzr.zza(googleapiclient, driveid, i, changesavailableoptions) {

                final DriveId zzaeU;
                final int zzaeV;
                final ChangesAvailableOptions zzaeW;
                final zzs zzaeY;

                protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
                    throws RemoteException
                {
                    zza((zzs)client);
                }

                protected void zza(zzs zzs1)
                    throws RemoteException
                {
                    zzs1.zzpB().zza(new AddEventListenerRequest(zzaeU, zzaeV, zzaeW), null, null, new zzbq(this));
                }

            
            {
                zzaeY = zzs.this;
                zzaeU = driveid;
                zzaeV = i;
                zzaeW = changesavailableoptions;
                super(googleapiclient);
            }
            });
        }
    }

    private PendingResult zza(GoogleApiClient googleapiclient, int i, DriveId driveid, zzac zzac1)
    {
        return googleapiclient.zzb(new zzr.zza(googleapiclient, driveid, i, zzac1) {

            final DriveId zzaeU;
            final int zzaeV;
            final zzac zzaeX;
            final zzs zzaeY;

            protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                zza((zzs)client);
            }

            protected void zza(zzs zzs1)
                throws RemoteException
            {
                zzs1.zzpB().zza(new RemoveEventListenerRequest(zzaeU, zzaeV), zzaeX, null, new zzbq(this));
            }

            
            {
                zzaeY = zzs.this;
                zzaeU = driveid;
                zzaeV = i;
                zzaeX = zzac1;
                super(googleapiclient);
            }
        });
    }

    private PendingResult zza(GoogleApiClient googleapiclient, int i, DriveId driveid, zzac zzac1, ChangesAvailableOptions changesavailableoptions)
    {
        return googleapiclient.zzb(new zzr.zza(googleapiclient, driveid, i, changesavailableoptions, zzac1) {

            final DriveId zzaeU;
            final int zzaeV;
            final ChangesAvailableOptions zzaeW;
            final zzac zzaeX;
            final zzs zzaeY;

            protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                zza((zzs)client);
            }

            protected void zza(zzs zzs1)
                throws RemoteException
            {
                zzs1.zzpB().zza(new AddEventListenerRequest(zzaeU, zzaeV, zzaeW), zzaeX, null, new zzbq(this));
            }

            
            {
                zzaeY = zzs.this;
                zzaeU = driveid;
                zzaeV = i;
                zzaeW = changesavailableoptions;
                zzaeX = zzac1;
                super(googleapiclient);
            }
        });
    }

    PendingResult cancelPendingActions(GoogleApiClient googleapiclient, List list)
    {
        boolean flag1 = true;
        boolean flag;
        if (list != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzu.zzV(flag);
        if (!list.isEmpty())
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        zzu.zzV(flag);
        zzu.zza(isConnected(), "Client must be connected");
        return googleapiclient.zzb(new zzr.zza(googleapiclient, list) {

            final zzs zzaeY;
            final List zzaeZ;

            protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                zza((zzs)client);
            }

            protected void zza(zzs zzs1)
                throws RemoteException
            {
                zzs1.zzpB().zza(new CancelPendingActionsRequest(zzaeZ), new zzbq(this));
            }

            
            {
                zzaeY = zzs.this;
                zzaeZ = list;
                super(googleapiclient);
            }
        });
    }

    public void disconnect()
    {
        if (isConnected())
        {
            try
            {
                ((zzak)zznM()).zza(new DisconnectRequest());
            }
            catch (RemoteException remoteexception) { }
        }
        super.disconnect();
        synchronized (zzaeQ)
        {
            zzaeQ.clear();
        }
        synchronized (zzaeR)
        {
            zzaeR.clear();
        }
        synchronized (zzaeS)
        {
            zzaeS.clear();
        }
        synchronized (zzaeT)
        {
            zzaeT.clear();
        }
        return;
        exception;
        map;
        JVM INSTR monitorexit ;
        throw exception;
        exception1;
        map;
        JVM INSTR monitorexit ;
        throw exception1;
        exception2;
        map;
        JVM INSTR monitorexit ;
        throw exception2;
        exception3;
        map;
        JVM INSTR monitorexit ;
        throw exception3;
    }

    protected String getServiceDescriptor()
    {
        return "com.google.android.gms.drive.internal.IDriveService";
    }

    protected String getStartServiceAction()
    {
        return "com.google.android.gms.drive.ApiService.START";
    }

    public boolean requiresSignIn()
    {
        return true;
    }

    protected IInterface zzT(IBinder ibinder)
    {
        return zzaN(ibinder);
    }

    PendingResult zza(GoogleApiClient googleapiclient, DriveId driveid)
    {
        return zza(googleapiclient, 1, driveid, ((ChangesAvailableOptions) (null)));
    }

    PendingResult zza(GoogleApiClient googleapiclient, DriveId driveid, ChangeListener changelistener)
    {
        zzu.zzb(zzg.zza(1, driveid), "id");
        zzu.zzb(changelistener, "listener");
        zzu.zza(isConnected(), "Client must be connected");
        Map map = zzaeQ;
        map;
        JVM INSTR monitorenter ;
        Object obj = (Map)zzaeQ.get(driveid);
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_77;
        }
        obj = new HashMap();
        zzaeQ.put(driveid, obj);
        zzac zzac1 = (zzac)((Map) (obj)).get(changelistener);
        if (zzac1 != null) goto _L2; else goto _L1
_L1:
        zzac1 = new zzac(getLooper(), getContext(), 1, changelistener);
        ((Map) (obj)).put(changelistener, zzac1);
        changelistener = zzac1;
_L4:
        changelistener.zzcA(1);
        googleapiclient = zza(googleapiclient, 1, driveid, ((zzac) (changelistener)), null);
        map;
        JVM INSTR monitorexit ;
        return googleapiclient;
_L2:
        if (!zzac1.zzcB(1))
        {
            break MISSING_BLOCK_LABEL_180;
        }
        googleapiclient = new zzq.zzj(googleapiclient, Status.zzXP);
        map;
        JVM INSTR monitorexit ;
        return googleapiclient;
        googleapiclient;
        map;
        JVM INSTR monitorexit ;
        throw googleapiclient;
        changelistener = zzac1;
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected void zza(int i, IBinder ibinder, Bundle bundle, int j)
    {
        if (bundle != null)
        {
            bundle.setClassLoader(getClass().getClassLoader());
            zzaeO = (DriveId)bundle.getParcelable("com.google.android.gms.drive.root_id");
            zzaeP = (DriveId)bundle.getParcelable("com.google.android.gms.drive.appdata_id");
        }
        super.zza(i, ibinder, bundle, j);
    }

    protected zzak zzaN(IBinder ibinder)
    {
        return zzak.zza.zzaO(ibinder);
    }

    PendingResult zzb(GoogleApiClient googleapiclient, DriveId driveid)
    {
        return zza(googleapiclient, 1, driveid);
    }

    PendingResult zzb(GoogleApiClient googleapiclient, DriveId driveid, ChangeListener changelistener)
    {
        zzu.zzb(zzg.zza(1, driveid), "id");
        zzu.zza(isConnected(), "Client must be connected");
        zzu.zzb(changelistener, "listener");
        Map map = zzaeQ;
        map;
        JVM INSTR monitorenter ;
        Map map1 = (Map)zzaeQ.get(driveid);
        if (map1 != null)
        {
            break MISSING_BLOCK_LABEL_72;
        }
        googleapiclient = new zzq.zzj(googleapiclient, Status.zzXP);
        map;
        JVM INSTR monitorexit ;
        return googleapiclient;
        changelistener = (zzac)map1.remove(changelistener);
        if (changelistener != null)
        {
            break MISSING_BLOCK_LABEL_111;
        }
        googleapiclient = new zzq.zzj(googleapiclient, Status.zzXP);
        map;
        JVM INSTR monitorexit ;
        return googleapiclient;
        googleapiclient;
        map;
        JVM INSTR monitorexit ;
        throw googleapiclient;
        if (map1.isEmpty())
        {
            zzaeQ.remove(driveid);
        }
        googleapiclient = zza(googleapiclient, 1, driveid, changelistener);
        map;
        JVM INSTR monitorexit ;
        return googleapiclient;
    }

    protected Bundle zzkR()
    {
        String s = getContext().getPackageName();
        zzu.zzu(s);
        Bundle bundle;
        boolean flag;
        if (!zznK().zznw().isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzu.zzU(flag);
        bundle = new Bundle();
        if (!s.equals(zzOe))
        {
            bundle.putString("proxy_package_name", zzOe);
        }
        bundle.putAll(zzaeM);
        return bundle;
    }

    public zzak zzpB()
        throws DeadObjectException
    {
        return (zzak)zznM();
    }

    public DriveId zzpC()
    {
        return zzaeO;
    }

    public DriveId zzpD()
    {
        return zzaeP;
    }

    public boolean zzpE()
    {
        return zzaeN;
    }
}
