// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.view.ViewTreeObserver;

// Referenced classes of package android.support.v7.internal.widget:
//            SpinnerCompat, az

class at
    implements android.view.ViewTreeObserver.OnGlobalLayoutListener
{

    final SpinnerCompat a;

    at(SpinnerCompat spinnercompat)
    {
        a = spinnercompat;
        super();
    }

    public void onGlobalLayout()
    {
        if (!SpinnerCompat.a(a).b())
        {
            SpinnerCompat.a(a).c();
        }
        ViewTreeObserver viewtreeobserver = a.getViewTreeObserver();
        if (viewtreeobserver != null)
        {
            viewtreeobserver.removeGlobalOnLayoutListener(this);
        }
    }
}
