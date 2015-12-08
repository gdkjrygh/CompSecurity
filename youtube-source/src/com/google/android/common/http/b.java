// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.common.http;

import android.net.TrafficStats;
import android.os.SystemClock;
import android.util.EventLog;
import java.io.FilterInputStream;
import java.io.InputStream;

// Referenced classes of package com.google.android.common.http:
//            a

final class b extends FilterInputStream
{

    final a a;

    public b(a a1, InputStream inputstream)
    {
        a = a1;
        super(inputstream);
    }

    public final void close()
    {
        super.close();
        long l = SystemClock.elapsedRealtime();
        long l2 = com.google.android.common.http.a.a(a);
        long l4 = TrafficStats.getUidTxBytes(com.google.android.common.http.a.b(a));
        long l6 = TrafficStats.getUidRxBytes(com.google.android.common.http.a.b(a));
        EventLog.writeEvent(52001, new Object[] {
            com.google.android.common.http.a.c(a), Long.valueOf(com.google.android.common.http.a.d(a)), Long.valueOf(l - l2), Long.valueOf(l4 - com.google.android.common.http.a.e(a)), Long.valueOf(l6 - com.google.android.common.http.a.f(a))
        });
        return;
        Exception exception;
        exception;
        long l1 = SystemClock.elapsedRealtime();
        long l3 = com.google.android.common.http.a.a(a);
        long l5 = TrafficStats.getUidTxBytes(com.google.android.common.http.a.b(a));
        long l7 = TrafficStats.getUidRxBytes(com.google.android.common.http.a.b(a));
        EventLog.writeEvent(52001, new Object[] {
            com.google.android.common.http.a.c(a), Long.valueOf(com.google.android.common.http.a.d(a)), Long.valueOf(l1 - l3), Long.valueOf(l5 - com.google.android.common.http.a.e(a)), Long.valueOf(l7 - com.google.android.common.http.a.f(a))
        });
        throw exception;
    }
}
