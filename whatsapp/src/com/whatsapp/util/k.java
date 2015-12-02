// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.util;

import android.view.View;
import android.view.ViewTreeObserver;

final class k
    implements android.view.ViewTreeObserver.OnGlobalLayoutListener
{

    final Runnable a;
    final View b;

    k(View view, Runnable runnable)
    {
        b = view;
        a = runnable;
        super();
    }

    public void onGlobalLayout()
    {
        b.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        a.run();
    }
}
