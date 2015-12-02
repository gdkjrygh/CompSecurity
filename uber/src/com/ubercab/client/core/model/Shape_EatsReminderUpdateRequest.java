// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;


// Referenced classes of package com.ubercab.client.core.model:
//            EatsReminderUpdateRequest

public final class Shape_EatsReminderUpdateRequest extends EatsReminderUpdateRequest
{

    private Long timestamp;

    Shape_EatsReminderUpdateRequest()
    {
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (EatsReminderUpdateRequest)obj;
            if (((EatsReminderUpdateRequest) (obj)).getTimestamp() == null ? getTimestamp() != null : !((EatsReminderUpdateRequest) (obj)).getTimestamp().equals(getTimestamp()))
            {
                return false;
            }
        }
        return true;
    }

    public final Long getTimestamp()
    {
        return timestamp;
    }

    public final int hashCode()
    {
        int i;
        if (timestamp == null)
        {
            i = 0;
        } else
        {
            i = timestamp.hashCode();
        }
        return i ^ 0xf4243;
    }

    final EatsReminderUpdateRequest setTimestamp(Long long1)
    {
        timestamp = long1;
        return this;
    }

    public final String toString()
    {
        return (new StringBuilder("EatsReminderUpdateRequest{timestamp=")).append(timestamp).append("}").toString();
    }
}
