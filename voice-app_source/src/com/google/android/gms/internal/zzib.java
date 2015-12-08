// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;

// Referenced classes of package com.google.android.gms.internal:
//            zzic

class zzib extends zzic
    implements android.view.ViewTreeObserver.OnScrollChangedListener
{

    private final WeakReference zzGZ;

    public zzib(View view, android.view.ViewTreeObserver.OnScrollChangedListener onscrollchangedlistener)
    {
        super(view);
        zzGZ = new WeakReference(onscrollchangedlistener);
    }

    public void onScrollChanged()
    {
        android.view.ViewTreeObserver.OnScrollChangedListener onscrollchangedlistener = (android.view.ViewTreeObserver.OnScrollChangedListener)zzGZ.get();
        if (onscrollchangedlistener != null)
        {
            onscrollchangedlistener.onScrollChanged();
            return;
        } else
        {
            detach();
            return;
        }
    }

    protected void zza(ViewTreeObserver viewtreeobserver)
    {
        viewtreeobserver.addOnScrollChangedListener(this);
    }

    protected void zzb(ViewTreeObserver viewtreeobserver)
    {
        viewtreeobserver.removeOnScrollChangedListener(this);
    }
}
