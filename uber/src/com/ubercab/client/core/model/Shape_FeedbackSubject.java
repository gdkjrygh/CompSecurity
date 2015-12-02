// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;


// Referenced classes of package com.ubercab.client.core.model:
//            FeedbackSubject

public final class Shape_FeedbackSubject extends FeedbackSubject
{

    private String type;
    private String uuid;

    Shape_FeedbackSubject()
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
            obj = (FeedbackSubject)obj;
            if (((FeedbackSubject) (obj)).getType() == null ? getType() != null : !((FeedbackSubject) (obj)).getType().equals(getType()))
            {
                return false;
            }
            if (((FeedbackSubject) (obj)).getUuid() == null ? getUuid() != null : !((FeedbackSubject) (obj)).getUuid().equals(getUuid()))
            {
                return false;
            }
        }
        return true;
    }

    public final String getType()
    {
        return type;
    }

    public final String getUuid()
    {
        return uuid;
    }

    public final int hashCode()
    {
        int j = 0;
        int i;
        if (type == null)
        {
            i = 0;
        } else
        {
            i = type.hashCode();
        }
        if (uuid != null)
        {
            j = uuid.hashCode();
        }
        return (i ^ 0xf4243) * 0xf4243 ^ j;
    }

    final FeedbackSubject setType(String s)
    {
        type = s;
        return this;
    }

    final FeedbackSubject setUuid(String s)
    {
        uuid = s;
        return this;
    }

    public final String toString()
    {
        return (new StringBuilder("FeedbackSubject{type=")).append(type).append(", uuid=").append(uuid).append("}").toString();
    }
}
