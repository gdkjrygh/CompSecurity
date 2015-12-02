// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model.surge;


// Referenced classes of package com.ubercab.client.core.model.surge:
//            Shape_DropNotification

abstract class DropNotification
    implements com.ubercab.rider.realtime.model.DropNotification
{

    DropNotification()
    {
    }

    public static DropNotification create()
    {
        return new Shape_DropNotification();
    }

    public abstract long getDefaultExpirationTime();

    public double getDefaultExpirationTimeInMinutes()
    {
        return (double)(getDefaultExpirationTime() / 60L);
    }

    public abstract boolean isEnabled();

    public abstract DropNotification setDefaultExpirationTime(long l);

    public abstract DropNotification setEnabled(boolean flag);
}
