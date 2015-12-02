// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;


// Referenced classes of package com.ubercab.client.core.model:
//            FeedbackTag

public final class Shape_FeedbackTag extends FeedbackTag
{

    private String description;
    private String uuid;

    Shape_FeedbackTag()
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
            obj = (FeedbackTag)obj;
            if (((FeedbackTag) (obj)).getDescription() == null ? getDescription() != null : !((FeedbackTag) (obj)).getDescription().equals(getDescription()))
            {
                return false;
            }
            if (((FeedbackTag) (obj)).getUuid() == null ? getUuid() != null : !((FeedbackTag) (obj)).getUuid().equals(getUuid()))
            {
                return false;
            }
        }
        return true;
    }

    public final String getDescription()
    {
        return description;
    }

    public final String getUuid()
    {
        return uuid;
    }

    public final int hashCode()
    {
        int j = 0;
        int i;
        if (description == null)
        {
            i = 0;
        } else
        {
            i = description.hashCode();
        }
        if (uuid != null)
        {
            j = uuid.hashCode();
        }
        return (i ^ 0xf4243) * 0xf4243 ^ j;
    }

    final FeedbackTag setDescription(String s)
    {
        description = s;
        return this;
    }

    final FeedbackTag setUuid(String s)
    {
        uuid = s;
        return this;
    }

    public final String toString()
    {
        return (new StringBuilder("com.ubercab.client.core.model.FeedbackTag{description=")).append(description).append(", uuid=").append(uuid).append("}").toString();
    }
}
