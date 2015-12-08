// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.internal.zzl;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.zzi;

// Referenced classes of package com.google.android.gms.internal:
//            zzkd, zzkc, zzke

public class zzkb extends zzi
    implements android.os.IBinder.DeathRecipient
{

    private static final zzl zzQW = new zzl("CastRemoteDisplayClientImpl");
    private CastDevice zzQH;
    private com.google.android.gms.cast.CastRemoteDisplay.CastRemoteDisplaySessionCallbacks zzVB;

    public zzkb(Context context, Looper looper, CastDevice castdevice, com.google.android.gms.cast.CastRemoteDisplay.CastRemoteDisplaySessionCallbacks castremotedisplaysessioncallbacks, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        super(context, looper, 83, connectioncallbacks, onconnectionfailedlistener);
        zzVB = castremotedisplaysessioncallbacks;
        zzQH = castdevice;
    }

    static com.google.android.gms.cast.CastRemoteDisplay.CastRemoteDisplaySessionCallbacks zzb(zzkb zzkb1)
    {
        return zzkb1.zzVB;
    }

    static zzl zzln()
    {
        return zzQW;
    }

    public void binderDied()
    {
    }

    public void disconnect()
    {
        Exception exception;
        try
        {
            ((zzkd)zznM()).disconnect();
        }
        catch (RemoteException remoteexception)
        {
            super.disconnect();
            return;
        }
        finally
        {
            super.disconnect();
        }
        super.disconnect();
        return;
        throw exception;
    }

    protected String getServiceDescriptor()
    {
        return "com.google.android.gms.cast.remote_display.ICastRemoteDisplayService";
    }

    protected String getStartServiceAction()
    {
        return "com.google.android.gms.cast.remote_display.service.START";
    }

    public IInterface zzT(IBinder ibinder)
    {
        return zzay(ibinder);
    }

    public void zza(zzkc zzkc)
        throws RemoteException
    {
        zzQW.zzb("stopRemoteDisplay", new Object[0]);
        ((zzkd)zznM()).zza(zzkc);
    }

    public void zza(zzkc zzkc, int i)
        throws RemoteException
    {
        ((zzkd)zznM()).zza(zzkc, i);
    }

    public void zza(zzkc zzkc, zzke zzke, String s)
        throws RemoteException
    {
        zzQW.zzb("startRemoteDisplay", new Object[0]);
        zzke = new zzke.zza(zzke) {

            final zzke zzVC;
            final zzkb zzVD;

            public void zzaR(int i)
                throws RemoteException
            {
                zzkb.zzln().zzb("onRemoteDisplayEnded", new Object[0]);
                if (zzVC != null)
                {
                    zzVC.zzaR(i);
                }
                if (zzkb.zzb(zzVD) != null)
                {
                    zzkb.zzb(zzVD).onRemoteDisplayEnded(new Status(i));
                }
            }

            
            {
                zzVD = zzkb.this;
                zzVC = zzke1;
                super();
            }
        };
        ((zzkd)zznM()).zza(zzkc, zzke, zzQH.getDeviceId(), s);
    }

    public zzkd zzay(IBinder ibinder)
    {
        return zzkd.zza.zzaA(ibinder);
    }

}
