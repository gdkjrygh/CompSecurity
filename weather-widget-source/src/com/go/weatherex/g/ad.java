// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.g;

import android.view.View;
import android.widget.TextView;
import com.gau.go.launcherex.gowidget.c.g;
import com.go.weatherex.framework.fragment.a;
import com.jiubang.goweather.c.e;
import com.jiubang.goweather.c.h;

// Referenced classes of package com.go.weatherex.g:
//            y

class ad
    implements android.view.View.OnClickListener
{

    final y a;

    ad(y y1)
    {
        a = y1;
        super();
    }

    public void onClick(View view)
    {
        y.b(a, true);
        if (!g.a(y.f(a).getActivity()))
        {
            a.a.a(6);
            return;
        } else
        {
            y.d(a).setOnClickListener(null);
            y.b(a).setVisibility(0);
            com.go.weatherex.g.y.a(a).setText(0x7f0801b3);
            e.a(y.m(a)).b();
            return;
        }
    }
}
