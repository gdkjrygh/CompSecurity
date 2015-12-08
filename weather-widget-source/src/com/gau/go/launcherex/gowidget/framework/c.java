// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.framework;

import android.graphics.Bitmap;
import android.os.Message;
import android.util.Log;
import com.jiubang.commerce.ad.a.a;
import com.jiubang.commerce.ad.e.p;

// Referenced classes of package com.gau.go.launcherex.gowidget.framework:
//            b, GoWidgetActivity, m

class c
    implements p
{

    final a a;
    final b b;

    c(b b1, a a1)
    {
        b = b1;
        a = a1;
        super();
    }

    public void a(String s)
    {
    }

    public void a(String s, Bitmap bitmap)
    {
        long l = System.currentTimeMillis();
        long l1 = b.a;
        Log.d("zyz", (new StringBuilder()).append("spend:").append(l - l1).toString());
        s = new Message();
        s.what = 3;
        s.obj = a;
        com.gau.go.launcherex.gowidget.framework.GoWidgetActivity.a(b.b).sendMessage(s);
    }
}
