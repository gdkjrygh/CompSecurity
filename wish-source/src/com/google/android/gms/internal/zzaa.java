// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.Handler;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.zzj;
import com.google.android.gms.ads.internal.overlay.zzf;
import com.google.android.gms.ads.internal.overlay.zzi;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zza;
import com.google.android.gms.ads.internal.zzb;
import com.google.android.gms.ads.internal.zzh;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            zzy, zzgf, zzfl, zzgd, 
//            zzge, zzbq, zzbu, zzbw, 
//            zzdh, zzbs

public class zzaa
    implements zzy
{

    private final zzgd zznp;

    public zzaa(Context context, VersionInfoParcel versioninfoparcel)
    {
        zznp = com.google.android.gms.ads.internal.zzh.zzaR().zza(context, new AdSizeParcel(), false, false, null, versioninfoparcel);
    }

    private void runOnUiThread(Runnable runnable)
    {
        if (zzj.zzbJ().zzfk())
        {
            runnable.run();
            return;
        } else
        {
            zzfl.zzCr.post(runnable);
            return;
        }
    }

    static zzgd zza(zzaa zzaa1)
    {
        return zzaa1.zznp;
    }

    public void destroy()
    {
        zznp.destroy();
    }

    public void zza(com.google.android.gms.ads.internal.client.zza zza1, zzf zzf, zzbq zzbq, zzi zzi1, boolean flag, zzbu zzbu, zzbw zzbw, 
            zzb zzb1, zzdh zzdh)
    {
        zznp.zzft().zzb(zza1, zzf, zzbq, zzi1, flag, zzbu, zzbw, new zzb(false), zzdh);
    }

    public void zza(zzy.zza zza1)
    {
        zznp.zzft().zza(new zzge.zza(zza1) {

            final zzaa zzoP;
            final zzy.zza zzoS;

            public void zza(zzgd zzgd1, boolean flag)
            {
                zzoS.zzbq();
            }

            
            {
                zzoP = zzaa.this;
                zzoS = zza1;
                super();
            }
        });
    }

    public void zza(String s, zzbs zzbs)
    {
        zznp.zzft().zza(s, zzbs);
    }

    public void zza(String s, JSONObject jsonobject)
    {
        runOnUiThread(new Runnable(s, jsonobject) {

            final String zzoN;
            final JSONObject zzoO;
            final zzaa zzoP;

            public void run()
            {
                com.google.android.gms.internal.zzaa.zza(zzoP).zza(zzoN, zzoO);
            }

            
            {
                zzoP = zzaa.this;
                zzoN = s;
                zzoO = jsonobject;
                super();
            }
        });
    }

    public void zzb(String s, zzbs zzbs)
    {
        zznp.zzft().zzb(s, zzbs);
    }

    public void zzb(String s, String s1)
    {
        runOnUiThread(new Runnable(s, s1) {

            final String zzoN;
            final zzaa zzoP;
            final String zzoQ;

            public void run()
            {
                com.google.android.gms.internal.zzaa.zza(zzoP).zzb(zzoN, zzoQ);
            }

            
            {
                zzoP = zzaa.this;
                zzoN = s;
                zzoQ = s1;
                super();
            }
        });
    }

    public void zzg(String s)
    {
        runOnUiThread(new Runnable(String.format("<!DOCTYPE html><html><head><script src=\"%s\"></script></head><body></body></html>", new Object[] {
            s
        })) {

            final zzaa zzoP;
            final String zzoR;

            public void run()
            {
                com.google.android.gms.internal.zzaa.zza(zzoP).loadData(zzoR, "text/html", "UTF-8");
            }

            
            {
                zzoP = zzaa.this;
                zzoR = s;
                super();
            }
        });
    }

    public void zzh(String s)
    {
        runOnUiThread(new Runnable(s) {

            final String zzoK;
            final zzaa zzoP;

            public void run()
            {
                com.google.android.gms.internal.zzaa.zza(zzoP).loadUrl(zzoK);
            }

            
            {
                zzoP = zzaa.this;
                zzoK = s;
                super();
            }
        });
    }

    public void zzi(String s)
    {
        runOnUiThread(new Runnable(s) {

            final zzaa zzoP;
            final String zzoR;

            public void run()
            {
                com.google.android.gms.internal.zzaa.zza(zzoP).loadData(zzoR, "text/html", "UTF-8");
            }

            
            {
                zzoP = zzaa.this;
                zzoR = s;
                super();
            }
        });
    }
}
