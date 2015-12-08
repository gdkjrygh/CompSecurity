// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.tropical;

import com.weather.util.maps.MapUtil;
import com.weather.util.ui.Dimension;

// Referenced classes of package com.weather.commons.tropical:
//            StormTrackImageFetcher

public static class scale
{

    final int imageHeight;
    final int imageWidth;
    final int scale;

    public boolean equals(Object obj)
    {
        boolean flag2 = true;
        boolean flag3 = false;
        boolean flag;
        if (this == obj)
        {
            flag = true;
        } else
        {
            flag = flag3;
            if (obj != null)
            {
                flag = flag3;
                if (getClass() == obj.getClass())
                {
                    obj = (scale)obj;
                    flag = flag3;
                    if (imageWidth == ((imageWidth) (obj)).imageWidth)
                    {
                        flag = flag3;
                        if (imageHeight == ((imageHeight) (obj)).imageHeight)
                        {
                            boolean flag1;
                            if (scale == ((scale) (obj)).scale)
                            {
                                flag1 = flag2;
                            } else
                            {
                                flag1 = false;
                            }
                            return flag1;
                        }
                    }
                }
            }
        }
        return flag;
    }

    public int hashCode()
    {
        return (imageWidth * 31 + imageHeight) * 31 + scale;
    }

    public String toString()
    {
        return (new StringBuilder()).append("ImageRequestParameters{imageWidth=").append(imageWidth).append(", imageHeight=").append(imageHeight).append(", scale=").append(scale).append('}').toString();
    }

    public (Dimension dimension, int i)
    {
        dimension = MapUtil.clip(dimension, i);
        imageWidth = dimension.getWidth();
        imageHeight = dimension.getHeight();
        scale = i;
    }
}
