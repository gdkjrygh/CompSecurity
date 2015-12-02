// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.util;

import android.view.View;
import android.view.ViewTreeObserver;

final class b4
    implements android.view.ViewTreeObserver.OnPreDrawListener
{

    final Runnable a;
    final View b;

    b4(View view, Runnable runnable)
    {
        b = view;
        a = runnable;
        super();
    }

    public boolean onPreDraw()
    {
        b.getViewTreeObserver().removeOnPreDrawListener(this);
        a.run();
        return true;
    }
}
