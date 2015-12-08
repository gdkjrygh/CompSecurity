// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.framework;

import com.jiubang.ggheart.analytic.a;

// Referenced classes of package com.gau.go.launcherex.gowidget.framework:
//            d, GoWidgetActivity

class e
    implements Runnable
{

    final d a;

    e(d d1)
    {
        a = d1;
        super();
    }

    public void run()
    {
        try
        {
            if (GoWidgetActivity.b(a.a) != null)
            {
                GoWidgetActivity.b(a.a).c();
            }
            return;
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
        }
    }
}
