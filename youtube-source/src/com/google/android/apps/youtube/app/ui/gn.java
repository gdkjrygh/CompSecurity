// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;

import android.support.v4.view.ViewPager;
import android.support.v4.view.aj;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

// Referenced classes of package com.google.android.apps.youtube.app.ui:
//            TabbedView, gq

final class gn extends aj
{

    final TabbedView a;

    private gn(TabbedView tabbedview)
    {
        a = tabbedview;
        super();
    }

    gn(TabbedView tabbedview, byte byte0)
    {
        this(tabbedview);
    }

    public final int a()
    {
        return TabbedView.a(a).size();
    }

    public final int a(Object obj)
    {
        for (int i = 0; i < TabbedView.a(a).size(); i++)
        {
            if (((gq)TabbedView.a(a).get(i)).b == (View)obj)
            {
                return i;
            }
        }

        return -2;
    }

    public final Object a(ViewGroup viewgroup, int i)
    {
        viewgroup = ((gq)TabbedView.a(a).get(i)).b;
        TabbedView.f(a).addView(viewgroup, 0);
        return viewgroup;
    }

    public final void a(ViewGroup viewgroup, int i, Object obj)
    {
        TabbedView.f(a).removeView((View)obj);
    }

    public final boolean a(View view, Object obj)
    {
        return view == obj;
    }
}
