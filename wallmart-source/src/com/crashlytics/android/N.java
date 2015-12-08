// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android;

import java.util.Date;
import java.util.concurrent.Callable;

// Referenced classes of package com.crashlytics.android:
//            v

final class N
    implements Callable
{

    private Date a;
    private Thread b;
    private Throwable c;
    private v d;

    N(v v1, Date date, Thread thread, Throwable throwable)
    {
        d = v1;
        a = date;
        b = thread;
        c = throwable;
        super();
    }

    public final Object call()
        throws Exception
    {
        v.a(d, a, b, c);
        return null;
    }
}
