// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.messagecenter.view;

import android.widget.TextView;

// Referenced classes of package com.gau.go.launcherex.gowidget.messagecenter.view:
//            e, MessageCenterWebView

class f
    implements Runnable
{

    final int a;
    final e b;

    f(e e1, int i)
    {
        b = e1;
        a = i;
        super();
    }

    public void run()
    {
        MessageCenterWebView.e(b.a).setText((new StringBuilder()).append(a).append("%").toString());
    }
}
