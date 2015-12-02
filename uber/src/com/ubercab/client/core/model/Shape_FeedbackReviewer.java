// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;


// Referenced classes of package com.ubercab.client.core.model:
//            FeedbackReviewer

public final class Shape_FeedbackReviewer extends FeedbackReviewer
{

    private String type;

    Shape_FeedbackReviewer()
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
            obj = (FeedbackReviewer)obj;
            if (((FeedbackReviewer) (obj)).getType() == null ? getType() != null : !((FeedbackReviewer) (obj)).getType().equals(getType()))
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

    public final int hashCode()
    {
        int i;
        if (type == null)
        {
            i = 0;
        } else
        {
            i = type.hashCode();
        }
        return i ^ 0xf4243;
    }

    final FeedbackReviewer setType(String s)
    {
        type = s;
        return this;
    }

    public final String toString()
    {
        return (new StringBuilder("FeedbackReviewer{type=")).append(type).append("}").toString();
    }
}
