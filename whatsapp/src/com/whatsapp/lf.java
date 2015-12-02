// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.view.View;
import android.view.ViewTreeObserver;

// Referenced classes of package com.whatsapp:
//            MediaView, App

class lf
    implements android.view.ViewTreeObserver.OnPreDrawListener
{

    final int a;
    final View b;
    final MediaView c;
    final int d;
    final int e;
    final int f;

    lf(MediaView mediaview, View view, int i, int j, int k, int l)
    {
        c = mediaview;
        b = view;
        f = i;
        e = j;
        a = k;
        d = l;
        super();
    }

    public boolean onPreDraw()
    {
label0:
        {
            b.getViewTreeObserver().removeOnPreDrawListener(this);
            int ai[] = new int[2];
            b.getLocationOnScreen(ai);
            MediaView.d(c, f - ai[0]);
            MediaView.g(c, e - ai[1]);
            MediaView.a(c, (float)a / (float)b.getWidth());
            MediaView.b(c, (float)d / (float)b.getHeight());
            if (MediaView.i(c) < MediaView.a(c))
            {
                MediaView.a(c, MediaView.a(c));
                float f1 = b.getWidth();
                float f3 = MediaView.i(c);
                MediaView.d(c, (int)((float)MediaView.k(c) - (f1 * f3 - (float)a) / 2.0F));
                if (App.am == 0)
                {
                    break label0;
                }
            }
            MediaView.b(c, MediaView.i(c));
            float f2 = b.getHeight();
            float f4 = MediaView.a(c);
            MediaView.g(c, (int)((float)MediaView.q(c) - (f2 * f4 - (float)d) / 2.0F));
        }
        MediaView.r(c);
        return true;
    }
}
