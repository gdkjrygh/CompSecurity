// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;

import com.ubercab.rider.realtime.model.Image;

public final class FeedbackImages
    implements Image
{

    private Integer height;
    private String url;
    private Integer width;

    public FeedbackImages()
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
            obj = (FeedbackImages)obj;
            if (height == null ? ((FeedbackImages) (obj)).height != null : !height.equals(((FeedbackImages) (obj)).height))
            {
                return false;
            }
            if (url == null ? ((FeedbackImages) (obj)).url != null : !url.equals(((FeedbackImages) (obj)).url))
            {
                return false;
            }
            if (width == null ? ((FeedbackImages) (obj)).width != null : !width.equals(((FeedbackImages) (obj)).width))
            {
                return false;
            }
        }
        return true;
    }

    public final int getHeight()
    {
        if (height == null)
        {
            return 0;
        } else
        {
            return height.intValue();
        }
    }

    public final String getUrl()
    {
        return url;
    }

    public final int getWidth()
    {
        if (width == null)
        {
            return 0;
        } else
        {
            return width.intValue();
        }
    }

    public final int hashCode()
    {
        int k = 0;
        int i;
        int j;
        if (height != null)
        {
            i = height.hashCode();
        } else
        {
            i = 0;
        }
        if (width != null)
        {
            j = width.hashCode();
        } else
        {
            j = 0;
        }
        if (url != null)
        {
            k = url.hashCode();
        }
        return (j + i * 31) * 31 + k;
    }
}
