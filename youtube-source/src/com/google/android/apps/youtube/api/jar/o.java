// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api.jar;

import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.apps.youtube.common.e.m;
import com.google.android.youtube.api.c;

// Referenced classes of package com.google.android.apps.youtube.api.jar:
//            p, q

public final class o
{

    private int a;
    private int b;
    private int c;
    private final TextView d;
    private final TextView e;
    private final ProgressBar f;
    private q g;

    public o(View view)
    {
        d = (TextView)view.findViewById(c.r);
        e = (TextView)view.findViewById(c.d);
        f = (ProgressBar)view.findViewById(c.p);
        f.setOnTouchListener(new p(this));
    }

    static q a(o o1)
    {
        return o1.g;
    }

    private static void a(TextView textview, CharSequence charsequence)
    {
        if (textview != null && charsequence != null)
        {
            textview.setText(charsequence);
        }
    }

    static int b(o o1)
    {
        return o1.a;
    }

    public final void a(int i, int j, int k)
    {
        if (b != i)
        {
            b = i;
            a(e, ((CharSequence) (m.a(i, 3))));
        }
        if (a != j)
        {
            a = j;
            a(d, ((CharSequence) (m.a(j, 3))));
        }
        c = (k * j) / 100;
        f.setMax(a);
        f.setProgress(b);
        f.setSecondaryProgress(c);
    }

    public final void a(q q1)
    {
        g = (q)com.google.android.apps.youtube.common.fromguava.c.a(q1);
    }

    public final void a(boolean flag)
    {
        int i;
        if (flag)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        d.setVisibility(i);
        e.setVisibility(i);
        f.setVisibility(i);
    }
}
