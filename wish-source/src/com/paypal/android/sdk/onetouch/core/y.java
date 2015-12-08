// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk.onetouch.core;

import java.util.Timer;
import java.util.TimerTask;

// Referenced classes of package com.paypal.android.sdk.onetouch.core:
//            x, as

final class y extends TimerTask
{

    private x a;

    y(x x1)
    {
        a = x1;
        super();
    }

    public final void run()
    {
        x.a(a);
        as.a(x.g(), (new StringBuilder("****** LogRiskMetadataTask #")).append(x.b(a)).toString());
        if (x.c(a))
        {
            as.a(x.g(), (new StringBuilder("No host activity in the last ")).append(x.d(a) / 1000L).append(" seconds. Stopping update interval.").toString());
            x.e(a).cancel();
            return;
        }
        try
        {
            x.f(a);
            return;
        }
        catch (Exception exception)
        {
            as.a(x.g(), "Error in logRiskMetadataTask: ", exception);
        }
    }
}
