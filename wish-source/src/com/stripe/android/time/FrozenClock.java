// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.stripe.android.time;

import java.util.Calendar;

// Referenced classes of package com.stripe.android.time:
//            Clock

public class FrozenClock extends Clock
{

    public FrozenClock()
    {
    }

    public static void freeze(Calendar calendar)
    {
        getInstance().calendarInstance = calendar;
    }

    public static void unfreeze()
    {
        getInstance().calendarInstance = null;
    }
}
