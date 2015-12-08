// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.Handler;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.zzk;
import com.google.android.gms.ads.internal.overlay.zzg;
import com.google.android.gms.ads.internal.overlay.zzn;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zza;
import com.google.android.gms.ads.internal.zze;
import com.google.android.gms.ads.internal.zzp;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            zzbb, zzir, zzip, zzhu, 
//            zziq, zzbg, zzan, zzdd, 
//            zzdi, zzdk, zzfc, zzdg, 
//            zzbf

public class zzbd
    implements zzbb
{

    private final zzip zzoL;

    public zzbd(Context context, VersionInfoParcel versioninfoparcel, zzan zzan)
    {
        zzoL = zzp.zzby().zza(context, new AdSizeParcel(), false, false, zzan, versioninfoparcel);
        zzoL.setWillNotDraw(true);
    }

    private void runOnUiThread(Runnable runnable)
    {
        if (zzk.zzcE().zzgI())
        {
            runnable.run();
            return;
        } else
        {
            zzhu.zzHK.post(runnable);
            return;
        }
    }

    static zzip zza(zzbd zzbd1)
    {
        return zzbd1.zzoL;
    }

    public void destroy()
    {
        zzoL.destroy();
    }

    public void zza(com.google.android.gms.ads.internal.client.zza zza1, zzg zzg, zzdd zzdd, zzn zzn, boolean flag, zzdi zzdi, zzdk zzdk, 
            zze zze1, zzfc zzfc)
    {
        zzoL.zzgS().zzb(zza1, zzg, zzdd, zzn, flag, zzdi, zzdk, new zze(false), zzfc);
    }

    public void zza(zzbb.zza zza1)
    {
        zzoL.zzgS().zza(new zziq.zza(zza1) {

            final zzbd zzrw;
            final zzbb.zza zzrz;

            public void zza(zzip zzip1, boolean flag)
            {
                zzrz.zzcj();
            }

            
            {
                zzrw = zzbd.this;
                zzrz = zza1;
                super();
            }
        });
    }

    public void zza(String s, zzdg zzdg)
    {
        zzoL.zzgS().zza(s, zzdg);
    }

    public void zza(String s, String s1)
    {
        runOnUiThread(new Runnable(s, s1) {

            final String zzru;
            final zzbd zzrw;
            final String zzrx;

            public void run()
            {
                com.google.android.gms.internal.zzbd.zza(zzrw).zza(zzru, zzrx);
            }

            
            {
                zzrw = zzbd.this;
                zzru = s;
                zzrx = s1;
                super();
            }
        });
    }

    public void zza(String s, JSONObject jsonobject)
    {
        runOnUiThread(new Runnable(s, jsonobject) {

            final String zzru;
            final JSONObject zzrv;
            final zzbd zzrw;

            public void run()
            {
                com.google.android.gms.internal.zzbd.zza(zzrw).zza(zzru, zzrv);
            }

            
            {
                zzrw = zzbd.this;
                zzru = s;
                zzrv = jsonobject;
                super();
            }
        });
    }

    public void zzb(String s, zzdg zzdg)
    {
        zzoL.zzgS().zzb(s, zzdg);
    }

    public void zzb(String s, JSONObject jsonobject)
    {
        zzoL.zzb(s, jsonobject);
    }

    public zzbf zzci()
    {
        return new zzbg(this);
    }

    public void zzs(String s)
    {
        runOnUiThread(new Runnable(String.format("<!DOCTYPE html><html><head><script src=\"%s\"></script></head><body></body></html>", new Object[] {
            s
        })) {

            final zzbd zzrw;
            final String zzry;

            public void run()
            {
                com.google.android.gms.internal.zzbd.zza(zzrw).loadData(zzry, "text/html", "UTF-8");
            }

            
            {
                zzrw = zzbd.this;
                zzry = s;
                super();
            }
        });
    }

    public void zzt(String s)
    {
        runOnUiThread(new Runnable(s) {

            final String zzrr;
            final zzbd zzrw;

            public void run()
            {
                com.google.android.gms.internal.zzbd.zza(zzrw).loadUrl(zzrr);
            }

            
            {
                zzrw = zzbd.this;
                zzrr = s;
                super();
            }
        });
    }

    public void zzu(String s)
    {
        runOnUiThread(new Runnable(s) {

            final zzbd zzrw;
            final String zzry;

            public void run()
            {
                com.google.android.gms.internal.zzbd.zza(zzrw).loadData(zzry, "text/html", "UTF-8");
            }

            
            {
                zzrw = zzbd.this;
                zzry = s;
                super();
            }
        });
    }
}
