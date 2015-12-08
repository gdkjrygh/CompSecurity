// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.analytics.AnalyticsReceiver;
import com.google.android.gms.analytics.AnalyticsService;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.internal.zzof;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

// Referenced classes of package com.google.android.gms.analytics.internal:
//            zzd, zzg, zzl, zzf, 
//            zzh, zzab, zzw

public class zzb extends zzd
{

    private final zzl zzLq;

    public zzb(zzf zzf, zzg zzg1)
    {
        super(zzf);
        zzx.zzv(zzg1);
        zzLq = zzg1.zzj(zzf);
    }

    static zzl zza(zzb zzb1)
    {
        return zzb1.zzLq;
    }

    void onServiceConnected()
    {
        zzic();
        zzLq.onServiceConnected();
    }

    public void setLocalDispatchPeriod(int i)
    {
        zzio();
        zzb("setLocalDispatchPeriod (sec)", Integer.valueOf(i));
        zzig().zzf(new Runnable(i) {

            final int zzLr;
            final zzb zzLs;

            public void run()
            {
                zzb.zza(zzLs).zzs((long)zzLr * 1000L);
            }

            
            {
                zzLs = zzb.this;
                zzLr = i;
                super();
            }
        });
    }

    public void start()
    {
        zzLq.start();
    }

    public void zzI(boolean flag)
    {
        zza("Network connectivity status changed", Boolean.valueOf(flag));
        zzig().zzf(new Runnable(flag) {

            final zzb zzLs;
            final boolean zzLt;

            public void run()
            {
                zzb.zza(zzLs).zzI(zzLt);
            }

            
            {
                zzLs = zzb.this;
                zzLt = flag;
                super();
            }
        });
    }

    public long zza(zzh zzh)
    {
        zzio();
        zzx.zzv(zzh);
        zzic();
        long l = zzLq.zza(zzh, true);
        if (l == 0L)
        {
            zzLq.zzc(zzh);
        }
        return l;
    }

    public void zza(zzab zzab)
    {
        zzx.zzv(zzab);
        zzio();
        zzb("Hit delivery requested", zzab);
        zzig().zzf(new Runnable(zzab) {

            final zzb zzLs;
            final zzab zzLw;

            public void run()
            {
                zzb.zza(zzLs).zza(zzLw);
            }

            
            {
                zzLs = zzb.this;
                zzLw = zzab;
                super();
            }
        });
    }

    public void zza(zzw zzw)
    {
        zzio();
        zzig().zzf(new Runnable(zzw) {

            final zzb zzLs;
            final zzw zzLx;

            public void run()
            {
                zzb.zza(zzLs).zzb(zzLx);
            }

            
            {
                zzLs = zzb.this;
                zzLx = zzw;
                super();
            }
        });
    }

    public void zza(String s, Runnable runnable)
    {
        zzx.zzh(s, "campaign param can't be empty");
        zzig().zzf(new Runnable(s, runnable) {

            final zzb zzLs;
            final String zzLu;
            final Runnable zzLv;

            public void run()
            {
                zzb.zza(zzLs).zzbg(zzLu);
                if (zzLv != null)
                {
                    zzLv.run();
                }
            }

            
            {
                zzLs = zzb.this;
                zzLu = s;
                zzLv = runnable;
                super();
            }
        });
    }

    protected void zzhB()
    {
        zzLq.zza();
    }

    public void zzhU()
    {
        zzio();
        zzib();
        zzig().zzf(new Runnable() {

            final zzb zzLs;

            public void run()
            {
                zzb.zza(zzLs).zzhU();
            }

            
            {
                zzLs = zzb.this;
                super();
            }
        });
    }

    public void zzhV()
    {
        zzio();
        Context context = getContext();
        if (AnalyticsReceiver.zzV(context) && AnalyticsService.zzW(context))
        {
            Intent intent = new Intent(context, com/google/android/gms/analytics/AnalyticsService);
            intent.setAction("com.google.android.gms.analytics.ANALYTICS_DISPATCH");
            context.startService(intent);
            return;
        } else
        {
            zza(((zzw) (null)));
            return;
        }
    }

    public boolean zzhW()
    {
        zzio();
        Future future = zzig().zzb(new Callable() {

            final zzb zzLs;

            public Object call()
                throws Exception
            {
                return zzgp();
            }

            public Void zzgp()
                throws Exception
            {
                zzb.zza(zzLs).zziT();
                return null;
            }

            
            {
                zzLs = zzb.this;
                super();
            }
        });
        try
        {
            future.get();
        }
        catch (InterruptedException interruptedexception)
        {
            zzd("syncDispatchLocalHits interrupted", interruptedexception);
            return false;
        }
        catch (ExecutionException executionexception)
        {
            zze("syncDispatchLocalHits failed", executionexception);
            return false;
        }
        return true;
    }

    public void zzhX()
    {
        zzio();
        zzof.zzic();
        zzLq.zzhX();
    }

    public void zzhY()
    {
        zzaY("Radio powered up");
        zzhV();
    }

    void zzhZ()
    {
        zzic();
        zzLq.zzhZ();
    }
}
