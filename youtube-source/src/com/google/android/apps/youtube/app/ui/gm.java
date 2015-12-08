// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;

import android.support.v4.view.bx;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import java.util.ArrayList;

// Referenced classes of package com.google.android.apps.youtube.app.ui:
//            TabbedView, gq

final class gm
    implements bx
{

    final TabbedView a;

    gm(TabbedView tabbedview)
    {
        a = tabbedview;
        super();
    }

    public final void a(int i)
    {
        TabbedView.b(a, i);
    }

    public final void a(int i, float f)
    {
        TabbedView.a(a, i);
        TabbedView.a(a, f);
        if (TabbedView.a(a).size() > 0)
        {
            android.widget.TextView textview = ((gq)TabbedView.a(a).get(i)).a;
            int j = textview.getLeft();
            j = (int)((float)textview.getWidth() * f) + j;
            if (i != 0)
            {
                i = j - TabbedView.b(a);
            } else
            {
                i = (int)((float)j - (float)TabbedView.b(a) * f);
            }
            TabbedView.c(a).scrollTo(i, 0);
            TabbedView.e(a).invalidate(TabbedView.d(a));
        }
    }

    public final void b(int i)
    {
    }
}
