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
//            zzfx

protected final class zzCy extends AsyncTask
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
        zzCz = Bitmap.createBitmap(zzfx.zza(zzCA), com.google.android.gms.internal.zzfx.zzb(zzCA), android.graphics.nfig.ARGB_8888);
        zzCy.setVisibility(0);
        zzCy.measure(android.view.ureSpec.makeMeasureSpec(zzfx.zza(zzCA), 0), android.view.ureSpec.makeMeasureSpec(com.google.android.gms.internal.zzfx.zzb(zzCA), 0));
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
            if (zzb.zzM(2))
            {
                zzb.zzaC("Ad not detected, scheduling another run.");
            }
            zzfx.zzg(zzCA).postDelayed(zzCA, zzfx.zzf(zzCA));
            return;
        }
    }

    public client.zzb(zzfx zzfx1, WebView webview)
    {
        zzCA = zzfx1;
        super();
        zzCy = webview;
    }
}
