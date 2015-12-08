// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.request;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.zzl;
import com.google.android.gms.ads.internal.zzo;
import com.google.android.gms.internal.zzaj;
import com.google.android.gms.internal.zzan;
import com.google.android.gms.internal.zzbk;
import com.google.android.gms.internal.zzdy;
import com.google.android.gms.internal.zzhc;
import com.google.android.gms.internal.zzhh;
import com.google.android.gms.internal.zzhl;
import com.google.android.gms.internal.zzlb;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.ads.internal.request:
//            zzc, AdResponseParcel, AdRequestInfoParcel

public class zzb extends zzhh
    implements zzc.zza
{
    static final class zza extends Exception
    {

        private final int zzBv;

        public int getErrorCode()
        {
            return zzBv;
        }

        public zza(String s, int i)
        {
            super(s);
            zzBv = i;
        }
    }


    private final Context mContext;
    private final Object zzBr = new Object();
    AdResponseParcel zzBt;
    private final zza.zza zzCd;
    private final AdRequestInfoParcel.zza zzCe;
    zzhh zzCf;
    Object zzqt;
    private final zzan zzvA;
    zzdy zzxn;

    public zzb(Context context, AdRequestInfoParcel.zza zza1, zzan zzan1, zza.zza zza2)
    {
        zzqt = new Object();
        zzCd = zza2;
        mContext = context;
        zzCe = zza1;
        zzvA = zzan1;
    }

    static zza.zza zza(zzb zzb1)
    {
        return zzb1.zzCd;
    }

    public void onStop()
    {
        synchronized (zzBr)
        {
            if (zzCf != null)
            {
                zzCf.cancel();
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    zzhh zzb(AdRequestInfoParcel adrequestinfoparcel)
    {
        return com.google.android.gms.ads.internal.request.zzc.zza(mContext, adrequestinfoparcel, this);
    }

    public void zzb(AdResponseParcel adresponseparcel)
    {
        synchronized (zzqt)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzay("Received ad response.");
            zzBt = adresponseparcel;
            zzqt.notify();
        }
        return;
        adresponseparcel;
        obj;
        JVM INSTR monitorexit ;
        throw adresponseparcel;
    }

    protected AdSizeParcel zzc(AdRequestInfoParcel adrequestinfoparcel)
        throws zza
    {
        if (zzBt.zzCN == null)
        {
            throw new zza("The ad response must specify one of the supported ad sizes.", 0);
        }
        Object aobj[] = zzBt.zzCN.split("x");
        if (aobj.length != 2)
        {
            throw new zza((new StringBuilder()).append("Invalid ad size format from the ad response: ").append(zzBt.zzCN).toString(), 0);
        }
        int l;
        int i1;
        int j1;
        try
        {
            l = Integer.parseInt(aobj[0]);
            i1 = Integer.parseInt(aobj[1]);
        }
        // Misplaced declaration of an exception variable
        catch (AdRequestInfoParcel adrequestinfoparcel)
        {
            throw new zza((new StringBuilder()).append("Invalid ad size number from the ad response: ").append(zzBt.zzCN).toString(), 0);
        }
        aobj = adrequestinfoparcel.zzpN.zzso;
        j1 = aobj.length;
        AdSizeParcel adsizeparcel;
        int j;
        int k;
        for (int i = 0; i < j1; i++)
        {
            adsizeparcel = aobj[i];
            float f = mContext.getResources().getDisplayMetrics().density;
            if (adsizeparcel.width == -1)
            {
                j = (int)((float)adsizeparcel.widthPixels / f);
            } else
            {
                j = adsizeparcel.width;
            }
            if (adsizeparcel.height == -2)
            {
                k = (int)((float)adsizeparcel.heightPixels / f);
            } else
            {
                k = adsizeparcel.height;
            }
            if (l == j && i1 == k)
            {
                return new AdSizeParcel(adsizeparcel, adrequestinfoparcel.zzpN.zzso);
            }
        }

        throw new zza((new StringBuilder()).append("The ad size from the ad response was not one of the requested sizes: ").append(zzBt.zzCN).toString(), 0);
    }

    public void zzdP()
    {
        Object obj2 = zzqt;
        obj2;
        JVM INSTR monitorenter ;
        AdRequestInfoParcel adrequestinfoparcel;
        com.google.android.gms.ads.internal.util.client.zzb.zzay("AdLoaderBackgroundTask started.");
        String s = zzvA.zzab().zzb(mContext);
        String s1 = zzl.zzq(mContext).getClientId();
        adrequestinfoparcel = new AdRequestInfoParcel(zzCe, s, s1);
        int i;
        long l;
        long l1;
        i = -2;
        l1 = -1L;
        l = l1;
        long l2 = zzo.zzbz().elapsedRealtime();
        l = l1;
        Object obj1 = zzb(adrequestinfoparcel);
        l = l1;
        Object obj = zzBr;
        l = l1;
        obj;
        JVM INSTR monitorenter ;
        zzCf = ((zzhh) (obj1));
        if (zzCf == null)
        {
            throw new zza("Could not start the ad request service.", 0);
        }
          goto _L1
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        l = l1;
        throw exception;
        exception;
        obj = null;
_L12:
        i = exception.getErrorCode();
        if (i != 3 && i != -1) goto _L3; else goto _L2
_L2:
        com.google.android.gms.ads.internal.util.client.zzb.zzaA(exception.getMessage());
_L9:
        if (zzBt != null) goto _L5; else goto _L4
_L4:
        zzBt = new AdResponseParcel(i);
_L10:
        zzhl.zzGk.post(new Runnable() {

            final zzb zzCg;

            public void run()
            {
                zzCg.onStop();
            }

            
            {
                zzCg = zzb.this;
                super();
            }
        });
_L8:
        boolean flag = TextUtils.isEmpty(zzBt.zzCS);
        if (flag) goto _L7; else goto _L6
_L6:
        exception = new JSONObject(zzBt.zzCS);
_L11:
        obj = new com.google.android.gms.internal.zzha.zza(adrequestinfoparcel, zzBt, zzxn, ((AdSizeParcel) (obj)), i, l, zzBt.zzCO, exception);
        zzhl.zzGk.post(new Runnable(((com.google.android.gms.internal.zzha.zza) (obj))) {

            final zzb zzCg;
            final com.google.android.gms.internal.zzha.zza zzCh;

            public void run()
            {
                synchronized (zzCg.zzqt)
                {
                    zzb.zza(zzCg).zza(zzCh);
                }
                return;
                exception1;
                obj3;
                JVM INSTR monitorexit ;
                throw exception1;
            }

            
            {
                zzCg = zzb.this;
                zzCh = zza1;
                super();
            }
        });
        obj2;
        JVM INSTR monitorexit ;
        return;
_L1:
        obj;
        JVM INSTR monitorexit ;
        l = l1;
        zzi(l2);
        l = l1;
        l1 = zzo.zzbz().elapsedRealtime();
        l = l1;
        zzfu();
        l = l1;
        if (adrequestinfoparcel.zzpN.zzso == null)
        {
            break MISSING_BLOCK_LABEL_418;
        }
        l = l1;
        obj = zzc(adrequestinfoparcel);
_L13:
        zzw(zzBt.zzCU);
        l = l1;
          goto _L8
_L3:
        com.google.android.gms.ads.internal.util.client.zzb.zzaC(exception.getMessage());
          goto _L9
        obj;
        obj2;
        JVM INSTR monitorexit ;
        throw obj;
_L5:
        zzBt = new AdResponseParcel(i, zzBt.zzxJ);
          goto _L10
        exception;
        com.google.android.gms.ads.internal.util.client.zzb.zzb("Error parsing the JSON for Active View.", exception);
_L7:
        exception = null;
          goto _L11
        exception;
        l = l1;
          goto _L12
        obj = null;
          goto _L13
    }

    protected boolean zze(long l)
        throws zza
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
            throw new zza("Ad request cancelled.", -1);
        }
        return true;
    }

    protected void zzfu()
        throws zza
    {
        if (zzBt.errorCode != -3)
        {
            if (TextUtils.isEmpty(zzBt.zzCI))
            {
                throw new zza("No fill from ad server.", 3);
            }
            zzo.zzby().zza(mContext, zzBt.zzCu);
            if (zzBt.zzCK)
            {
                try
                {
                    zzxn = new zzdy(zzBt.zzCI);
                    return;
                }
                catch (JSONException jsonexception)
                {
                    throw new zza((new StringBuilder()).append("Could not parse mediation config: ").append(zzBt.zzCI).toString(), 0);
                }
            }
        }
    }

    protected void zzi(long l)
        throws zza
    {
        do
        {
            if (!zze(l))
            {
                throw new zza("Timed out waiting for ad response.", 2);
            }
        } while (zzBt == null);
        synchronized (zzBr)
        {
            zzCf = null;
        }
        if (zzBt.errorCode != -2 && zzBt.errorCode != -3)
        {
            throw new zza((new StringBuilder()).append("There was a problem getting an ad response. ErrorCode: ").append(zzBt.errorCode).toString(), zzBt.errorCode);
        } else
        {
            return;
        }
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected void zzw(boolean flag)
    {
        zzo.zzby().zzA(flag);
        zzbk zzbk1 = zzo.zzby().zzD(mContext);
        if (zzbk1 != null && !zzbk1.isAlive())
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzay("start fetching content...");
            zzbk1.zzcp();
        }
    }
}
