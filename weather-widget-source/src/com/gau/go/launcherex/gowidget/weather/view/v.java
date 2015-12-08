// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.view;

import com.gau.go.launcherex.gowidget.weather.globalview.c;
import com.gau.go.launcherex.gowidget.weather.model.l;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.view:
//            LanguageSetting

class v
    implements c
{

    final l a;
    final LanguageSetting b;

    v(LanguageSetting languagesetting, l l1)
    {
        b = languagesetting;
        a = l1;
        super();
    }

    public void a(boolean flag)
    {
        if (flag)
        {
            LanguageSetting.a(b, a.b(), a.d());
            com.gau.go.launcherex.gowidget.weather.b.c.b(b.getApplicationContext());
            b.finish();
        }
    }
}
