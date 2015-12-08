// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.Activity;
import com.google.android.gms.ads.internal.zzp;

// Referenced classes of package com.google.android.gms.internal:
//            zzhu, zzhv

public final class zzid
{

    private Activity zzIs;
    private boolean zzIt;
    private boolean zzIu;
    private boolean zzIv;
    private android.view.ViewTreeObserver.OnGlobalLayoutListener zzIw;
    private android.view.ViewTreeObserver.OnScrollChangedListener zzIx;

    public zzid(Activity activity, android.view.ViewTreeObserver.OnGlobalLayoutListener ongloballayoutlistener, android.view.ViewTreeObserver.OnScrollChangedListener onscrollchangedlistener)
    {
        zzIs = activity;
        zzIw = ongloballayoutlistener;
        zzIx = onscrollchangedlistener;
    }

    private void zzgF()
    {
        while (zzIs == null || zzIt) 
        {
            return;
        }
        if (zzIw != null)
        {
            zzp.zzbx().zza(zzIs, zzIw);
        }
        if (zzIx != null)
        {
            zzp.zzbx().zza(zzIs, zzIx);
        }
        zzIt = true;
    }

    private void zzgG()
    {
        while (zzIs == null || !zzIt) 
        {
            return;
        }
        if (zzIw != null)
        {
            zzp.zzbz().zzb(zzIs, zzIw);
        }
        if (zzIx != null)
        {
            zzp.zzbx().zzb(zzIs, zzIx);
        }
        zzIt = false;
    }

    public void onAttachedToWindow()
    {
        zzIu = true;
        if (zzIv)
        {
            zzgF();
        }
    }

    public void onDetachedFromWindow()
    {
        zzIu = false;
        zzgG();
    }

    public void zzgD()
    {
        zzIv = true;
        if (zzIu)
        {
            zzgF();
        }
    }

    public void zzgE()
    {
        zzIv = false;
        zzgG();
    }

    public void zzl(Activity activity)
    {
        zzIs = activity;
    }
}
