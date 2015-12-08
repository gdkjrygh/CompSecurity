// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.framework;

import android.graphics.Bitmap;
import android.os.Message;
import com.jiubang.commerce.ad.a.a;
import com.jiubang.commerce.ad.e.p;

// Referenced classes of package com.gau.go.launcherex.gowidget.framework:
//            GoWidgetActivity, m

class f
    implements p
{

    final a a;
    final GoWidgetActivity b;

    f(GoWidgetActivity gowidgetactivity, a a1)
    {
        b = gowidgetactivity;
        a = a1;
        super();
    }

    public void a(String s)
    {
    }

    public void a(String s, Bitmap bitmap)
    {
        if (com.gau.go.launcherex.gowidget.framework.GoWidgetActivity.a(b) != null && bitmap != null)
        {
            s = new Message();
            s.what = 4;
            s.obj = ((Object) (new Object[] {
                a, bitmap
            }));
            com.gau.go.launcherex.gowidget.framework.GoWidgetActivity.a(b).sendMessage(s);
        }
    }
}
