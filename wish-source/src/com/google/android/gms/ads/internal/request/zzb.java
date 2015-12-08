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
import com.google.android.gms.ads.internal.zzf;
import com.google.android.gms.ads.internal.zzh;
import com.google.android.gms.internal.zzae;
import com.google.android.gms.internal.zzck;
import com.google.android.gms.internal.zzfc;
import com.google.android.gms.internal.zzfh;
import com.google.android.gms.internal.zzfl;
import com.google.android.gms.internal.zzg;
import com.google.android.gms.internal.zzht;
import com.google.android.gms.internal.zzk;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.ads.internal.request:
//            zzc, AdResponseParcel, AdRequestInfoParcel

public class zzb extends zzfh
    implements zzc.zza
{
    static final class zza extends Exception
    {

        private final int zzyl;

        public int getErrorCode()
        {
            return zzyl;
        }

        public zza(String s, int i)
        {
            super(s);
            zzyl = i;
        }
    }


    private final Context mContext;
    Object zzoe;
    private final zzk zzsW;
    zzck zzum;
    private final zza.zza zzyN;
    private final AdRequestInfoParcel.zza zzyO;
    zzfh zzyP;
    private final Object zzyg = new Object();
    AdResponseParcel zzyi;

    public zzb(Context context, AdRequestInfoParcel.zza zza1, zzk zzk1, zza.zza zza2)
    {
        zzoe = new Object();
        zzyN = zza2;
        mContext = context;
        zzyO = zza1;
        zzsW = zzk1;
    }

    static zza.zza zza(zzb zzb1)
    {
        return zzb1.zzyN;
    }

    public void onStop()
    {
        synchronized (zzyg)
        {
            if (zzyP != null)
            {
                zzyP.cancel();
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    zzfh zzb(AdRequestInfoParcel adrequestinfoparcel)
    {
        return com.google.android.gms.ads.internal.request.zzc.zza(mContext, adrequestinfoparcel, this);
    }

    public void zzb(AdResponseParcel adresponseparcel)
    {
        synchronized (zzoe)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaj("Received ad response.");
            zzyi = adresponseparcel;
            zzoe.notify();
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
        if (zzyi.zzzw == null)
        {
            throw new zza("The ad response must specify one of the supported ad sizes.", 0);
        }
        Object aobj[] = zzyi.zzzw.split("x");
        if (aobj.length != 2)
        {
            throw new zza((new StringBuilder()).append("Invalid ad size format from the ad response: ").append(zzyi.zzzw).toString(), 0);
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
            throw new zza((new StringBuilder()).append("Invalid ad size number from the ad response: ").append(zzyi.zzzw).toString(), 0);
        }
        aobj = adrequestinfoparcel.zzmP.zzpZ;
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
                return new AdSizeParcel(adsizeparcel, adrequestinfoparcel.zzmP.zzpZ);
            }
        }

        throw new zza((new StringBuilder()).append("The ad size from the ad response was not one of the requested sizes: ").append(zzyi.zzzw).toString(), 0);
    }

    public void zzcX()
    {
        Object obj2 = zzoe;
        obj2;
        JVM INSTR monitorenter ;
        AdRequestInfoParcel adrequestinfoparcel;
        com.google.android.gms.ads.internal.util.client.zzb.zzaj("AdLoaderBackgroundTask started.");
        String s = zzsW.zzC().zza(mContext);
        String s1 = zzf.zzl(mContext).getClientId();
        adrequestinfoparcel = new AdRequestInfoParcel(zzyO, s, s1);
        int i;
        long l;
        long l1;
        i = -2;
        l1 = -1L;
        l = l1;
        long l2 = com.google.android.gms.ads.internal.zzh.zzaU().elapsedRealtime();
        l = l1;
        Object obj1 = zzb(adrequestinfoparcel);
        l = l1;
        Object obj = zzyg;
        l = l1;
        obj;
        JVM INSTR monitorenter ;
        zzyP = ((zzfh) (obj1));
        if (zzyP == null)
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
        com.google.android.gms.ads.internal.util.client.zzb.zzal(exception.getMessage());
_L9:
        if (zzyi != null) goto _L5; else goto _L4
_L4:
        zzyi = new AdResponseParcel(i);
_L10:
        zzfl.zzCr.post(new Runnable() {

            final zzb zzyQ;

            public void run()
            {
                zzyQ.onStop();
            }

            
            {
                zzyQ = zzb.this;
                super();
            }
        });
_L8:
        boolean flag = TextUtils.isEmpty(zzyi.zzzB);
        if (flag) goto _L7; else goto _L6
_L6:
        exception = new JSONObject(zzyi.zzzB);
_L11:
        obj = new com.google.android.gms.internal.zzfa.zza(adrequestinfoparcel, zzyi, zzum, ((AdSizeParcel) (obj)), i, l, zzyi.zzzx, exception);
        zzfl.zzCr.post(new Runnable(((com.google.android.gms.internal.zzfa.zza) (obj))) {

            final zzb zzyQ;
            final com.google.android.gms.internal.zzfa.zza zzyR;

            public void run()
            {
                synchronized (zzyQ.zzoe)
                {
                    zzb.zza(zzyQ).zza(zzyR);
                }
                return;
                exception1;
                obj3;
                JVM INSTR monitorexit ;
                throw exception1;
            }

            
            {
                zzyQ = zzb.this;
                zzyR = zza1;
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
        zzh(l2);
        l = l1;
        l1 = com.google.android.gms.ads.internal.zzh.zzaU().elapsedRealtime();
        l = l1;
        zzen();
        l = l1;
        if (adrequestinfoparcel.zzmP.zzpZ == null)
        {
            break MISSING_BLOCK_LABEL_418;
        }
        l = l1;
        obj = zzc(adrequestinfoparcel);
_L13:
        zzw(zzyi.zzzD);
        l = l1;
          goto _L8
_L3:
        com.google.android.gms.ads.internal.util.client.zzb.zzan(exception.getMessage());
          goto _L9
        obj;
        obj2;
        JVM INSTR monitorexit ;
        throw obj;
_L5:
        zzyi = new AdResponseParcel(i, zzyi.zzuG);
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

    protected boolean zzd(long l)
        throws zza
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
            throw new zza("Ad request cancelled.", -1);
        }
        return true;
    }

    protected void zzen()
        throws zza
    {
        if (zzyi.errorCode != -3)
        {
            if (TextUtils.isEmpty(zzyi.zzzr))
            {
                throw new zza("No fill from ad server.", 3);
            }
            com.google.android.gms.ads.internal.zzh.zzaT().zza(mContext, zzyi.zzze);
            if (zzyi.zzzt)
            {
                try
                {
                    zzum = new zzck(zzyi.zzzr);
                    return;
                }
                catch (JSONException jsonexception)
                {
                    throw new zza((new StringBuilder()).append("Could not parse mediation config: ").append(zzyi.zzzr).toString(), 0);
                }
            }
        }
    }

    protected void zzh(long l)
        throws zza
    {
        do
        {
            if (!zzd(l))
            {
                throw new zza("Timed out waiting for ad response.", 2);
            }
        } while (zzyi == null);
        synchronized (zzyg)
        {
            zzyP = null;
        }
        if (zzyi.errorCode != -2 && zzyi.errorCode != -3)
        {
            throw new zza((new StringBuilder()).append("There was a problem getting an ad response. ErrorCode: ").append(zzyi.errorCode).toString(), zzyi.errorCode);
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
        com.google.android.gms.ads.internal.zzh.zzaT().zzA(flag);
        zzae zzae1 = com.google.android.gms.ads.internal.zzh.zzaT().zzs(mContext);
        if (zzae1 != null && !zzae1.isAlive())
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaj("start fetching content...");
            zzae1.zzbz();
        }
    }
}
