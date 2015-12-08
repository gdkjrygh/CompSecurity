// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.setting;

import android.view.View;
import com.gau.go.launcherex.gowidget.c.g;

// Referenced classes of package com.go.weatherex.setting:
//            ax, at, aw

class ay
    implements android.view.View.OnClickListener
{

    final int a;
    final ax b;

    ay(ax ax1, int i)
    {
        b = ax1;
        a = i;
        super();
    }

    public void onClick(View view)
    {
        if (g.a(b.a.getActivity()))
        {
            at.a(b.a, 0x7f0803fa);
            (new aw(b.a, a)).execute(new Void[0]);
            return;
        } else
        {
            at.a(b.a, 0x7f080458);
            return;
        }
    }
}
