// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.g;

import android.app.Activity;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.gau.go.launcherex.gowidget.weather.viewframe.viewholder.b;
import com.go.weatherex.framework.fragment.a;
import com.go.weatherex.framework.fragment.f;

// Referenced classes of package com.go.weatherex.g:
//            l

class q extends b
{

    final l a;
    private TextView b;
    private ProgressBar c;

    public q(l l1)
    {
        a = l1;
        super();
        e = com.go.weatherex.g.l.b(l1).i().a(0x7f0300f5, null);
        b = (TextView)b(0x7f0904e2);
        c = (ProgressBar)b(0x7f090260);
    }

    void a(android.view.View.OnClickListener onclicklistener)
    {
        e.setOnClickListener(onclicklistener);
    }

    void a(boolean flag)
    {
        ProgressBar progressbar = c;
        int i;
        if (flag)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        progressbar.setVisibility(i);
    }

    void c(int i)
    {
        b.setText(l.c(a).getString(i));
    }
}
