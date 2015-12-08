// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.http;

import android.net.TrafficStats;
import android.os.SystemClock;
import android.util.EventLog;
import java.io.FilterInputStream;
import java.io.InputStream;

// Referenced classes of package com.google.android.gms.http:
//            f

final class g extends FilterInputStream
{

    final f a;

    public g(f f1, InputStream inputstream)
    {
        a = f1;
        super(inputstream);
    }

    public final void close()
    {
        super.close();
        long l = SystemClock.elapsedRealtime();
        long l2 = f.a(a);
        long l4 = TrafficStats.getUidTxBytes(f.b(a));
        long l6 = TrafficStats.getUidRxBytes(f.b(a));
        EventLog.writeEvent(52001, new Object[] {
            f.c(a), Long.valueOf(f.d(a)), Long.valueOf(l - l2), Long.valueOf(l4 - f.e(a)), Long.valueOf(l6 - f.f(a))
        });
        return;
        Exception exception;
        exception;
        long l1 = SystemClock.elapsedRealtime();
        long l3 = f.a(a);
        long l5 = TrafficStats.getUidTxBytes(f.b(a));
        long l7 = TrafficStats.getUidRxBytes(f.b(a));
        EventLog.writeEvent(52001, new Object[] {
            f.c(a), Long.valueOf(f.d(a)), Long.valueOf(l1 - l3), Long.valueOf(l5 - f.e(a)), Long.valueOf(l7 - f.f(a))
        });
        throw exception;
    }
}
