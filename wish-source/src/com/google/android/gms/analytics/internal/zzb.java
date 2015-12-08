// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.google.android.gms.analytics.AnalyticsReceiver;
import com.google.android.gms.analytics.AnalyticsService;
import com.google.android.gms.common.internal.zzv;
import com.google.android.gms.internal.zzkk;

// Referenced classes of package com.google.android.gms.analytics.internal:
//            zzd, zzf, zzq, zzk, 
//            zze, zzg, zzaa, zzv

public class zzb extends zzd
{

    private final zzk zzFu;
    private final String zzFv = zzgC();

    public zzb(zze zze, zzf zzf1)
    {
        super(zze);
        zzv.zzr(zzf1);
        zzFu = zzf1.zzj(zze);
    }

    static zzk zza(zzb zzb1)
    {
        return zzb1.zzFu;
    }

    private String zzgC()
    {
        if (!zzgI().zzhO())
        {
            return "";
        }
        String s;
        String s1;
        try
        {
            s1 = String.valueOf(getContext().getPackageManager().getPackageInfo(getContext().getPackageName(), 0).versionCode);
        }
        catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
        {
            zze("Failed to get service version", namenotfoundexception);
            return "0";
        }
        s = s1;
        if (s1.length() > 4)
        {
            s = s1.substring(0, 4);
        }
        s = (new StringBuilder()).append("4.5.0-").append(s).toString();
        return s;
    }

    void onServiceConnected()
    {
        zzgF();
        zzFu.onServiceConnected();
    }

    public void setLocalDispatchPeriod(int i)
    {
        zzgR();
        zzb("setLocalDispatchPeriod (sec)", Integer.valueOf(i));
        zzgJ().zze(new Runnable(i) {

            final int zzFw;
            final zzb zzFx;

            public void run()
            {
                zzb.zza(zzFx).zzq((long)zzFw * 1000L);
            }

            
            {
                zzFx = zzb.this;
                zzFw = i;
                super();
            }
        });
    }

    public void start()
    {
        zzFu.start();
    }

    public void zzG(boolean flag)
    {
        zza("Network connectivity status changed", Boolean.valueOf(flag));
        zzgJ().zze(new Runnable(flag) {

            final zzb zzFx;
            final boolean zzFy;

            public void run()
            {
                zzb.zza(zzFx).zzG(zzFy);
            }

            
            {
                zzFx = zzb.this;
                zzFy = flag;
                super();
            }
        });
    }

    public long zza(zzg zzg)
    {
        zzgR();
        zzv.zzr(zzg);
        zzgF();
        long l = zzFu.zza(zzg, true);
        if (l == 0L)
        {
            zzFu.zzc(zzg);
        }
        return l;
    }

    public void zza(zzaa zzaa)
    {
        zzv.zzr(zzaa);
        zzgR();
        zzb("Hit delivery requested", zzaa);
        zzgJ().zze(new Runnable(zzaa) {

            final zzaa zzFB;
            final zzb zzFx;

            public void run()
            {
                zzb.zza(zzFx).zza(zzFB);
            }

            
            {
                zzFx = zzb.this;
                zzFB = zzaa;
                super();
            }
        });
    }

    public void zza(com.google.android.gms.analytics.internal.zzv zzv1)
    {
        zzgR();
        zzgJ().zze(new Runnable(zzv1) {

            final com.google.android.gms.analytics.internal.zzv zzFC;
            final zzb zzFx;

            public void run()
            {
                zzb.zza(zzFx).zzb(zzFC);
            }

            
            {
                zzFx = zzb.this;
                zzFC = zzv1;
                super();
            }
        });
    }

    public void zza(String s, Runnable runnable)
    {
        zzv.zzh(s, "campaign param can't be empty");
        zzgJ().zze(new Runnable(s, runnable) {

            final Runnable zzFA;
            final zzb zzFx;
            final String zzFz;

            public void run()
            {
                zzb.zza(zzFx).zzaN(zzFz);
                if (zzFA != null)
                {
                    zzFA.run();
                }
            }

            
            {
                zzFx = zzb.this;
                zzFz = s;
                zzFA = runnable;
                super();
            }
        });
    }

    public void zzgA()
    {
        zzaF("Radio powered up");
        zzgw();
    }

    void zzgB()
    {
        zzgF();
        zzFu.zzgB();
    }

    protected void zzgb()
    {
        zzFu.zzfV();
    }

    public void zzgw()
    {
        zzgR();
        Context context = getContext();
        if (AnalyticsReceiver.zzH(context) && AnalyticsService.zzI(context))
        {
            Intent intent = new Intent(context, com/google/android/gms/analytics/AnalyticsService);
            intent.setAction("com.google.android.gms.analytics.ANALYTICS_DISPATCH");
            context.startService(intent);
            return;
        } else
        {
            zza(((com.google.android.gms.analytics.internal.zzv) (null)));
            return;
        }
    }

    public String zzgy()
    {
        return zzFv;
    }

    public void zzgz()
    {
        zzgR();
        zzkk.zzgF();
        zzFu.zzgz();
    }
}
