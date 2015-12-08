// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.ui;

import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.youtube.j;

// Referenced classes of package com.google.android.apps.youtube.core.ui:
//            v, w

public abstract class u
    implements android.view.View.OnClickListener
{

    protected View a;
    private final Context b;
    private final v c;
    private TextView d;
    private ProgressBar e;
    private Button f;
    private View g;

    protected u(Context context, v v1)
    {
        c = (v)com.google.android.apps.youtube.common.fromguava.c.a(v1);
        b = (Context)com.google.android.apps.youtube.common.fromguava.c.a(context);
    }

    public static u a(Context context, View view, v v1)
    {
        return new w(context, view, v1, (byte)0);
    }

    public void a()
    {
        d = (TextView)a.findViewById(j.cD);
        d.setMovementMethod(LinkMovementMethod.getInstance());
        e = (ProgressBar)a.findViewById(j.dU);
        f = (Button)a.findViewById(j.ek);
        g = a.findViewById(j.aV);
        f.setOnClickListener(this);
        d();
    }

    public final void a(int i, boolean flag)
    {
        boolean flag1 = false;
        String s = b.getString(i);
        g.setVisibility(8);
        f.setVisibility(8);
        d.setVisibility(0);
        ProgressBar progressbar = e;
        if (flag)
        {
            i = ((flag1) ? 1 : 0);
        } else
        {
            i = 8;
        }
        progressbar.setVisibility(i);
        d.setText(s);
        c();
    }

    public final void a(CharSequence charsequence, boolean flag)
    {
        g.setVisibility(0);
        f.setVisibility(0);
        d.setVisibility(0);
        e.setVisibility(8);
        d.setText(charsequence);
        c();
    }

    public final void b()
    {
        d();
    }

    protected abstract void c();

    protected abstract void d();

    public void onClick(View view)
    {
        c.a();
    }
}
