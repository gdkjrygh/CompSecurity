// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;


// Referenced classes of package com.ubercab.client.core.model:
//            Shape_EatsReminderResponse

public abstract class EatsReminderResponse
{

    public EatsReminderResponse()
    {
    }

    public static EatsReminderResponse create(String s)
    {
        return (new Shape_EatsReminderResponse()).setUuid(s);
    }

    public abstract String getUuid();

    abstract EatsReminderResponse setUuid(String s);
}
