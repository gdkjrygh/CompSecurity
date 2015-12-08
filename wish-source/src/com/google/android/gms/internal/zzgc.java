// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;

abstract class zzgc
{

    private final WeakReference zzDc;

    public zzgc(View view)
    {
        zzDc = new WeakReference(view);
    }

    public final void detach()
    {
        ViewTreeObserver viewtreeobserver = getViewTreeObserver();
        if (viewtreeobserver != null)
        {
            zzb(viewtreeobserver);
        }
    }

    protected ViewTreeObserver getViewTreeObserver()
    {
        Object obj = (View)zzDc.get();
        if (obj != null) goto _L2; else goto _L1
_L1:
        obj = null;
_L4:
        return ((ViewTreeObserver) (obj));
_L2:
        ViewTreeObserver viewtreeobserver;
        viewtreeobserver = ((View) (obj)).getViewTreeObserver();
        if (viewtreeobserver == null)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = viewtreeobserver;
        if (viewtreeobserver.isAlive()) goto _L4; else goto _L3
_L3:
        return null;
    }

    protected abstract void zza(ViewTreeObserver viewtreeobserver);

    protected abstract void zzb(ViewTreeObserver viewtreeobserver);

    public final void zzfn()
    {
        ViewTreeObserver viewtreeobserver = getViewTreeObserver();
        if (viewtreeobserver != null)
        {
            zza(viewtreeobserver);
        }
    }
}
