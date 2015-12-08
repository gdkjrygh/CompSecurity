// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.view;

import android.view.View;
import com.gau.go.launcherex.gowidget.c.g;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.view:
//            x, LanguageSetting, w

class y
    implements android.view.View.OnClickListener
{

    final int a;
    final x b;

    y(x x1, int i)
    {
        b = x1;
        a = i;
        super();
    }

    public void onClick(View view)
    {
        if (g.a(b.a))
        {
            LanguageSetting.a(b.a, 0x7f0803fa);
            (new w(b.a, a)).execute(new Void[0]);
            return;
        } else
        {
            LanguageSetting.a(b.a, 0x7f080458);
            return;
        }
    }
}
