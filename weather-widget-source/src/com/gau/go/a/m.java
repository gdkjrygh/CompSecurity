// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.a;

import android.content.Context;
import android.content.IntentFilter;

// Referenced classes of package com.gau.go.a:
//            e

class m
    implements Runnable
{

    final e a;

    m(e e1)
    {
        a = e1;
        super();
    }

    public void run()
    {
        IntentFilter intentfilter = new IntentFilter();
        intentfilter.addAction("com.android.broadcast.ctrlinfo");
        e.b(a).registerReceiver(e.c(a), intentfilter);
        e.b(a, false);
    }
}
