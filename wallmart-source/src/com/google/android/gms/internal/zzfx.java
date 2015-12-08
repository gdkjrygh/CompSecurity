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
import com.google.android.gms.ads.internal.zzp;

// Referenced classes of package com.google.android.gms.internal:
//            zzip, zzix, zzhu

public class zzfx
    implements Runnable
{
    protected final class zza extends AsyncTask
    {

        final zzfx zzCA;
        private final WebView zzCy;
        private Bitmap zzCz;

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
            zzCz = Bitmap.createBitmap(zzfx.zza(zzCA), com.google.android.gms.internal.zzfx.zzb(zzCA), android.graphics.Bitmap.Config.ARGB_8888);
            zzCy.setVisibility(0);
            zzCy.measure(android.view.View.MeasureSpec.makeMeasureSpec(zzfx.zza(zzCA), 0), android.view.View.MeasureSpec.makeMeasureSpec(com.google.android.gms.internal.zzfx.zzb(zzCA), 0));
            zzCy.layout(0, 0, zzfx.zza(zzCA), com.google.android.gms.internal.zzfx.zzb(zzCA));
            Canvas canvas = new Canvas(zzCz);
            zzCy.draw(canvas);
            zzCy.invalidate();
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
            i1 = zzCz.getWidth();
            j1 = zzCz.getHeight();
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
            if (zzCz.getPixel(i, k) != 0)
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
            zzfx.zzc(zzCA);
            if (boolean1.booleanValue() || zzCA.zzfn() || zzfx.zzd(zzCA) <= 0L)
            {
                zzCA.zzCx = boolean1.booleanValue();
                zzfx.zze(zzCA).zza(zzCA.zzoL, true);
            } else
            if (zzfx.zzd(zzCA) > 0L)
            {
                if (com.google.android.gms.ads.internal.util.client.zzb.zzM(2))
                {
                    com.google.android.gms.ads.internal.util.client.zzb.zzaC("Ad not detected, scheduling another run.");
                }
                zzfx.zzg(zzCA).postDelayed(zzCA, zzfx.zzf(zzCA));
                return;
            }
        }

        public zza(WebView webview)
        {
            zzCA = zzfx.this;
            super();
            zzCy = webview;
        }
    }


    private final Handler zzCs;
    private final long zzCt;
    private long zzCu;
    private zziq.zza zzCv;
    protected boolean zzCw;
    protected boolean zzCx;
    private final int zznP;
    private final int zznQ;
    protected final zzip zzoL;

    public zzfx(zziq.zza zza1, zzip zzip1, int i, int j)
    {
        this(zza1, zzip1, i, j, 200L, 50L);
    }

    public zzfx(zziq.zza zza1, zzip zzip1, int i, int j, long l, long l1)
    {
        zzCt = l;
        zzCu = l1;
        zzCs = new Handler(Looper.getMainLooper());
        zzoL = zzip1;
        zzCv = zza1;
        zzCw = false;
        zzCx = false;
        zznQ = j;
        zznP = i;
    }

    static int zza(zzfx zzfx1)
    {
        return zzfx1.zznP;
    }

    static int zzb(zzfx zzfx1)
    {
        return zzfx1.zznQ;
    }

    static long zzc(zzfx zzfx1)
    {
        long l = zzfx1.zzCu - 1L;
        zzfx1.zzCu = l;
        return l;
    }

    static long zzd(zzfx zzfx1)
    {
        return zzfx1.zzCu;
    }

    static zziq.zza zze(zzfx zzfx1)
    {
        return zzfx1.zzCv;
    }

    static long zzf(zzfx zzfx1)
    {
        return zzfx1.zzCt;
    }

    static Handler zzg(zzfx zzfx1)
    {
        return zzfx1.zzCs;
    }

    public void run()
    {
        if (zzoL == null || zzfn())
        {
            zzCv.zza(zzoL, true);
            return;
        } else
        {
            (new zza(zzoL.getWebView())).execute(new Void[0]);
            return;
        }
    }

    public void zza(AdResponseParcel adresponseparcel)
    {
        zza(adresponseparcel, new zzix(this, zzoL, adresponseparcel.zzEe));
    }

    public void zza(AdResponseParcel adresponseparcel, zzix zzix1)
    {
        zzoL.setWebViewClient(zzix1);
        zzip zzip1 = zzoL;
        if (TextUtils.isEmpty(adresponseparcel.zzAT))
        {
            zzix1 = null;
        } else
        {
            zzix1 = zzp.zzbx().zzaw(adresponseparcel.zzAT);
        }
        zzip1.loadDataWithBaseURL(zzix1, adresponseparcel.body, "text/html", "UTF-8", null);
    }

    public void zzfl()
    {
        zzCs.postDelayed(this, zzCt);
    }

    public void zzfm()
    {
        this;
        JVM INSTR monitorenter ;
        zzCw = true;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public boolean zzfn()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = zzCw;
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    public boolean zzfo()
    {
        return zzCx;
    }
}
