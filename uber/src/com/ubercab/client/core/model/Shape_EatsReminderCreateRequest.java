// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;


// Referenced classes of package com.ubercab.client.core.model:
//            EatsReminderCreateRequest

public final class Shape_EatsReminderCreateRequest extends EatsReminderCreateRequest
{

    private String itemId;
    private Long timestamp;

    Shape_EatsReminderCreateRequest()
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
            obj = (EatsReminderCreateRequest)obj;
            if (((EatsReminderCreateRequest) (obj)).getItemId() == null ? getItemId() != null : !((EatsReminderCreateRequest) (obj)).getItemId().equals(getItemId()))
            {
                return false;
            }
            if (((EatsReminderCreateRequest) (obj)).getTimestamp() == null ? getTimestamp() != null : !((EatsReminderCreateRequest) (obj)).getTimestamp().equals(getTimestamp()))
            {
                return false;
            }
        }
        return true;
    }

    public final String getItemId()
    {
        return itemId;
    }

    public final Long getTimestamp()
    {
        return timestamp;
    }

    public final int hashCode()
    {
        int j = 0;
        int i;
        if (itemId == null)
        {
            i = 0;
        } else
        {
            i = itemId.hashCode();
        }
        if (timestamp != null)
        {
            j = timestamp.hashCode();
        }
        return (i ^ 0xf4243) * 0xf4243 ^ j;
    }

    final EatsReminderCreateRequest setItemId(String s)
    {
        itemId = s;
        return this;
    }

    final EatsReminderCreateRequest setTimestamp(Long long1)
    {
        timestamp = long1;
        return this;
    }

    public final String toString()
    {
        return (new StringBuilder("EatsReminderCreateRequest{itemId=")).append(itemId).append(", timestamp=").append(timestamp).append("}").toString();
    }
}
