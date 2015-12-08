// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.impl.conn;

import java.util.concurrent.TimeUnit;

// Referenced classes of package ch.boye.httpclientandroidlib.impl.conn:
//            IdleConnectionHandler

private static class timeExpires
{

    private final long timeAdded;
    private final long timeExpires;



    (long l, long l1, TimeUnit timeunit)
    {
        timeAdded = l;
        if (l1 > 0L)
        {
            timeExpires = timeunit.toMillis(l1) + l;
            return;
        } else
        {
            timeExpires = 0x7fffffffffffffffL;
            return;
        }
    }
}
