// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.util;

import android.view.View;
import android.view.ViewTreeObserver;

final class b1
    implements android.view.ViewTreeObserver.OnDrawListener
{

    final Runnable a;
    final View b;

    b1(View view, Runnable runnable)
    {
        b = view;
        a = runnable;
        super();
    }

    public void onDraw()
    {
        b.getViewTreeObserver().removeOnDrawListener(this);
        a.run();
    }
}
