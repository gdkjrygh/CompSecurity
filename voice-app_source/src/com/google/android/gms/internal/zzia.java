// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.gms.ads.internal.zzo;
import java.lang.ref.WeakReference;

// Referenced classes of package com.google.android.gms.internal:
//            zzic, zzhm

class zzia extends zzic
    implements android.view.ViewTreeObserver.OnGlobalLayoutListener
{

    private final WeakReference zzGZ;

    public zzia(View view, android.view.ViewTreeObserver.OnGlobalLayoutListener ongloballayoutlistener)
    {
        super(view);
        zzGZ = new WeakReference(ongloballayoutlistener);
    }

    public void onGlobalLayout()
    {
        android.view.ViewTreeObserver.OnGlobalLayoutListener ongloballayoutlistener = (android.view.ViewTreeObserver.OnGlobalLayoutListener)zzGZ.get();
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
        zzo.zzbx().zza(viewtreeobserver, this);
    }
}
