// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;


// Referenced classes of package com.ubercab.client.core.model:
//            EatsReminderResponse

public final class Shape_EatsReminderResponse extends EatsReminderResponse
{

    private String uuid;

    Shape_EatsReminderResponse()
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
            obj = (EatsReminderResponse)obj;
            if (((EatsReminderResponse) (obj)).getUuid() == null ? getUuid() != null : !((EatsReminderResponse) (obj)).getUuid().equals(getUuid()))
            {
                return false;
            }
        }
        return true;
    }

    public final String getUuid()
    {
        return uuid;
    }

    public final int hashCode()
    {
        int i;
        if (uuid == null)
        {
            i = 0;
        } else
        {
            i = uuid.hashCode();
        }
        return i ^ 0xf4243;
    }

    final EatsReminderResponse setUuid(String s)
    {
        uuid = s;
        return this;
    }

    public final String toString()
    {
        return (new StringBuilder("EatsReminderResponse{uuid=")).append(uuid).append("}").toString();
    }
}
