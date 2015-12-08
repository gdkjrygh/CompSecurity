// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.ggheart.analytic;

import android.content.Context;
import com.gau.go.a.e;

// Referenced classes of package com.jiubang.ggheart.analytic:
//            ReferrerInfoReceiver

class c extends Thread
{

    final Context a;
    final String b;
    final ReferrerInfoReceiver c;

    c(ReferrerInfoReceiver referrerinforeceiver, String s, Context context, String s1)
    {
        c = referrerinforeceiver;
        a = context;
        b = s1;
        super(s);
    }

    public void run()
    {
        super.run();
        String s = ReferrerInfoReceiver.a(c, a, b);
        e.a(a).a(s);
    }
}
