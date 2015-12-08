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
import com.google.android.gms.ads.internal.zzp;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.internal.zzbr;
import com.google.android.gms.internal.zzbu;
import com.google.android.gms.internal.zzby;
import com.google.android.gms.internal.zzgl;
import com.google.android.gms.internal.zzgm;
import com.google.android.gms.internal.zzhl;
import com.google.android.gms.internal.zzhq;
import com.google.android.gms.internal.zzhu;
import com.google.android.gms.internal.zzhz;
import com.google.android.gms.internal.zzlm;

// Referenced classes of package com.google.android.gms.ads.internal.request:
//            zzg, zzj, AdResponseParcel, AdRequestInfoParcel, 
//            zze

public abstract class zzd extends zzhq
    implements zzc.zza
{
    public static final class zza extends zzd
    {

        private final Context mContext;

        public void zzfx()
        {
        }

        public zzj zzfy()
        {
            zzbr zzbr1 = new zzbr((String)zzby.zztW.get());
            return zzgm.zza(mContext, zzbr1, zzgl.zzfG());
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
        private final zzc.zza zzDt;
        protected zze zzDu;
        private boolean zzDv;
        private final Object zzpc = new Object();
        private AdRequestInfoParcel zzyd;

        protected void connect()
        {
            zzDu.zzox();
        }

        public void onConnected(Bundle bundle)
        {
            zzgn();
        }

        public void onConnectionFailed(ConnectionResult connectionresult)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaC("Cannot connect to remote service, fallback to local instance.");
            zzfz().zzgn();
            connectionresult = new Bundle();
            connectionresult.putString("action", "gms_connection_failed_fallback_to_local");
            zzp.zzbx().zzb(mContext, zzyd.zzqb.zzIz, "gmob-apps", connectionresult, true);
        }

        public void onConnectionSuspended(int i)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaC("Disconnected from remote ad request service.");
        }

        public void zzfx()
        {
            synchronized (zzpc)
            {
                if (zzDu.isConnected() || zzDu.isConnecting())
                {
                    zzDu.disconnect();
                }
                Binder.flushPendingCommands();
                if (zzDv)
                {
                    zzp.zzbI().zzgC();
                    zzDv = false;
                }
            }
            return;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public zzj zzfy()
        {
            obj;
            JVM INSTR monitorenter ;
            zzj zzj1;
            synchronized (zzpc)
            {
                zzj1 = zzDu.zzfC();
            }
            return zzj1;
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

        zzhq zzfz()
        {
            return new zza(mContext, zzyd, zzDt);
        }

        public zzb(Context context, AdRequestInfoParcel adrequestinfoparcel, zzc.zza zza1)
        {
            super(adrequestinfoparcel, zza1);
            mContext = context;
            zzyd = adrequestinfoparcel;
            zzDt = zza1;
            if (((Boolean)zzby.zzuv.get()).booleanValue())
            {
                zzDv = true;
                zza1 = zzp.zzbI().zzgB();
            } else
            {
                zza1 = context.getMainLooper();
            }
            zzDu = new zze(context, zza1, this, this, adrequestinfoparcel.zzqb.zzIB);
            connect();
        }
    }


    private AdResponseParcel zzCG;
    private final zzc.zza zzDt;
    private final Object zzpc = new Object();
    private final AdRequestInfoParcel zzyd;

    public zzd(AdRequestInfoParcel adrequestinfoparcel, zzc.zza zza1)
    {
        zzyd = adrequestinfoparcel;
        zzDt = zza1;
    }

    public final void onStop()
    {
        zzfx();
    }

    boolean zza(zzj zzj1, AdRequestInfoParcel adrequestinfoparcel)
    {
        zzj1.zza(adrequestinfoparcel, new zzg(this));
        return true;
        zzj1;
        com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not fetch ad response from ad request service.", zzj1);
        zzp.zzbA().zzc(zzj1, true);
_L2:
        zzDt.zzb(new AdResponseParcel(0));
        return false;
        zzj1;
        com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not fetch ad response from ad request service due to an Exception.", zzj1);
        zzp.zzbA().zzc(zzj1, true);
        continue; /* Loop/switch isn't completed */
        zzj1;
        com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not fetch ad response from ad request service due to an Exception.", zzj1);
        zzp.zzbA().zzc(zzj1, true);
        continue; /* Loop/switch isn't completed */
        zzj1;
        com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not fetch ad response from ad request service due to an Exception.", zzj1);
        zzp.zzbA().zzc(zzj1, true);
        if (true) goto _L2; else goto _L1
_L1:
    }

    public void zzb(AdResponseParcel adresponseparcel)
    {
        synchronized (zzpc)
        {
            zzCG = adresponseparcel;
            zzpc.notify();
        }
        return;
        adresponseparcel;
        obj;
        JVM INSTR monitorexit ;
        throw adresponseparcel;
    }

    public void zzdG()
    {
        Object obj = zzfy();
        if (obj != null) goto _L2; else goto _L1
_L1:
        obj = new AdResponseParcel(0);
        zzDt.zzb(((AdResponseParcel) (obj)));
_L4:
        zzfx();
        return;
_L2:
        if (!zza(((zzj) (obj)), zzyd)) goto _L4; else goto _L3
_L3:
        zzi(zzp.zzbB().elapsedRealtime());
          goto _L4
        Exception exception;
        exception;
        zzfx();
        throw exception;
    }

    protected boolean zze(long l)
    {
        l = 60000L - (zzp.zzbB().elapsedRealtime() - l);
        if (l <= 0L)
        {
            return false;
        }
        try
        {
            zzpc.wait(l);
        }
        catch (InterruptedException interruptedexception)
        {
            return false;
        }
        return true;
    }

    public abstract void zzfx();

    public abstract zzj zzfy();

    protected void zzi(long l)
    {
        obj;
        JVM INSTR monitorenter ;
_L2:
        synchronized (zzpc)
        {
            if (zzCG == null)
            {
                continue; /* Loop/switch isn't completed */
            }
            zzDt.zzb(zzCG);
        }
        return;
        if (zze(l)) goto _L2; else goto _L1
_L1:
        if (zzCG == null)
        {
            break MISSING_BLOCK_LABEL_68;
        }
        zzDt.zzb(zzCG);
_L3:
        obj;
        JVM INSTR monitorexit ;
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        zzDt.zzb(new AdResponseParcel(0));
          goto _L3
    }
}
