// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.AsyncTask;
import android.os.Handler;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.util.client.zzb;

// Referenced classes of package com.google.android.gms.internal:
//            zzfq

protected final class zzBl extends AsyncTask
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
        zzBm = Bitmap.createBitmap(zzfq.zza(zzBn), com.google.android.gms.internal.zzfq.zzb(zzBn), android.graphics.nfig.ARGB_8888);
        zzBl.setVisibility(0);
        zzBl.measure(android.view.ureSpec.makeMeasureSpec(zzfq.zza(zzBn), 0), android.view.ureSpec.makeMeasureSpec(com.google.android.gms.internal.zzfq.zzb(zzBn), 0));
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
            if (zzb.zzL(2))
            {
                zzb.zzay("Ad not detected, scheduling another run.");
            }
            zzfq.zzg(zzBn).postDelayed(zzBn, zzfq.zzf(zzBn));
            return;
        }
    }

    public client.zzb(zzfq zzfq1, WebView webview)
    {
        zzBn = zzfq1;
        super();
        zzBl = webview;
    }
}
