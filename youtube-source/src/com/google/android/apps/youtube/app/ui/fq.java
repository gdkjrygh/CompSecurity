// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.youtube.app.adapter.ai;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.youtube.j;

// Referenced classes of package com.google.android.apps.youtube.app.ui:
//            fm, fr

public final class fq
{

    protected final ViewGroup a;
    protected final TextView b;
    final fm c;
    private final int d;
    private final View e[] = new View[3];
    private final View f[] = new View[3];
    private final ai g;
    private Object h;
    private final int i;

    public fq(fm fm1, View view, ai ai, int k)
    {
        int i1 = 0;
        c = fm1;
        super();
        a = (ViewGroup)com.google.android.apps.youtube.common.fromguava.c.a((ViewGroup)view);
        int l = 0;
        do
        {
            if (l >= 3)
            {
                break;
            }
            view = a.findViewById(fm.a()[l]);
            if (view == null)
            {
                break;
            }
            e[l] = view;
            f[l] = a.findViewById(fm.b()[l]);
            i1++;
            l++;
        } while (true);
        d = i1;
        b = (TextView)com.google.android.apps.youtube.common.fromguava.c.a((TextView)a.findViewById(j.cH));
        b.setOnClickListener(new fr(this, fm1));
        g = ai;
        i = k;
    }

    static Object a(fq fq1)
    {
        return fq1.h;
    }

    static Object a(fq fq1, Object obj)
    {
        fq1.h = obj;
        return obj;
    }

    static int b(fq fq1)
    {
        return fq1.d;
    }

    static int c(fq fq1)
    {
        return fq1.i;
    }

    static View[] d(fq fq1)
    {
        return fq1.e;
    }

    static View[] e(fq fq1)
    {
        return fq1.f;
    }

    static ai f(fq fq1)
    {
        return fq1.g;
    }
}
