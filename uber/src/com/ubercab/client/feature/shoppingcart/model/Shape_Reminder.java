// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.shoppingcart.model;


// Referenced classes of package com.ubercab.client.feature.shoppingcart.model:
//            Reminder

public final class Shape_Reminder extends Reminder
{

    private Long timestamp;
    private String uuid;

    Shape_Reminder()
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
            obj = (Reminder)obj;
            if (((Reminder) (obj)).getTimestamp() == null ? getTimestamp() != null : !((Reminder) (obj)).getTimestamp().equals(getTimestamp()))
            {
                return false;
            }
            if (((Reminder) (obj)).getUuid() == null ? getUuid() != null : !((Reminder) (obj)).getUuid().equals(getUuid()))
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

    public final String getUuid()
    {
        return uuid;
    }

    public final int hashCode()
    {
        int j = 0;
        int i;
        if (timestamp == null)
        {
            i = 0;
        } else
        {
            i = timestamp.hashCode();
        }
        if (uuid != null)
        {
            j = uuid.hashCode();
        }
        return (i ^ 0xf4243) * 0xf4243 ^ j;
    }

    final Reminder setTimestamp(Long long1)
    {
        timestamp = long1;
        return this;
    }

    final Reminder setUuid(String s)
    {
        uuid = s;
        return this;
    }

    public final String toString()
    {
        return (new StringBuilder("Reminder{timestamp=")).append(timestamp).append(", uuid=").append(uuid).append("}").toString();
    }
}
