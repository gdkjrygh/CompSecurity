// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.shoppingcart.model;

import java.util.Date;

// Referenced classes of package com.ubercab.client.feature.shoppingcart.model:
//            Shape_Reminder

public abstract class Reminder
{

    public Reminder()
    {
    }

    public static Reminder create(String s, Long long1)
    {
        return (new Shape_Reminder()).setUuid(s).setTimestamp(long1);
    }

    public Date getReminderTime()
    {
        return new Date(getTimestamp().longValue() * 1000L);
    }

    public abstract Long getTimestamp();

    public abstract String getUuid();

    abstract Reminder setTimestamp(Long long1);

    abstract Reminder setUuid(String s);
}
