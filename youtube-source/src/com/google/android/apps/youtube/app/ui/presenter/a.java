// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui.presenter;

import android.content.res.Resources;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.apps.youtube.app.ui.OfflineArrowView;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.uilib.a.g;
import com.google.android.youtube.j;
import com.google.android.youtube.p;

public abstract class a
    implements g
{

    protected final Resources a;
    private final TextView b;
    private final View c;
    private final OfflineArrowView d;
    private final ProgressBar e;

    protected a(View view, android.view.View.OnClickListener onclicklistener)
    {
        a = view.getResources();
        b = (TextView)view.findViewById(j.cS);
        c = (View)com.google.android.apps.youtube.common.fromguava.c.a(view.findViewById(j.cR));
        d = (OfflineArrowView)com.google.android.apps.youtube.common.fromguava.c.a((OfflineArrowView)c.findViewById(j.cQ));
        e = (ProgressBar)com.google.android.apps.youtube.common.fromguava.c.a((ProgressBar)c.findViewById(j.cU));
        if (b != null)
        {
            b.setVisibility(8);
        }
        c.setOnClickListener(onclicklistener);
    }

    private void a(int i)
    {
label0:
        {
            if (b != null)
            {
                if (i == 0)
                {
                    break label0;
                }
                b.setText(i);
                b.setVisibility(0);
            }
            return;
        }
        b.setVisibility(8);
    }

    private void e()
    {
        c.setVisibility(0);
        c.setEnabled(true);
        e.setVisibility(4);
        d.setVisibility(0);
    }

    public final void a()
    {
        if (b != null)
        {
            b.setVisibility(8);
        }
        c.setVisibility(8);
    }

    protected final void a(int i, int k, int l, int i1)
    {
        e();
        a(0);
        d.setIcon(i);
        d.setProgress(l, 100);
    }

    protected final void a(boolean flag, int i, int k)
    {
        if (b != null)
        {
            if (flag)
            {
                b.setVisibility(0);
                b.setText(a.getString(p.dq, new Object[] {
                    Integer.valueOf(i), Integer.valueOf(k)
                }));
            } else
            {
                b.setVisibility(8);
            }
        }
        e();
        d.a();
        d.setProgress(i, k);
    }

    protected final void b()
    {
        e();
        if (b != null)
        {
            b.setVisibility(8);
        }
        d.c();
        d.setProgress(0, 1);
    }

    protected final void c()
    {
        e();
        a(p.ch);
        d.d();
        d.setProgress(1, 1);
    }

    public final void d()
    {
        if (b != null)
        {
            b.setVisibility(8);
        }
        c.setVisibility(0);
        c.setEnabled(false);
        e.setVisibility(0);
        d.setVisibility(4);
    }
}
