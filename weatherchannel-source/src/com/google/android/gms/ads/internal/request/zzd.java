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
import com.google.android.gms.ads.internal.zzo;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.internal.zzbr;
import com.google.android.gms.internal.zzbv;
import com.google.android.gms.internal.zzbz;
import com.google.android.gms.internal.zzge;
import com.google.android.gms.internal.zzgf;
import com.google.android.gms.internal.zzhc;
import com.google.android.gms.internal.zzhh;
import com.google.android.gms.internal.zzhl;
import com.google.android.gms.internal.zzlb;

// Referenced classes of package com.google.android.gms.ads.internal.request:
//            zzg, zzi, AdResponseParcel, AdRequestInfoParcel, 
//            zze

public abstract class zzd extends zzhh
    implements zzc.zza
{
    public static final class zza extends zzd
    {

        private final Context mContext;

        public void zzfv()
        {
        }

        public zzi zzfw()
        {
            zzbr zzbr1 = new zzbr((String)zzbz.zztD.get());
            return zzgf.zza(mContext, zzbr1, zzge.zzfC());
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

        private Context mContext;
        private final zzc.zza zzCi;
        protected zze zzCj;
        private final Object zzqt = new Object();
        private AdRequestInfoParcel zzxm;

        protected void connect()
        {
            zzCj.zznJ();
        }

        public void onConnected(Bundle bundle)
        {
            zzgi();
        }

        public void onConnectionFailed(ConnectionResult connectionresult)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzay("Cannot connect to remote service, fallback to local instance.");
            zzfx().zzgi();
            connectionresult = new Bundle();
            connectionresult.putString("action", "gms_connection_failed_fallback_to_local");
            zzo.zzbv().zza(mContext, zzxm.zzpJ.zzGG, "gmob-apps", connectionresult, true);
        }

        public void onConnectionSuspended(int i)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzay("Disconnected from remote ad request service.");
        }

        public void zzfv()
        {
            synchronized (zzqt)
            {
                if (zzCj.isConnected() || zzCj.isConnecting())
                {
                    zzCj.disconnect();
                }
                Binder.flushPendingCommands();
            }
            return;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public zzi zzfw()
        {
            obj;
            JVM INSTR monitorenter ;
            zzi zzi1;
            synchronized (zzqt)
            {
                zzi1 = zzCj.zzfy();
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

        zzhh zzfx()
        {
            return new zza(mContext, zzxm, zzCi);
        }

        public zzb(Context context, AdRequestInfoParcel adrequestinfoparcel, zzc.zza zza1)
        {
            super(adrequestinfoparcel, zza1);
            mContext = context;
            zzxm = adrequestinfoparcel;
            zzCi = zza1;
            zzCj = new zze(context, this, this, adrequestinfoparcel.zzpJ.zzGI);
            connect();
        }
    }


    private AdResponseParcel zzBt;
    private final zzc.zza zzCi;
    private final Object zzqt = new Object();
    private final AdRequestInfoParcel zzxm;

    public zzd(AdRequestInfoParcel adrequestinfoparcel, zzc.zza zza1)
    {
        zzxm = adrequestinfoparcel;
        zzCi = zza1;
    }

    public final void onStop()
    {
        zzfv();
    }

    boolean zza(zzi zzi1, AdRequestInfoParcel adrequestinfoparcel)
    {
        zzi1.zza(adrequestinfoparcel, new zzg(this));
        return true;
        zzi1;
        com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not fetch ad response from ad request service.", zzi1);
        zzo.zzby().zzc(zzi1, true);
_L2:
        zzCi.zzb(new AdResponseParcel(0));
        return false;
        zzi1;
        com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not fetch ad response from ad request service due to an Exception.", zzi1);
        zzo.zzby().zzc(zzi1, true);
        continue; /* Loop/switch isn't completed */
        zzi1;
        com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not fetch ad response from ad request service due to an Exception.", zzi1);
        zzo.zzby().zzc(zzi1, true);
        continue; /* Loop/switch isn't completed */
        zzi1;
        com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not fetch ad response from ad request service due to an Exception.", zzi1);
        zzo.zzby().zzc(zzi1, true);
        if (true) goto _L2; else goto _L1
_L1:
    }

    public void zzb(AdResponseParcel adresponseparcel)
    {
        synchronized (zzqt)
        {
            zzBt = adresponseparcel;
            zzqt.notify();
        }
        return;
        adresponseparcel;
        obj;
        JVM INSTR monitorexit ;
        throw adresponseparcel;
    }

    public void zzdP()
    {
        Object obj = zzfw();
        if (obj != null) goto _L2; else goto _L1
_L1:
        obj = new AdResponseParcel(0);
        zzCi.zzb(((AdResponseParcel) (obj)));
_L4:
        zzfv();
        return;
_L2:
        if (!zza(((zzi) (obj)), zzxm)) goto _L4; else goto _L3
_L3:
        zzi(zzo.zzbz().elapsedRealtime());
          goto _L4
        Exception exception;
        exception;
        zzfv();
        throw exception;
    }

    protected boolean zze(long l)
    {
        l = 60000L - (zzo.zzbz().elapsedRealtime() - l);
        if (l <= 0L)
        {
            return false;
        }
        try
        {
            zzqt.wait(l);
        }
        catch (InterruptedException interruptedexception)
        {
            return false;
        }
        return true;
    }

    public abstract void zzfv();

    public abstract zzi zzfw();

    protected void zzi(long l)
    {
        obj;
        JVM INSTR monitorenter ;
_L2:
        synchronized (zzqt)
        {
            if (zzBt == null)
            {
                continue; /* Loop/switch isn't completed */
            }
            zzCi.zzb(zzBt);
        }
        return;
        if (zze(l)) goto _L2; else goto _L1
_L1:
        if (zzBt == null)
        {
            break MISSING_BLOCK_LABEL_68;
        }
        zzCi.zzb(zzBt);
_L3:
        obj;
        JVM INSTR monitorexit ;
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        zzCi.zzb(new AdResponseParcel(0));
          goto _L3
    }
}
