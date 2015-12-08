// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.Handler;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.zzk;
import com.google.android.gms.ads.internal.overlay.zzf;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zza;
import com.google.android.gms.ads.internal.zzd;
import com.google.android.gms.ads.internal.zzo;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            zzbb, zzif, zzid, zzhl, 
//            zzie, zzbg, zzde, zzdi, 
//            zzdk, zzev, zzdg, zzbf

public class zzbd
    implements zzbb
{

    private final zzid zzoA;

    public zzbd(Context context, VersionInfoParcel versioninfoparcel)
    {
        zzoA = zzo.zzbw().zza(context, new AdSizeParcel(), false, false, null, versioninfoparcel);
        zzoA.setWillNotDraw(true);
    }

    private void runOnUiThread(Runnable runnable)
    {
        if (zzk.zzcA().zzgw())
        {
            runnable.run();
            return;
        } else
        {
            zzhl.zzGk.post(runnable);
            return;
        }
    }

    static zzid zza(zzbd zzbd1)
    {
        return zzbd1.zzoA;
    }

    public void destroy()
    {
        zzoA.destroy();
    }

    public void zza(com.google.android.gms.ads.internal.client.zza zza1, zzf zzf, zzde zzde, com.google.android.gms.ads.internal.overlay.zzk zzk1, boolean flag, zzdi zzdi, zzdk zzdk, 
            zzd zzd1, zzev zzev)
    {
        zzoA.zzgF().zzb(zza1, zzf, zzde, zzk1, flag, zzdi, zzdk, new zzd(false), zzev);
    }

    public void zza(zzbb.zza zza1)
    {
        zzoA.zzgF().zza(new zzie.zza(zza1) {

            final zzbd zzrd;
            final zzbb.zza zzrg;

            public void zza(zzid zzid1, boolean flag)
            {
                zzrg.zzcf();
            }

            
            {
                zzrd = zzbd.this;
                zzrg = zza1;
                super();
            }
        });
    }

    public void zza(String s, zzdg zzdg)
    {
        zzoA.zzgF().zza(s, zzdg);
    }

    public void zza(String s, String s1)
    {
        runOnUiThread(new Runnable(s, s1) {

            final String zzrb;
            final zzbd zzrd;
            final String zzre;

            public void run()
            {
                com.google.android.gms.internal.zzbd.zza(zzrd).zza(zzrb, zzre);
            }

            
            {
                zzrd = zzbd.this;
                zzrb = s;
                zzre = s1;
                super();
            }
        });
    }

    public void zza(String s, JSONObject jsonobject)
    {
        runOnUiThread(new Runnable(s, jsonobject) {

            final String zzrb;
            final JSONObject zzrc;
            final zzbd zzrd;

            public void run()
            {
                com.google.android.gms.internal.zzbd.zza(zzrd).zza(zzrb, zzrc);
            }

            
            {
                zzrd = zzbd.this;
                zzrb = s;
                zzrc = jsonobject;
                super();
            }
        });
    }

    public void zzb(String s, zzdg zzdg)
    {
        zzoA.zzgF().zzb(s, zzdg);
    }

    public zzbf zzce()
    {
        return new zzbg(this);
    }

    public void zzr(String s)
    {
        runOnUiThread(new Runnable(String.format("<!DOCTYPE html><html><head><script src=\"%s\"></script></head><body></body></html>", new Object[] {
            s
        })) {

            final zzbd zzrd;
            final String zzrf;

            public void run()
            {
                com.google.android.gms.internal.zzbd.zza(zzrd).loadData(zzrf, "text/html", "UTF-8");
            }

            
            {
                zzrd = zzbd.this;
                zzrf = s;
                super();
            }
        });
    }

    public void zzs(String s)
    {
        runOnUiThread(new Runnable(s) {

            final String zzqY;
            final zzbd zzrd;

            public void run()
            {
                com.google.android.gms.internal.zzbd.zza(zzrd).loadUrl(zzqY);
            }

            
            {
                zzrd = zzbd.this;
                zzqY = s;
                super();
            }
        });
    }

    public void zzt(String s)
    {
        runOnUiThread(new Runnable(s) {

            final zzbd zzrd;
            final String zzrf;

            public void run()
            {
                com.google.android.gms.internal.zzbd.zza(zzrd).loadData(zzrf, "text/html", "UTF-8");
            }

            
            {
                zzrd = zzbd.this;
                zzrf = s;
                super();
            }
        });
    }
}
