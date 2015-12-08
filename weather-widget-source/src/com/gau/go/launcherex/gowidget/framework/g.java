// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.framework;

import android.view.View;
import com.jiubang.commerce.ad.a;

// Referenced classes of package com.gau.go.launcherex.gowidget.framework:
//            GoWidgetActivity, h

class g
    implements android.view.View.OnClickListener
{

    final com.jiubang.commerce.ad.a.a a;
    final GoWidgetActivity b;

    g(GoWidgetActivity gowidgetactivity, com.jiubang.commerce.ad.a.a a1)
    {
        b = gowidgetactivity;
        a = a1;
        super();
    }

    public void onClick(View view)
    {
        if (a != null)
        {
            com.jiubang.commerce.ad.a.a(b.getApplicationContext(), a, "", "", false);
            (new h(this)).start();
        }
    }
}
