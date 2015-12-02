// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;


// Referenced classes of package com.ubercab.client.core.model:
//            Shape_EatsReminderCreateRequest

public abstract class EatsReminderCreateRequest
{

    public EatsReminderCreateRequest()
    {
    }

    public static EatsReminderCreateRequest create(String s, Long long1)
    {
        return (new Shape_EatsReminderCreateRequest()).setItemId(s).setTimestamp(long1);
    }

    public abstract String getItemId();

    public abstract Long getTimestamp();

    abstract EatsReminderCreateRequest setItemId(String s);

    abstract EatsReminderCreateRequest setTimestamp(Long long1);
}
