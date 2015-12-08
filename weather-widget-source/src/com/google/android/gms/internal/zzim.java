// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.gms.ads.internal.zzp;
import java.lang.ref.WeakReference;

// Referenced classes of package com.google.android.gms.internal:
//            zzio, zzhv

class zzim extends zzio
    implements android.view.ViewTreeObserver.OnGlobalLayoutListener
{

    private final WeakReference zzIS;

    public zzim(View view, android.view.ViewTreeObserver.OnGlobalLayoutListener ongloballayoutlistener)
    {
        super(view);
        zzIS = new WeakReference(ongloballayoutlistener);
    }

    public void onGlobalLayout()
    {
        android.view.ViewTreeObserver.OnGlobalLayoutListener ongloballayoutlistener = (android.view.ViewTreeObserver.OnGlobalLayoutListener)zzIS.get();
        if (ongloballayoutlistener != null)
        {
            ongloballayoutlistener.onGlobalLayout();
            return;
        } else
        {
            detach();
            return;
        }
    }

    protected void zza(ViewTreeObserver viewtreeobserver)
    {
        viewtreeobserver.addOnGlobalLayoutListener(this);
    }

    protected void zzb(ViewTreeObserver viewtreeobserver)
    {
        zzp.zzbz().zza(viewtreeobserver, this);
    }
}
