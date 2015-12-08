// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.zzo;

// Referenced classes of package com.google.android.gms.internal:
//            zzid, zzil, zzhl

public class zzfq
    implements Runnable
{

    private final Handler zzBf;
    private final long zzBg;
    private long zzBh;
    private zzie.zza zzBi;
    protected boolean zzBj;
    protected boolean zzBk;
    private final int zznM;
    private final int zznN;
    protected final zzid zzoA;

    public zzfq(zzie.zza zza1, zzid zzid1, int i, int j)
    {
        this(zza1, zzid1, i, j, 200L, 50L);
    }

    public zzfq(zzie.zza zza1, zzid zzid1, int i, int j, long l, long l1)
    {
        zzBg = l;
        zzBh = l1;
        zzBf = new Handler(Looper.getMainLooper());
        zzoA = zzid1;
        zzBi = zza1;
        zzBj = false;
        zzBk = false;
        zznN = j;
        zznM = i;
    }

    static int zza(zzfq zzfq1)
    {
        return zzfq1.zznM;
    }

    static int zzb(zzfq zzfq1)
    {
        return zzfq1.zznN;
    }

    static long zzc(zzfq zzfq1)
    {
        long l = zzfq1.zzBh - 1L;
        zzfq1.zzBh = l;
        return l;
    }

    static long zzd(zzfq zzfq1)
    {
        return zzfq1.zzBh;
    }

    static zzie.zza zze(zzfq zzfq1)
    {
        return zzfq1.zzBi;
    }

    static long zzf(zzfq zzfq1)
    {
        return zzfq1.zzBg;
    }

    static Handler zzg(zzfq zzfq1)
    {
        return zzfq1.zzBf;
    }

    public void run()
    {
        if (zzoA == null || zzfl())
        {
            zzBi.zza(zzoA, true);
            return;
        } else
        {
    /* block-local class not found */
    class zza {}

            (new zza(zzoA.getWebView())).execute(new Void[0]);
            return;
        }
    }

    public void zza(AdResponseParcel adresponseparcel)
    {
        zza(adresponseparcel, new zzil(this, zzoA, adresponseparcel.zzCR));
    }

    public void zza(AdResponseParcel adresponseparcel, zzil zzil1)
    {
        zzoA.setWebViewClient(zzil1);
        zzid zzid1 = zzoA;
        if (TextUtils.isEmpty(adresponseparcel.zzzG))
        {
            zzil1 = null;
        } else
        {
            zzil1 = zzo.zzbv().zzat(adresponseparcel.zzzG);
        }
        zzid1.loadDataWithBaseURL(zzil1, adresponseparcel.zzCI, "text/html", "UTF-8", null);
    }

    public void zzfj()
    {
        zzBf.postDelayed(this, zzBg);
    }

    public void zzfk()
    {
        this;
        JVM INSTR monitorenter ;
        zzBj = true;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public boolean zzfl()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = zzBj;
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    public boolean zzfm()
    {
        return zzBk;
    }
}
