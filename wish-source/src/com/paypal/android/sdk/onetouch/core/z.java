// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk.onetouch.core;

import java.util.TimerTask;

// Referenced classes of package com.paypal.android.sdk.onetouch.core:
//            x, as, ag, aj

final class z extends TimerTask
{

    private x a;

    z(x x1)
    {
        a = x1;
        super();
    }

    public final void run()
    {
        x.g(a);
        as.a(x.g(), (new StringBuilder("****** LoadConfigurationTask #")).append(x.h(a)).toString());
        ag ag1 = new ag(x.i(a), x.j(a), x.k(a));
        aj.a().a(ag1);
    }
}
