// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzo;

// Referenced classes of package com.google.android.gms.internal:
//            zzid, zzil, zzhl

public class zzfq
    implements Runnable
{
    protected final class zza extends AsyncTask
    {

        private final WebView zzBl;
        private Bitmap zzBm;
        final zzfq zzBn;

        protected Object doInBackground(Object aobj[])
        {
            return zza((Void[])aobj);
        }

        protected void onPostExecute(Object obj)
        {
            zza((Boolean)obj);
        }

        protected void onPreExecute()
        {
            this;
            JVM INSTR monitorenter ;
            zzBm = Bitmap.createBitmap(zzfq.zza(zzBn), com.google.android.gms.internal.zzfq.zzb(zzBn), android.graphics.Bitmap.Config.ARGB_8888);
            zzBl.setVisibility(0);
            zzBl.measure(android.view.View.MeasureSpec.makeMeasureSpec(zzfq.zza(zzBn), 0), android.view.View.MeasureSpec.makeMeasureSpec(com.google.android.gms.internal.zzfq.zzb(zzBn), 0));
            zzBl.layout(0, 0, zzfq.zza(zzBn), com.google.android.gms.internal.zzfq.zzb(zzBn));
            Canvas canvas = new Canvas(zzBm);
            zzBl.draw(canvas);
            zzBl.invalidate();
            this;
            JVM INSTR monitorexit ;
            return;
            Exception exception;
            exception;
            throw exception;
        }

        protected transient Boolean zza(Void avoid[])
        {
            this;
            JVM INSTR monitorenter ;
            int i1;
            int j1;
            i1 = zzBm.getWidth();
            j1 = zzBm.getHeight();
            if (i1 != 0 && j1 != 0) goto _L2; else goto _L1
_L1:
            avoid = Boolean.valueOf(false);
_L3:
            this;
            JVM INSTR monitorexit ;
            return avoid;
_L2:
            int i;
            int j;
            i = 0;
            j = 0;
_L4:
            int k;
            if (i < i1)
            {
                k = 0;
                break MISSING_BLOCK_LABEL_52;
            }
            boolean flag;
            if ((double)j / ((double)(i1 * j1) / 100D) > 0.10000000000000001D)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            avoid = Boolean.valueOf(flag);
              goto _L3
            avoid;
            throw avoid;
            if (zzBm.getPixel(i, k) != 0)
            {
                l = j + 1;
            }
            k += 10;
            j = l;
            int l;
            if (k < j1)
            {
                l = j;
                break MISSING_BLOCK_LABEL_62;
            }
            i += 10;
              goto _L4
        }

        protected void zza(Boolean boolean1)
        {
            zzfq.zzc(zzBn);
            if (boolean1.booleanValue() || zzBn.zzfl() || zzfq.zzd(zzBn) <= 0L)
            {
                zzBn.zzBk = boolean1.booleanValue();
                zzfq.zze(zzBn).zza(zzBn.zzoA, true);
            } else
            if (zzfq.zzd(zzBn) > 0L)
            {
                if (com.google.android.gms.ads.internal.util.client.zzb.zzL(2))
                {
                    com.google.android.gms.ads.internal.util.client.zzb.zzay("Ad not detected, scheduling another run.");
                }
                zzfq.zzg(zzBn).postDelayed(zzBn, zzfq.zzf(zzBn));
                return;
            }
        }

        public zza(WebView webview)
        {
            zzBn = zzfq.this;
            super();
            zzBl = webview;
        }
    }


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
