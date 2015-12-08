// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.request;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzh;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.internal.zzal;
import com.google.android.gms.internal.zzap;
import com.google.android.gms.internal.zzat;
import com.google.android.gms.internal.zzep;
import com.google.android.gms.internal.zzeq;
import com.google.android.gms.internal.zzfc;
import com.google.android.gms.internal.zzfh;
import com.google.android.gms.internal.zzht;

// Referenced classes of package com.google.android.gms.ads.internal.request:
//            zzg, zzi, AdResponseParcel, AdRequestInfoParcel, 
//            zze

public abstract class zzd extends zzfh
    implements zzc.zza
{
    public static final class zza extends zzd
    {

        private final Context mContext;

        public void zzeo()
        {
        }

        public zzi zzep()
        {
            zzal zzal1 = new zzal((String)zzat.zzrh.get());
            return zzeq.zza(mContext, zzal1, com.google.android.gms.internal.zzep.zzew());
        }

        public zza(Context context, AdRequestInfoParcel adrequestinfoparcel, zzc.zza zza1)
        {
            super(adrequestinfoparcel, zza1);
            mContext = context;
        }
    }

    public static class zzb extends zzd
        implements com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener
    {

        private final Object zzoe = new Object();
        private final zzc.zza zzyS;
        protected zze zzyT;

        protected void connect()
        {
            zzyT.connect();
        }

        public void onConnected(Bundle bundle)
        {
            zzeW();
        }

        public void onConnectionFailed(ConnectionResult connectionresult)
        {
            zzyS.zzb(new AdResponseParcel(0));
        }

        public void onConnectionSuspended(int i)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaj("Disconnected from remote ad request service.");
        }

        public void zzeo()
        {
            synchronized (zzoe)
            {
                if (zzyT.isConnected() || zzyT.isConnecting())
                {
                    zzyT.disconnect();
                }
                Binder.flushPendingCommands();
            }
            return;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public zzi zzep()
        {
            obj;
            JVM INSTR monitorenter ;
            zzi zzi1;
            synchronized (zzoe)
            {
                zzi1 = zzyT.zzes();
            }
            return zzi1;
_L2:
            obj;
            JVM INSTR monitorexit ;
            return null;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
            Object obj1;
            obj1;
            continue; /* Loop/switch isn't completed */
            obj1;
            if (true) goto _L2; else goto _L1
_L1:
        }

        public zzb(Context context, AdRequestInfoParcel adrequestinfoparcel, zzc.zza zza1)
        {
            super(adrequestinfoparcel, zza1);
            zzyS = zza1;
            zzyT = new zze(context, this, this, adrequestinfoparcel.zzmJ.zzCK);
            connect();
        }
    }


    private final Object zzoe = new Object();
    private final AdRequestInfoParcel zzul;
    private final zzc.zza zzyS;
    private AdResponseParcel zzyi;

    public zzd(AdRequestInfoParcel adrequestinfoparcel, zzc.zza zza1)
    {
        zzul = adrequestinfoparcel;
        zzyS = zza1;
    }

    public final void onStop()
    {
        zzeo();
    }

    boolean zza(zzi zzi1, AdRequestInfoParcel adrequestinfoparcel)
    {
        zzi1.zza(adrequestinfoparcel, new zzg(this));
        return true;
        zzi1;
        com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not fetch ad response from ad request service.", zzi1);
        com.google.android.gms.ads.internal.zzh.zzaT().zzc(zzi1, true);
_L2:
        zzyS.zzb(new AdResponseParcel(0));
        return false;
        zzi1;
        com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not fetch ad response from ad request service due to an Exception.", zzi1);
        com.google.android.gms.ads.internal.zzh.zzaT().zzc(zzi1, true);
        continue; /* Loop/switch isn't completed */
        zzi1;
        com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not fetch ad response from ad request service due to an Exception.", zzi1);
        com.google.android.gms.ads.internal.zzh.zzaT().zzc(zzi1, true);
        continue; /* Loop/switch isn't completed */
        zzi1;
        com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not fetch ad response from ad request service due to an Exception.", zzi1);
        com.google.android.gms.ads.internal.zzh.zzaT().zzc(zzi1, true);
        if (true) goto _L2; else goto _L1
_L1:
    }

    public void zzb(AdResponseParcel adresponseparcel)
    {
        synchronized (zzoe)
        {
            zzyi = adresponseparcel;
            zzoe.notify();
        }
        return;
        adresponseparcel;
        obj;
        JVM INSTR monitorexit ;
        throw adresponseparcel;
    }

    public void zzcX()
    {
        Object obj = zzep();
        if (obj != null) goto _L2; else goto _L1
_L1:
        obj = new AdResponseParcel(0);
        zzyS.zzb(((AdResponseParcel) (obj)));
_L4:
        zzeo();
        return;
_L2:
        if (!zza(((zzi) (obj)), zzul)) goto _L4; else goto _L3
_L3:
        zzh(com.google.android.gms.ads.internal.zzh.zzaU().elapsedRealtime());
          goto _L4
        Exception exception;
        exception;
        zzeo();
        throw exception;
    }

    protected boolean zzd(long l)
    {
        l = 60000L - (com.google.android.gms.ads.internal.zzh.zzaU().elapsedRealtime() - l);
        if (l <= 0L)
        {
            return false;
        }
        try
        {
            zzoe.wait(l);
        }
        catch (InterruptedException interruptedexception)
        {
            return false;
        }
        return true;
    }

    public abstract void zzeo();

    public abstract zzi zzep();

    protected void zzh(long l)
    {
        obj;
        JVM INSTR monitorenter ;
_L2:
        synchronized (zzoe)
        {
            if (zzyi == null)
            {
                continue; /* Loop/switch isn't completed */
            }
            zzyS.zzb(zzyi);
        }
        return;
        if (zzd(l)) goto _L2; else goto _L1
_L1:
        if (zzyi == null)
        {
            break MISSING_BLOCK_LABEL_68;
        }
        zzyS.zzb(zzyi);
_L3:
        obj;
        JVM INSTR monitorexit ;
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        zzyS.zzb(new AdResponseParcel(0));
          goto _L3
    }
}
