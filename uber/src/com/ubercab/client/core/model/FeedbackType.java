// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;

import java.util.List;

public final class FeedbackType
    implements com.ubercab.rider.realtime.model.FeedbackType
{

    private String description;
    private Integer id;
    private List images;
    private String type;

    public FeedbackType()
    {
    }

    public FeedbackType(String s)
    {
        description = s;
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (FeedbackType)obj;
            if (description == null ? ((FeedbackType) (obj)).description != null : !description.equals(((FeedbackType) (obj)).description))
            {
                return false;
            }
            if (id == null ? ((FeedbackType) (obj)).id != null : !id.equals(((FeedbackType) (obj)).id))
            {
                return false;
            }
            if (images == null ? ((FeedbackType) (obj)).images != null : !images.equals(((FeedbackType) (obj)).images))
            {
                return false;
            }
            if (type == null ? ((FeedbackType) (obj)).type != null : !type.equals(((FeedbackType) (obj)).type))
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

    public final Integer getId()
    {
        int i;
        if (id == null)
        {
            i = 0;
        } else
        {
            i = id.intValue();
        }
        return Integer.valueOf(i);
    }

    public final List getImages()
    {
        return images;
    }

    public final String getType()
    {
        return type;
    }

    public final int hashCode()
    {
        int l = 0;
        int i;
        int j;
        int k;
        if (id != null)
        {
            i = id.hashCode();
        } else
        {
            i = 0;
        }
        if (type != null)
        {
            j = type.hashCode();
        } else
        {
            j = 0;
        }
        if (description != null)
        {
            k = description.hashCode();
        } else
        {
            k = 0;
        }
        if (images != null)
        {
            l = images.hashCode();
        }
        return (k + (j + i * 31) * 31) * 31 + l;
    }

    public final void setDescription(String s)
    {
        description = s;
    }
}
