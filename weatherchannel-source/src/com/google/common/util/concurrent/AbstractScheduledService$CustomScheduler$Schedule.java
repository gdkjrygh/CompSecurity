// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.util.concurrent;

import com.google.common.base.Preconditions;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.common.util.concurrent:
//            AbstractScheduledService

protected static final class unit
{

    private final long delay;
    private final TimeUnit unit;



    public Y(long l, TimeUnit timeunit)
    {
        delay = l;
        unit = (TimeUnit)Preconditions.checkNotNull(timeunit);
    }
}
