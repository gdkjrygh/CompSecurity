// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;


// Referenced classes of package com.ubercab.client.core.model:
//            Shape_EatsReminderUpdateRequest

public abstract class EatsReminderUpdateRequest
{

    public EatsReminderUpdateRequest()
    {
    }

    public static EatsReminderUpdateRequest create(Long long1)
    {
        return (new Shape_EatsReminderUpdateRequest()).setTimestamp(long1);
    }

    public abstract Long getTimestamp();

    abstract EatsReminderUpdateRequest setTimestamp(Long long1);
}
