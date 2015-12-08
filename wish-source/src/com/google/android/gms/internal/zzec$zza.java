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
//            zzec

protected final class zzya extends AsyncTask
{

    private final WebView zzya;
    private Bitmap zzyb;
    final zzec zzyc;

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
        zzyb = Bitmap.createBitmap(zzec.zza(zzyc), com.google.android.gms.internal.zzec.zzb(zzyc), android.graphics.nfig.ARGB_8888);
        zzya.setVisibility(0);
        zzya.measure(android.view.ureSpec.makeMeasureSpec(zzec.zza(zzyc), 0), android.view.ureSpec.makeMeasureSpec(com.google.android.gms.internal.zzec.zzb(zzyc), 0));
        zzya.layout(0, 0, zzec.zza(zzyc), com.google.android.gms.internal.zzec.zzb(zzyc));
        Canvas canvas = new Canvas(zzyb);
        zzya.draw(canvas);
        zzya.invalidate();
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
        i1 = zzyb.getWidth();
        j1 = zzyb.getHeight();
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
        if (zzyb.getPixel(i, k) != 0)
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
        zzec.zzc(zzyc);
        if (boolean1.booleanValue() || zzyc.zzee() || zzec.zzd(zzyc) <= 0L)
        {
            zzyc.zzxZ = boolean1.booleanValue();
            zzec.zze(zzyc).zza(zzyc.zznp, true);
        } else
        if (zzec.zzd(zzyc) > 0L)
        {
            if (zzb.zzC(2))
            {
                zzb.zzaj("Ad not detected, scheduling another run.");
            }
            zzec.zzg(zzyc).postDelayed(zzyc, zzec.zzf(zzyc));
            return;
        }
    }

    public client.zzb(zzec zzec1, WebView webview)
    {
        zzyc = zzec1;
        super();
        zzya = webview;
    }
}
