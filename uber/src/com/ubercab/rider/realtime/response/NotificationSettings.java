// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rider.realtime.response;


// Referenced classes of package com.ubercab.rider.realtime.response:
//            Surge

public abstract class NotificationSettings
{

    public NotificationSettings()
    {
    }

    public abstract Surge getSurge();

    public abstract NotificationSettings setSurge(Surge surge);
}
